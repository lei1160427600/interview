package com.example.interview.test;

/**
 * @author xiaolei
 * @Title: Thread2
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/616:04
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。。。。。");
    }
}
