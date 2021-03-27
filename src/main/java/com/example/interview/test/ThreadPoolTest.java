package com.example.interview.test;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author xiaolei
 * @Title: ThreadPoolTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/616:06
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        cahcedThreadPool3();
    }

    public static void singleThreadExecutorTest() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Thread t1 = new Thread1();
        Thread t2 = new Thread1();
        Thread t3 = new Thread1();
        Thread t4 = new Thread1();
        Thread t5 = new Thread1();
        service.execute(t1);// 将线程放入线程池执行
        service.execute(t2);
        service.execute(t3);
        service.execute(t4);
        service.execute(t5);
        service.shutdown();// 关闭线程池
    }

    public static void fixThreadPoolTest() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Thread t1 = new Thread(new Thread2());
        Thread t2 = new Thread(new Thread2());
        Thread t3 = new Thread(new Thread2());
        Thread t4 = new Thread(new Thread2());
        Thread t5 = new Thread(new Thread2());
        service.execute(t1);
        service.execute(t2);
        service.execute(t3);
        service.execute(t4);
        service.execute(t5);
        service.shutdown();
    }

    public static void cacheThreadPoolTest() {
        ExecutorService service = Executors.newCachedThreadPool();
        Runnable r = () -> System.out.println(Thread.currentThread().getName());

        service.execute(r);
        service.execute(r);
        service.execute(r);
        service.execute(r);
        service.execute(r);
        service.shutdown();
    }

    public static void cachedThreadPoolTest2() {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                Thread thread = Thread.currentThread();
//                thread.interrupt();
                System.out.println(String.format("当前执行的线程：%s,线程优先级：%s，线程中断状态：%s,，线程状态：%s",
                        thread.getName(),
                        thread.getPriority(),
                        String.valueOf(thread.isInterrupted()),
                        thread.getState().toString()));
            });
        }
        service.shutdown();//关闭线程池
    }

    public static void cahcedThreadPool3(){
//        ExecutorService service = Executors.newCachedThreadPool();
//        Callable callable = new CallableTest();
        Callable<Integer> callable = ()->{
            System.out.println(Thread.currentThread().getName());
            return new Random().nextInt();
        };
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            FutureTask<Integer> futureTask = new FutureTask<>(callable);
            Thread thread = new Thread(futureTask);
            futures.add(futureTask);
//            futures.add(service.submit(callable));
            thread.start();
            try {
                System.out.println(futureTask.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        for (Future<Integer> future : futures) {
            try {
                System.out.println("future:"+future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }

    public static void scheduleThreadPoolTest() {
        ExecutorService service = Executors.newScheduledThreadPool(2);
        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();
        Thread2 t3 = new Thread2();
        Thread2 t4 = new Thread2();
        Thread2 t5 = new Thread2();
        service.execute(t1);
        service.execute(t2);
        service.execute(t3);
        service.execute(t4);
        service.execute(t5);
        service.shutdown();
    }

}
