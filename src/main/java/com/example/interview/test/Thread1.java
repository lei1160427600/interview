package com.example.interview.test;

/**
 * @author xiaolei
 * @Title: Thread1
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/616:02
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        String a = "q" + "w" + "e";
        System.out.println(this.getName());
        System.out.println(Thread.currentThread().getName() + "正在执行。。。。。。。。。");
    }
}
