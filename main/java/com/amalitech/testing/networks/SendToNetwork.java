package com.amalitech.testing.networks;

import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class SendToNetwork {
    public static void main(String[] args){
        SocketAddress socketAddress = new InetSocketAddress("localhost", 5000);

        try(SocketChannel socketChannel = SocketChannel.open(socketAddress);
            Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);){

            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.println("Message to be send to server");
            printWriter.println("Another message to be send");


            printWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
