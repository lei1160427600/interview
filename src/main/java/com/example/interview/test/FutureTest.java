package com.example.interview.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

/**
 * @author xiaolei
 * @Title: FutureTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/814:22
 */
public class FutureTest {

    private static volatile int a = 0;

    private synchronized static void increase() {
        a++;
    }

    public static void main(String[] args) {
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Callable<Integer> callable = () -> {
                for (int j = 0; j < 1000; j++) {
                    increase();
                }
                return a;
            };
            FutureTask<Integer> futureTask = new FutureTask<>(callable);
            futures.add(futureTask);
            Thread thread = new Thread(futureTask);
            thread.start();
        }
        int total = 0;
        futures.stream().filter(x -> x != null).collect(Collectors.toList());
        Future<Integer> future1 = futures.stream().findFirst().get();
        for (Future<Integer> future : futures) {
            try {
                int f = future.get();
                System.out.println("future:" + f);
                total = total + f;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("total:" + total);
        System.out.println("a:" + a);
    }
}
