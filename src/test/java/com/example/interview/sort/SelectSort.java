package com.example.interview.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xiaolei
 * @Title: SelectSort
 * @ProjectName interview
 * @Description: 选择排序
 * @date 2019/6/423:19
 */
public class SelectSort {
    public void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;//i到n中最小值的下标
            for (int j = i; j < array.length; j++) {
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    @Test
    public void test() {
        int[] array = {2,1,9,4,5,3,0,6,2};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
