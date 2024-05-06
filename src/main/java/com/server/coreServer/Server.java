package com.server.coreServer;

import java.io.IOException;

public class Server {
    private final int port;


    public Server(int port) {
        this.port = port;
    }

    public void start() {
        try {
            SocketManger socketManger =  new SocketManger();
            socketManger.listen(port);
            System.out.println("Server started on port " + port);
            new Thread(socketManger).start();
        } catch (IOException e) {
            throw new RuntimeException("port " + port + "is used", e);
        }
    }
}
