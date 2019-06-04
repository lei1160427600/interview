package com.example.interview.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xiaolei
 * @Title: BubbleSort
 * @ProjectName interview
 * @Description: 冒泡排序
 * @date 2019/6/322:33
 */
public class BubbleSort {

    public void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Test
    public void test(){
//        int[] array = new int[3];
        int[] array = {2,1,9,4,5,3,0,6,2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
