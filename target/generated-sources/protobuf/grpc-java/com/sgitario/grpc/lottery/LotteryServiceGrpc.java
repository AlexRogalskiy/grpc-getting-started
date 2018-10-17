package com.sgitario.grpc.lottery;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: Lottery.proto")
public final class LotteryServiceGrpc {

  private LotteryServiceGrpc() {}

  public static final String SERVICE_NAME = "LotteryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Player,
      com.sgitario.grpc.lottery.Lottery.Empty> getEnterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enter",
      requestType = com.sgitario.grpc.lottery.Lottery.Player.class,
      responseType = com.sgitario.grpc.lottery.Lottery.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Player,
      com.sgitario.grpc.lottery.Lottery.Empty> getEnterMethod() {
    io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Player, com.sgitario.grpc.lottery.Lottery.Empty> getEnterMethod;
    if ((getEnterMethod = LotteryServiceGrpc.getEnterMethod) == null) {
      synchronized (LotteryServiceGrpc.class) {
        if ((getEnterMethod = LotteryServiceGrpc.getEnterMethod) == null) {
          LotteryServiceGrpc.getEnterMethod = getEnterMethod = 
              io.grpc.MethodDescriptor.<com.sgitario.grpc.lottery.Lottery.Player, com.sgitario.grpc.lottery.Lottery.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LotteryService", "enter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sgitario.grpc.lottery.Lottery.Player.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sgitario.grpc.lottery.Lottery.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LotteryServiceMethodDescriptorSupplier("enter"))
                  .build();
          }
        }
     }
     return getEnterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty,
      com.sgitario.grpc.lottery.Lottery.Player> getSeePlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "seePlayers",
      requestType = com.sgitario.grpc.lottery.Lottery.Empty.class,
      responseType = com.sgitario.grpc.lottery.Lottery.Player.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty,
      com.sgitario.grpc.lottery.Lottery.Player> getSeePlayersMethod() {
    io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty, com.sgitario.grpc.lottery.Lottery.Player> getSeePlayersMethod;
    if ((getSeePlayersMethod = LotteryServiceGrpc.getSeePlayersMethod) == null) {
      synchronized (LotteryServiceGrpc.class) {
        if ((getSeePlayersMethod = LotteryServiceGrpc.getSeePlayersMethod) == null) {
          LotteryServiceGrpc.getSeePlayersMethod = getSeePlayersMethod = 
              io.grpc.MethodDescriptor.<com.sgitario.grpc.lottery.Lottery.Empty, com.sgitario.grpc.lottery.Lottery.Player>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "LotteryService", "seePlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sgitario.grpc.lottery.Lottery.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sgitario.grpc.lottery.Lottery.Player.getDefaultInstance()))
                  .setSchemaDescriptor(new LotteryServiceMethodDescriptorSupplier("seePlayers"))
                  .build();
          }
        }
     }
     return getSeePlayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty,
      com.sgitario.grpc.lottery.Lottery.ListPlayers> getListPlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listPlayers",
      requestType = com.sgitario.grpc.lottery.Lottery.Empty.class,
      responseType = com.sgitario.grpc.lottery.Lottery.ListPlayers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty,
      com.sgitario.grpc.lottery.Lottery.ListPlayers> getListPlayersMethod() {
    io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty, com.sgitario.grpc.lottery.Lottery.ListPlayers> getListPlayersMethod;
    if ((getListPlayersMethod = LotteryServiceGrpc.getListPlayersMethod) == null) {
      synchronized (LotteryServiceGrpc.class) {
        if ((getListPlayersMethod = LotteryServiceGrpc.getListPlayersMethod) == null) {
          LotteryServiceGrpc.getListPlayersMethod = getListPlayersMethod = 
              io.grpc.MethodDescriptor.<com.sgitario.grpc.lottery.Lottery.Empty, com.sgitario.grpc.lottery.Lottery.ListPlayers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LotteryService", "listPlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sgitario.grpc.lottery.Lottery.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sgitario.grpc.lottery.Lottery.ListPlayers.getDefaultInstance()))
                  .setSchemaDescriptor(new LotteryServiceMethodDescriptorSupplier("listPlayers"))
                  .build();
          }
        }
     }
     return getListPlayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty,
      com.sgitario.grpc.lottery.Lottery.Player> getPickWinnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pickWinner",
      requestType = com.sgitario.grpc.lottery.Lottery.Empty.class,
      responseType = com.sgitario.grpc.lottery.Lottery.Player.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty,
      com.sgitario.grpc.lottery.Lottery.Player> getPickWinnerMethod() {
    io.grpc.MethodDescriptor<com.sgitario.grpc.lottery.Lottery.Empty, com.sgitario.grpc.lottery.Lottery.Player> getPickWinnerMethod;
    if ((getPickWinnerMethod = LotteryServiceGrpc.getPickWinnerMethod) == null) {
      synchronized (LotteryServiceGrpc.class) {
        if ((getPickWinnerMethod = LotteryServiceGrpc.getPickWinnerMethod) == null) {
          LotteryServiceGrpc.getPickWinnerMethod = getPickWinnerMethod = 
              io.grpc.MethodDescriptor.<com.sgitario.grpc.lottery.Lottery.Empty, com.sgitario.grpc.lottery.Lottery.Player>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LotteryService", "pickWinner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sgitario.grpc.lottery.Lottery.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sgitario.grpc.lottery.Lottery.Player.getDefaultInstance()))
                  .setSchemaDescriptor(new LotteryServiceMethodDescriptorSupplier("pickWinner"))
                  .build();
          }
        }
     }
     return getPickWinnerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LotteryServiceStub newStub(io.grpc.Channel channel) {
    return new LotteryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LotteryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LotteryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LotteryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LotteryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LotteryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void enter(com.sgitario.grpc.lottery.Lottery.Player request,
        io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterMethod(), responseObserver);
    }

    /**
     */
    public void seePlayers(com.sgitario.grpc.lottery.Lottery.Empty request,
        io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Player> responseObserver) {
      asyncUnimplementedUnaryCall(getSeePlayersMethod(), responseObserver);
    }

    /**
     */
    public void listPlayers(com.sgitario.grpc.lottery.Lottery.Empty request,
        io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.ListPlayers> responseObserver) {
      asyncUnimplementedUnaryCall(getListPlayersMethod(), responseObserver);
    }

    /**
     */
    public void pickWinner(com.sgitario.grpc.lottery.Lottery.Empty request,
        io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Player> responseObserver) {
      asyncUnimplementedUnaryCall(getPickWinnerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sgitario.grpc.lottery.Lottery.Player,
                com.sgitario.grpc.lottery.Lottery.Empty>(
                  this, METHODID_ENTER)))
          .addMethod(
            getSeePlayersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.sgitario.grpc.lottery.Lottery.Empty,
                com.sgitario.grpc.lottery.Lottery.Player>(
                  this, METHODID_SEE_PLAYERS)))
          .addMethod(
            getListPlayersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sgitario.grpc.lottery.Lottery.Empty,
                com.sgitario.grpc.lottery.Lottery.ListPlayers>(
                  this, METHODID_LIST_PLAYERS)))
          .addMethod(
            getPickWinnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sgitario.grpc.lottery.Lottery.Empty,
                com.sgitario.grpc.lottery.Lottery.Player>(
                  this, METHODID_PICK_WINNER)))
          .build();
    }
  }

  /**
   */
  public static final class LotteryServiceStub extends io.grpc.stub.AbstractStub<LotteryServiceStub> {
    private LotteryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LotteryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LotteryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LotteryServiceStub(channel, callOptions);
    }

    /**
     */
    public void enter(com.sgitario.grpc.lottery.Lottery.Player request,
        io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seePlayers(com.sgitario.grpc.lottery.Lottery.Empty request,
        io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Player> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSeePlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPlayers(com.sgitario.grpc.lottery.Lottery.Empty request,
        io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.ListPlayers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pickWinner(com.sgitario.grpc.lottery.Lottery.Empty request,
        io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Player> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPickWinnerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LotteryServiceBlockingStub extends io.grpc.stub.AbstractStub<LotteryServiceBlockingStub> {
    private LotteryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LotteryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LotteryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LotteryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sgitario.grpc.lottery.Lottery.Empty enter(com.sgitario.grpc.lottery.Lottery.Player request) {
      return blockingUnaryCall(
          getChannel(), getEnterMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.sgitario.grpc.lottery.Lottery.Player> seePlayers(
        com.sgitario.grpc.lottery.Lottery.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getSeePlayersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sgitario.grpc.lottery.Lottery.ListPlayers listPlayers(com.sgitario.grpc.lottery.Lottery.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListPlayersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sgitario.grpc.lottery.Lottery.Player pickWinner(com.sgitario.grpc.lottery.Lottery.Empty request) {
      return blockingUnaryCall(
          getChannel(), getPickWinnerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LotteryServiceFutureStub extends io.grpc.stub.AbstractStub<LotteryServiceFutureStub> {
    private LotteryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LotteryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LotteryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LotteryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sgitario.grpc.lottery.Lottery.Empty> enter(
        com.sgitario.grpc.lottery.Lottery.Player request) {
      return futureUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sgitario.grpc.lottery.Lottery.ListPlayers> listPlayers(
        com.sgitario.grpc.lottery.Lottery.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListPlayersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sgitario.grpc.lottery.Lottery.Player> pickWinner(
        com.sgitario.grpc.lottery.Lottery.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getPickWinnerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTER = 0;
  private static final int METHODID_SEE_PLAYERS = 1;
  private static final int METHODID_LIST_PLAYERS = 2;
  private static final int METHODID_PICK_WINNER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LotteryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LotteryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER:
          serviceImpl.enter((com.sgitario.grpc.lottery.Lottery.Player) request,
              (io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Empty>) responseObserver);
          break;
        case METHODID_SEE_PLAYERS:
          serviceImpl.seePlayers((com.sgitario.grpc.lottery.Lottery.Empty) request,
              (io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Player>) responseObserver);
          break;
        case METHODID_LIST_PLAYERS:
          serviceImpl.listPlayers((com.sgitario.grpc.lottery.Lottery.Empty) request,
              (io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.ListPlayers>) responseObserver);
          break;
        case METHODID_PICK_WINNER:
          serviceImpl.pickWinner((com.sgitario.grpc.lottery.Lottery.Empty) request,
              (io.grpc.stub.StreamObserver<com.sgitario.grpc.lottery.Lottery.Player>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LotteryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LotteryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sgitario.grpc.lottery.Lottery.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LotteryService");
    }
  }

  private static final class LotteryServiceFileDescriptorSupplier
      extends LotteryServiceBaseDescriptorSupplier {
    LotteryServiceFileDescriptorSupplier() {}
  }

  private static final class LotteryServiceMethodDescriptorSupplier
      extends LotteryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LotteryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LotteryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LotteryServiceFileDescriptorSupplier())
              .addMethod(getEnterMethod())
              .addMethod(getSeePlayersMethod())
              .addMethod(getListPlayersMethod())
              .addMethod(getPickWinnerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
