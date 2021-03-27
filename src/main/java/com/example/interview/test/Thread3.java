package com.example.interview.test;

import io.swagger.models.auth.In;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.logging.Filter;

/**
 * @author xiaolei
 * @Title: Thread3
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/80:14
 */
public class Thread3 {
    public static void main(String[] args){
        Callable callableTest = new CallableTest();
        FutureTask<Integer> futureTask = new FutureTask<>(callableTest);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
