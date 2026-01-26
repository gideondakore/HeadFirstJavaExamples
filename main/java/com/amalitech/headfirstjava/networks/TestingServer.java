    package com.amalitech.headfirstjava.networks;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.net.InetSocketAddress;
    import java.net.ServerSocket;
    import java.net.Socket;
    import java.nio.ByteBuffer;
    import java.nio.CharBuffer;
    import java.nio.channels.ServerSocketChannel;
    import java.nio.channels.SocketChannel;
    import java.nio.charset.Charset;
    import java.nio.charset.CharsetDecoder;
    import java.nio.charset.StandardCharsets;

    public class TestingServer {

        public static void main(){
//            serverTradition();
            serverNIO();
        }

        public static void serverNIO(){
            try{

            // 1. ServerSocketChannel instead of ServerSocket
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            serverChannel.bind(new InetSocketAddress(5000));


//            IO.println("Server started on port 5000");

            // 2. Accept connection (returns SocketChannel instead of Socket)

            IO.println("Server is running");
            SocketChannel clientChannel = serverChannel.accept(); //Blocking
            IO.println("Sever is connected successfully!");
//            IO.println("Client connected");

            // 3. ByteBuffer instead of InputStream
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // 4. CharsetDecoder instead of InputStreamReader
            Charset charset = StandardCharsets.UTF_8;
            CharsetDecoder decoder = charset.newDecoder();

            // Read data
//            StringBuilder message = new StringBuilder();
            while (clientChannel.read(buffer) != -1) {
//                IO.println("BUFFER FIRST: " + buffer);
                buffer.flip();  // Switch from writing to reading mode

                // Decode bytes to characters
                CharBuffer charBuffer = decoder.decode(buffer);

                IO.println("Received: " + charBuffer);

//                IO.println("CHARACTER BUFFER: " + charBuffer);

//                message.append(charBuffer);

//                IO.println("STRING BUFFER: " + message);


                buffer.clear();  // Clear buffer for next read

//                IO.println("BUFFER AFTER CLEARED: " + buffer);

                // Check for newline (simulating readLine())
//                String content = message.toString();

//                IO.println(content);

//                IO.println("CONTENT: " + content.indexOf("\n"));
//                if (content.contains("\n")) {
//                    String line = content.substring(0, content.indexOf("\n"));
//                    IO.println("Received: " + line);
//                    message = new StringBuilder(content.substring(content.indexOf("\n") + 1));
////                    IO.println("MESSAGE: " + message);
//                }else{
//                    IO.println("Received: " + message);
//                }
            }

//            IO.println("STRING BUILDER: "+ message);

            clientChannel.close();
            serverChannel.close();

//            clientChannel.shutdownInput();


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void serverTradition(){
            try( ServerSocket serverSocket = new ServerSocket(5000);){
                IO.println("Starting server port on 5000");

                IO.println("Waiting for client to connect...");

                Socket socket = serverSocket.accept();

                IO.println("Client connected from: " + socket.getInetAddress().getHostAddress());


                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String line;
                while((line = reader.readLine()) != null){
                    IO.println("Recieve: " + line);
                }


                // Clean up
                reader.close();
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //nmcli -s connection show "TRAINING"