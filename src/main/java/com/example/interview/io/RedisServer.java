package com.example.interview.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xiaolei
 * @Title: RedisServer
 * @ProjectName interview
 * @Description: TODO
 * @date 4/14/20208:10 PM
 */
public class RedisServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        while (true){
            Socket socket = serverSocket.accept();//阻塞方法
            System.out.println("come in ======");

            byte[] bytes = new byte[1024];
            socket.getInputStream().read(bytes);//阻塞方法

            System.out.println("receive =======" + new String(bytes));


        }
    }
}
