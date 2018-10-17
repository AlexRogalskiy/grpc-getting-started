package org.sgitario.grpc;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import java.util.stream.Stream;

import com.sgitario.grpc.lottery.Lottery.Empty;
import com.sgitario.grpc.lottery.Lottery.ListPlayers;
import com.sgitario.grpc.lottery.Lottery.Player;
import com.sgitario.grpc.lottery.LotteryServiceGrpc.LotteryServiceImplBase;

import io.grpc.stub.StreamObserver;

public class LotteryService extends LotteryServiceImplBase {

	private static final Logger LOG = Logger.getLogger(LotteryService.class.getName());

	private static Set<StreamObserver<Player>> observers = ConcurrentHashMap.newKeySet();

	private final Set<Player> players = new HashSet<>();

	@Override
	public void enter(Player request, StreamObserver<Empty> responseObserver) {
		LOG.info("New player: " + request.getName());
		players.add(request);
		observers.forEach(o -> o.onNext(request));
		responseObserver.onNext(Empty.getDefaultInstance());
		responseObserver.onCompleted();
	}

	@Override
	public void listPlayers(Empty request, StreamObserver<ListPlayers> responseObserver) {
		responseObserver.onNext(ListPlayers.newBuilder().addAllPlayers(players).build());
		responseObserver.onCompleted();
	}

	@Override
	public void pickWinner(Empty request, StreamObserver<Player> responseObserver) {
		observers.forEach(o -> o.onCompleted());
		observers.clear();

		Random rnd = new Random(new Date().getTime());
		int winner = rnd.nextInt(players.size());
		Iterator<Player> it = players.iterator();
		Stream.iterate(0, i -> i + 1).limit(winner).forEach(i -> it.next());
		players.clear();
		responseObserver.onNext(it.next());
		responseObserver.onCompleted();
	}

	@Override
	public void seePlayers(Empty request, StreamObserver<Player> responseObserver) {
		players.forEach(responseObserver::onNext);
		observers.add(responseObserver);
	}

}
