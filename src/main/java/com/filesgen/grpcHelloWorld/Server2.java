package com.filesgen.grpcHelloWorld;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Server2 {
        public static void main(String[] args) throws Exception {
            io.grpc.Server server = ServerBuilder.forPort(8000)
                    .addService(new FileServiceImpl())
                    .build();
            server.start();
            System.out.println("Server started at port 8000");
            server.awaitTermination();
        }
        static class FileServiceImpl extends FileServiceGrpc.FileServiceImplBase {
            @Override
            public void filegetting(FileRequest request, StreamObserver<FileResponse> responseObserver) {
                // System.out.println(request);

                System.out.println("Received FileRequest with id "+request.getId());
                FileResponse response = FileResponse.newBuilder()
                        .setReply(request.getId())
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        }

    }

