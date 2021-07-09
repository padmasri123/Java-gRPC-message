package com.filesgen.grpcHelloWorld;

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
    comments = "Source: filesending.proto")
public final class FileServiceGrpc {

  private FileServiceGrpc() {}

  public static final String SERVICE_NAME = "com.filesgen.grpcHelloWorld.FileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.filesgen.grpcHelloWorld.FileRequest,
      com.filesgen.grpcHelloWorld.FileResponse> getFilegettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "filegetting",
      requestType = com.filesgen.grpcHelloWorld.FileRequest.class,
      responseType = com.filesgen.grpcHelloWorld.FileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.filesgen.grpcHelloWorld.FileRequest,
      com.filesgen.grpcHelloWorld.FileResponse> getFilegettingMethod() {
    io.grpc.MethodDescriptor<com.filesgen.grpcHelloWorld.FileRequest, com.filesgen.grpcHelloWorld.FileResponse> getFilegettingMethod;
    if ((getFilegettingMethod = FileServiceGrpc.getFilegettingMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getFilegettingMethod = FileServiceGrpc.getFilegettingMethod) == null) {
          FileServiceGrpc.getFilegettingMethod = getFilegettingMethod = 
              io.grpc.MethodDescriptor.<com.filesgen.grpcHelloWorld.FileRequest, com.filesgen.grpcHelloWorld.FileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.filesgen.grpcHelloWorld.FileService", "filegetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.filesgen.grpcHelloWorld.FileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.filesgen.grpcHelloWorld.FileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("filegetting"))
                  .build();
          }
        }
     }
     return getFilegettingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileServiceStub newStub(io.grpc.Channel channel) {
    return new FileServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FileServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void filegetting(com.filesgen.grpcHelloWorld.FileRequest request,
        io.grpc.stub.StreamObserver<com.filesgen.grpcHelloWorld.FileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFilegettingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFilegettingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.filesgen.grpcHelloWorld.FileRequest,
                com.filesgen.grpcHelloWorld.FileResponse>(
                  this, METHODID_FILEGETTING)))
          .build();
    }
  }

  /**
   */
  public static final class FileServiceStub extends io.grpc.stub.AbstractStub<FileServiceStub> {
    private FileServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileServiceStub(channel, callOptions);
    }

    /**
     */
    public void filegetting(com.filesgen.grpcHelloWorld.FileRequest request,
        io.grpc.stub.StreamObserver<com.filesgen.grpcHelloWorld.FileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFilegettingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FileServiceBlockingStub extends io.grpc.stub.AbstractStub<FileServiceBlockingStub> {
    private FileServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.filesgen.grpcHelloWorld.FileResponse filegetting(com.filesgen.grpcHelloWorld.FileRequest request) {
      return blockingUnaryCall(
          getChannel(), getFilegettingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileServiceFutureStub extends io.grpc.stub.AbstractStub<FileServiceFutureStub> {
    private FileServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.filesgen.grpcHelloWorld.FileResponse> filegetting(
        com.filesgen.grpcHelloWorld.FileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFilegettingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FILEGETTING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FILEGETTING:
          serviceImpl.filegetting((com.filesgen.grpcHelloWorld.FileRequest) request,
              (io.grpc.stub.StreamObserver<com.filesgen.grpcHelloWorld.FileResponse>) responseObserver);
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

  private static abstract class FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.filesgen.grpcHelloWorld.Filesending.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileService");
    }
  }

  private static final class FileServiceFileDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier {
    FileServiceFileDescriptorSupplier() {}
  }

  private static final class FileServiceMethodDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileServiceFileDescriptorSupplier())
              .addMethod(getFilegettingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
