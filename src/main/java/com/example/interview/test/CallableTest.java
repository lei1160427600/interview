package com.example.interview.test;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author xiaolei
 * @Title: CallableTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/621:49
 */
public class CallableTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("current thread:"+Thread.currentThread().getName());
        return 100;
    }
}
