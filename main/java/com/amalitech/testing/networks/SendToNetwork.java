package com.amalitech.testing.networks;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class SendToNetwork {
    public static void main(String[] args){
        sendNIO2();
//        sendTradition();
    }

    public static void sendNIO2() {
        try (SocketChannel socketChannel = SocketChannel.open()) {
            socketChannel.connect(new InetSocketAddress("localhost", 5000));

            Charset charset = StandardCharsets.UTF_8;
            CharsetEncoder encoder = charset.newEncoder();

            // Create messages
            String[] messages = {
                    "Message to be send to server",
                    "Another message to be send",
                    "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz01234AAAAAAAabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrsabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrsabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrs",
                    "Hakuna Matata from Ghana!"
            };

            // Send each message
            for (String message : messages) {
                // Add newline to simulate println()
                String messageWithNewline = message + "\n";

                // Convert string to CharBuffer
                CharBuffer charBuffer = CharBuffer.wrap(messageWithNewline);

                // Encode characters to bytes
                ByteBuffer buffer = encoder.encode(charBuffer);

                // Write the buffer to the channel
                while (buffer.hasRemaining()) {
                    socketChannel.write(buffer);
                }

                // Clear the buffer for next use (or create new one)
                buffer.clear();
            }

            // Important: Shutdown output to signal end of transmission
            // This helps the server know when to stop reading
            socketChannel.shutdownOutput();

            IO.println("All messages sent successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void sendTradition(){

        try(Socket socket = new Socket("localhost", 5000)) {
            // Get output stream
            OutputStream output = socket.getOutputStream();

            // Create writer WITHOUT autoflush
            PrintWriter printWriter = new PrintWriter(
                    new OutputStreamWriter(output, StandardCharsets.UTF_8)
            );

            printWriter.println("Message to be send to server");
            printWriter.println("Another message to be send");
            printWriter.flush();  // Force send

            // IMPORTANT: Shutdown output to signal end of transmission
            socket.shutdownOutput();

            IO.println("Messages sent, output shutdown");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
