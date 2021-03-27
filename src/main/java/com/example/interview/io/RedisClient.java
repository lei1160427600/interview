package com.example.interview.io;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author xiaolei
 * @Title: RedisClient
 * @ProjectName interview
 * @Description: TODO
 * @date 4/14/20208:10 PM
 */
public class RedisClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9090);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        socket.getOutputStream().write(s.getBytes());
        socket.close();
    }
}
