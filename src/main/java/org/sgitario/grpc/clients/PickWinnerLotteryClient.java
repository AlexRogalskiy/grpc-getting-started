package org.sgitario.grpc.clients;

import java.io.IOException;

import org.sgitario.grpc.LotteryClient;

import com.sgitario.grpc.lottery.Lottery.Empty;
import com.sgitario.grpc.lottery.Lottery.Player;

public class PickWinnerLotteryClient {

	public static void main(String[] args) throws InterruptedException, IOException {
		LotteryClient client = new LotteryClient();
		Player winner = client.blocking().pickWinner(Empty.getDefaultInstance());
		System.out.println("The winner is: " + winner.getName());
	}
}
