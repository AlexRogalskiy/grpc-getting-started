package org.sgitario.grpc;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LotteryServer {
	public static final int PORT = 9090;

	public static void main(String[] args) throws InterruptedException, IOException {
		Server server = ServerBuilder.forPort(PORT).addService(new LotteryService()).build();
		server.start();
		System.out.println("Lottery server at localhost:9090");
		server.awaitTermination();
	}
}
