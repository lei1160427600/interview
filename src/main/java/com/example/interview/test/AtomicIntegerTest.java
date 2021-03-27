package com.example.interview.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiaolei
 * @Title: AtomicIntegerTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/723:31
 */
public class AtomicIntegerTest {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void increase() {
        atomicInteger.incrementAndGet();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Runnable runnable = () -> {
                for (int j = 0; j < 1000; j++) {
                    increase();
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println("total :" + atomicInteger.intValue());
    }
}
