package com.example.interview.designPattern;

/**
 * @author xiaolei
 * @Title: Singleton2
 * @ProjectName interview
 * @Description: 懒汉模式
 * @date 2019/6/411:14
 */
public class Singleton2 {
    // 静态成员变量
    private static Singleton2 instance = new Singleton2();

    // 构造函数私有，只能在当前类创建实例
    private Singleton2(){

    }

    // 静态方法
    public static Singleton2 getInstance(){
        return instance;
    }
}
