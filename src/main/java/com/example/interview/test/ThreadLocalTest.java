package com.example.interview.test;

/**
 * @author xiaolei
 * @Title: ThreadLocalTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/1222:16
 */
public class ThreadLocalTest {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void print(String s) {
        //打印当前线程中本地内存中本地变量的值
        System.out.println(s + " :" + threadLocal.get());
        //清除本地内存中的本地变量
        threadLocal.remove();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("value1");
                print("thread1");
                System.out.println("after remove : " + threadLocal.get());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("value2");
                print("thread2");
                System.out.println("after remove : " + threadLocal.get());
            }
        });
        thread1.start();
        thread2.start();
    }
}
