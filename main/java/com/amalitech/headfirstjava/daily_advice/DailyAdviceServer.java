package com.amalitech.headfirstjava.daily_advice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

import java.util.Random;

public class DailyAdviceServer {
    private final String[] adviceList = {
            "Take smaller bites",
            "Go for the tight jeans. No they do NOT make you look fat.",
            "One word: inappropriate",
            "Just for today, be honest. Tell your boss what you *really* think",
            "You might want to rethink that haircut."
    };

    private final Random random = new Random();

    public void go(){

        try(ServerSocketChannel serverChannel = ServerSocketChannel.open()){
            IO.println("Server is listening on port 5000");
            serverChannel.bind(new InetSocketAddress("localhost", 5000));

            while(serverChannel.isOpen()){
                SocketChannel clientChannel = serverChannel.accept();
                IO.println("Connection is established successfully!");

                PrintWriter writer = new PrintWriter(Channels.newOutputStream(clientChannel));

                String advice = getAdvice();
                writer.println(advice);
                writer.close();

                IO.println(advice);
            }

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    private String getAdvice(){
        return adviceList[random.nextInt(adviceList.length)];
    }

    public static void main(){
        new DailyAdviceServer().go();
    }
}
