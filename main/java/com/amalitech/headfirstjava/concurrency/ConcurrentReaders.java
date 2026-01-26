package com.amalitech.headfirstjava.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentReaders {

    public static void main(String[] args){
        List<Chat> chatHistory = new ArrayList<>();
        try(ExecutorService executor = Executors.newFixedThreadPool(3);){
            for(int i = 0; i < 5; i++){
                executor.execute(() -> chatHistory.add(new Chat("Hi there!"))); // Writing thread
                executor.execute(() -> System.out.println("FIRST READ: " + chatHistory)); // Reading thread
                executor.execute(() -> System.out.println("SECOND READ: " + chatHistory)); // Reading thread
            }
            executor.shutdown();
        }

//        for(Chat chat : chatHistory){
//            System.out.println(chat.toString());
//        }

//        chatHistory.forEach(chat -> System.out.println(chat.toString()));

//        System.out.println(chatHistory);

    }

}


