    package com.amalitech.testing.networks;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.net.ServerSocket;
    import java.net.Socket;

    public class TestingServer {

        public static void main(){
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
