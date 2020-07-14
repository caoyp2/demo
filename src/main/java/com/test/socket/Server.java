package com.test.socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocketsocket = new ServerSocket(6666);
            while(true){
                Socket socket= serverSocketsocket.accept();
                BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                int len = 0;
                byte[] bytes = new byte[1024];
                while((len = bis.read(bytes)) != -1){
                    String msg = new String(bytes,0,len);
                    System.out.println(msg);
                }
                bis.close();
                socket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
