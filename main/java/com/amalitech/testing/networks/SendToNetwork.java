package com.amalitech.testing.networks;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class SendToNetwork {
    public static void main(String[] args){
//        sendNIO2();
        sendTradition();
    }

    public static void sendNIO2(){
        SocketAddress socketAddress = new InetSocketAddress("localhost", 5000);

        try(SocketChannel socketChannel = SocketChannel.open(socketAddress); // uses New NIO API
            Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);){

            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.println("Message to be send to server");
            printWriter.println("Another message to be send");


            printWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void sendTradition(){

        try(Socket socket = new Socket("localhost", 5000)){
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            printWriter.println("Message to be send to server");
            printWriter.println("Another message to be send");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
