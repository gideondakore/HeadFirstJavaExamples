package com.amalitech.testing.networks;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

public class FirstNetWork {

    public static void main(String[] args){
        InetSocketAddress serverAddress = new InetSocketAddress("example.com", 80);


        try(SocketChannel socketChannel = SocketChannel.open()){

            socketChannel.connect(serverAddress);

            socketChannel.finishConnect();

            IO.println("CHECKING CONNECTION STATUS: " + socketChannel.isConnected());
            IO.println("CHECKING CONNECTION LOCAL ADDRESS: " + socketChannel.getLocalAddress());
            IO.println("CHECKING CONNECTION REMOTE ADDRESS: " + socketChannel.getRemoteAddress());
//            IO.println("CHECKING CONNECTION LOCAL ADDRESS: " + socketChannel.);



        }catch (IOException ex){
            ex.printStackTrace();
        }


    }
}
