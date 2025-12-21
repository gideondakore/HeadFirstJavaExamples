package com.amalitech.testing.networks;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

public class FirstNetWork {

    public static void main(String[] args){
        InetSocketAddress serverAddress = new InetSocketAddress("example.com", 80);

        try (SocketChannel socketChannel = SocketChannel.open(serverAddress)) {

            
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
