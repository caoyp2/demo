package com.test.socket;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",6666);
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            bos.write("hello server".getBytes());
            bos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
