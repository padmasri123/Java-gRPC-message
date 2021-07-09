package com.createfiles.grpcHelloWorld;
import com.google.protobuf.util.JsonFormat;

import com.filesgen.grpcHelloWorld.FileRequest;
import com.filesgen.grpcHelloWorld.FileResponse;
import com.filesgen.grpcHelloWorld.FileServiceGrpc;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Server1 {

    public static void main(String[] args) throws Exception {
        io.grpc.Server server = ServerBuilder.forPort(9000)
                .addService(new GreetingServiceImpl())
                .build();
        server.start();
        System.out.println("Server started at 50051");
        server.awaitTermination();
    }
    public static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
    static class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
        @Override public void greeting(HelloRequest request1,
                                       StreamObserver<HelloResponse> responseObserver) {
            final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8000")
                    .usePlaintext()
                    .build();

            FileServiceGrpc.FileServiceBlockingStub stub = FileServiceGrpc.newBlockingStub(channel);

            FileRequest.Builder request =
                    FileRequest.newBuilder();

            String file = "src/test/resources/myFile.json";
            String json = null;
            try {
                json = readFileAsString(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                JsonFormat.parser().ignoringUnknownFields().merge(json, request);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
            FileRequest value = request.build();

            FileResponse response = stub.filegetting(value);
            String res = response.getReply();
            System.out.println("Got Response id :" + res);
            channel.shutdownNow();

            System.out.println("Received Request");
            HelloResponse response1 = HelloResponse.newBuilder()
                    .setGreeting("Hello there, " + request1.getName())
                    .build();
            responseObserver.onNext(response1);
            responseObserver.onCompleted();
        }
    }
}