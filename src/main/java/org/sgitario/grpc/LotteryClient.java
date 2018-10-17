package org.sgitario.grpc;

import com.sgitario.grpc.lottery.LotteryServiceGrpc;
import com.sgitario.grpc.lottery.LotteryServiceGrpc.LotteryServiceBlockingStub;
import com.sgitario.grpc.lottery.LotteryServiceGrpc.LotteryServiceStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LotteryClient {

	private final ManagedChannel channel;

	public LotteryClient() {
		channel = ManagedChannelBuilder.forAddress("localhost", LotteryServer.PORT).usePlaintext().build();
	}

	public LotteryServiceStub async() {
		return LotteryServiceGrpc.newStub(channel);
	}

	public LotteryServiceBlockingStub blocking() {
		return LotteryServiceGrpc.newBlockingStub(channel);
	}
}
