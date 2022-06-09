package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import product.ProductService;

import java.io.IOException;

public class ProductsServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting GRPC server");
        Server server = ServerBuilder.forPort(9089).addService(new ProductService()).build();

        server.start();
        System.out.println("Server Started at " + server.getPort());
        server.awaitTermination();
    }
}
