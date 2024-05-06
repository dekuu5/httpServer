package com.server.coreServer;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketManger implements Runnable{
    private ServerSocket serverSocket;

    public SocketManger() {
    }

    public void listen(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    @Override
    public void run() {

    }
}
