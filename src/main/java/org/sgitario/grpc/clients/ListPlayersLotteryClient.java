package org.sgitario.grpc.clients;

import java.io.IOException;

import org.sgitario.grpc.LotteryClient;

import com.sgitario.grpc.lottery.Lottery.Empty;

public class ListPlayersLotteryClient {

	public static void main(String[] args) throws InterruptedException, IOException {
		LotteryClient client = new LotteryClient();
		client.blocking().listPlayers(Empty.getDefaultInstance()).getPlayersList()
				.forEach(p -> System.out.println(p.getName()));
	}
}
