package com.amalitech.headfirstjava.networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

public class ReceiveFromNetwork {
    public static void main(String[] args){
        receiveNIO2();
//        receiveTradition();
    }


    public static void receiveNIO2(){
        SocketAddress socketAddress = new InetSocketAddress("localhost", 5000);

        try(SocketChannel socketChannel = SocketChannel.open(socketAddress);
//            Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8); Traditional style
            ){

            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            CharsetDecoder decoder = charset.newDecoder();

//            BufferedReader bufferedReader = new BufferedReader(reader); Traditonal
            IO.println("IS OPEN: " + socketChannel.isOpen());

//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                IO.println(line);
//            }

            while (socketChannel.read(buffer) != -1 ){
//                buffer.flip();

                CharBuffer charBuffer = decoder.decode(buffer);

                IO.println("Received: " + charBuffer);

                buffer.clear();
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
