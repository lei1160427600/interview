package com.example.interview.test;

/**
 * @author xiaolei
 * @Title: JoinTest
 * @ProjectName interview
 * @Description: TODO
 * @date 3/23/202010:06 AM
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = ()->{
            for (int i = 0; i < 6; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("子线程睡眠：" + i + "秒。");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程睡眠：" + i + "秒。");
        }
    }
}
