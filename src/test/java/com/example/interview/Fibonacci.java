package com.example.interview;

import org.junit.Test;

/**
 * @author xiaolei
 * @Title: Fibonacci
 * @ProjectName interview
 * @Description: 斐波那契数列
 * @date 2019/6/510:22
 */
public class Fibonacci {
    // 递归实现
    public int fibonacci(int n){
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // for循环实现
    public int fibonacci1(int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        int n_1 = 1;
        int n_2 = 1;
        for (int i = 0; i < n - 3; i++) {
            int temp = n_1 + n_2;
            n_2 = n_1;
            n_1 = temp;
        }
        return n_1 + n_2;
    }

    @Test
    public void test(){
        System.out.println(fibonacci(20));
        System.out.println(fibonacci1(20));
    }
}
