package com.example.interview.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xiaolei
 * @Title: InsertSort
 * @ProjectName interview
 * @Description: 插入排序 平均时间复杂度 O(n2) 稳定性：稳定
 * 基本思想：在要排序的一组数中，假定前n-1个数已经排好序，现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。如此反复循环，直到全部排好顺序。
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
