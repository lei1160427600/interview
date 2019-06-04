package com.example.interview.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xiaolei
 * @Title: InsertSort
 * @ProjectName interview
 * @Description: 插入排序
 * @date 2019/6/423:38
 */
public class InsertSort {
    public void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(array[j+1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Test
    public void test(){
        int[] array = {2,1,9,4,5,3,0,6,2};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
