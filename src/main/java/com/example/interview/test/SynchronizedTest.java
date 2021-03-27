package com.example.interview.test;

/**
 * @author xiaolei
 * @Title: SynchronizedTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/722:23
 */
public class SynchronizedTest {
    public static int a = 0;
    public static void main(String[] args){
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        increase();
                    }
                }
            });
            thread.start();
        }
        System.out.println("total thread :" + Thread.activeCount());
        while (Thread.activeCount() > 2)
            Thread.yield();
        System.out.println("total a :" + a);
    }
    public synchronized static void increase(){
        a++;
    }
}
