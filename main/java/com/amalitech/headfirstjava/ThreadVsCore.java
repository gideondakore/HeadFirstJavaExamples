package com.amalitech.headfirstjava;

public class ThreadVsCore {
    public static void main(String[] args) {
        // Check how many cores your system has
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available cores: " + cores);
        // Example output: Available cores: 8 (4 physical, 8 with hyper-threading)

        // Create more threads than cores
        for (int i = 0; i < 20; i++) {
            int threadNum = i;
            new Thread(() -> {
                System.out.println("Thread " + threadNum +
                        " running on: " +
                        Thread.currentThread().getName());
                // Simulate work
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }).start();
        }

        // 20 threads created, but only 8 cores available
        // OS will schedule them to share the cores
    }
}
