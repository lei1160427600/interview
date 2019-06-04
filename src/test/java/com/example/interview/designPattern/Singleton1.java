package com.example.interview.designPattern;

/**
 * @author xiaolei
 * @Title: Singleton1
 * @ProjectName interview
 * @Description: 饿汉模式
 * @date 2019/6/411:11
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){
    }
    //线程不安全
    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
    //线程安全
    public static Singleton1 getInstance2(){
        if(instance == null){
            synchronized (Singleton1.class){
                if(instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
