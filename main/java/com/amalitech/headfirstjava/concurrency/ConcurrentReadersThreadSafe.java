package com.amalitech.headfirstjava.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentReadersThreadSafe {

    public static void main(String[] args){
        // CopyOnWriteArrayList is a thread safe data structures.
        // CopyOnWriteArrayList is a reasonable choice when you have a List that is being read a lot, but not changed very often
        // CopyOnWriteArrayList uses immutability to provide safe access for reading threads while other threads are writing.

        List<Chat> chatHistory = new CopyOnWriteArrayList<>();
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
