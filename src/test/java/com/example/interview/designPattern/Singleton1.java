package com.example.interview.designPattern;

/**
 * @author xiaolei
 * @Title: Singleton1
 * @ProjectName interview
 * @Description: 懒汉模式
 * @date 2019/6/411:11
 */
public class Singleton1 {
    //线程不安全
//    private static Singleton1 instance;
    //线程安全
    private volatile static Singleton1 instance;

    //当类的构造函数为私有时，只能在本类实例化该类的对象。
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
        // 先判断对象是否已经实例化过，如果没有实例化过才进入加锁代码
        if(instance == null){
            // 对象加锁
            synchronized (Singleton1.class){
                // 判断对象是否为空
                if(instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
