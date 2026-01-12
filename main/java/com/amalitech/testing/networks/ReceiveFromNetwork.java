package com.amalitech.testing.networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class ReceiveFromNetwork {
    public static void main(String[] args){
//        receiveNIO2();
        receiveTradition();
    }


    public static void receiveNIO2(){
        SocketAddress socketAddress = new InetSocketAddress("localhost", 5000);

        try(SocketChannel socketChannel = SocketChannel.open(socketAddress);
            Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);){

            System.out.println("IS OPEN: " + socketChannel.isOpen());

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                IO.println(line);
            }


        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void receiveTradition(){
        try(Socket socket = new Socket("localhost", 5000)){

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while((line = reader.readLine()) != null){
                IO.println("Received: " + line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
