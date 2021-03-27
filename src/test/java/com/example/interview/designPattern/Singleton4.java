package com.example.interview.designPattern;

/**
 * @author xiaolei
 * @Title: Singleton4
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/213:15
 */
public class Singleton4 {
    private static class test{
        private static Singleton4 instance = new Singleton4();
    }
    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        return test.instance;
    }
}
