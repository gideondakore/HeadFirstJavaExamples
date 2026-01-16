package com.amalitech.testing.dailyAdvice;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

public class DailyAdviceServer {

    public void go(){

        try(ServerSocketChannel socketChannel = ServerSocketChannel.open()){
            IO.println("Server is listening on port 5000");
            socketChannel.bind(new InetSocketAddress("localhost", 5000));

            SocketChannel clientChannel = socketChannel.accept();
            IO.println("Connection is established successfully!");

            Charset charset = StandardCharsets.UTF_8;

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            CharsetDecoder charsetDecoder = charset.newDecoder();


            if(clientChannel.read(buffer) != -1){
                buffer.flip();

                CharBuffer charBuffer = charsetDecoder.decode(buffer);

                IO.println("Receive: " + charBuffer);
            }


        }catch(IOException ex){
            ex.printStackTrace();
        }
    }


    public static void main(){
        new DailyAdviceServer().go();
    }
}
