package org.sgitario.grpc.clients;

import java.io.IOException;

import org.sgitario.grpc.LotteryClient;

import com.sgitario.grpc.lottery.Lottery.Empty;
import com.sgitario.grpc.lottery.Lottery.Player;

import io.grpc.stub.StreamObserver;

public class SeePlayersLotteryClient {

	public static void main(String[] args) throws InterruptedException, IOException {
		LotteryClient client = new LotteryClient();
		client.async().seePlayers(Empty.getDefaultInstance(), new StreamObserver<Player>() {

			@Override
			public void onCompleted() {
				System.out.println("Lottery is completed");
			}

			@Override
			public void onError(Throwable t) {
				System.out.println("Error: " + t);
			}

			@Override
			public void onNext(Player value) {
				System.out.println("New player: " + value.getName());

			}
		});

		Thread.sleep(1000000);
	}
}
