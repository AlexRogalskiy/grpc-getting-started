package org.sgitario.grpc.clients;

import java.io.IOException;
import java.util.UUID;

import org.sgitario.grpc.LotteryClient;

import com.sgitario.grpc.lottery.Lottery.Player;

public class EnterLotteryClient {

	public static void main(String[] args) throws InterruptedException, IOException {
		LotteryClient client = new LotteryClient();
		String clientName = UUID.randomUUID().toString();
		client.blocking().enter(Player.newBuilder().setName(clientName).build());
	}
}
