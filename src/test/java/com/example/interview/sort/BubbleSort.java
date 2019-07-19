package com.example.interview.sort;

import org.junit.Test;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author xiaolei
 * @Title: BubbleSort
 * @ProjectName interview
 * @Description: 冒泡排序 平均时间复杂度 O(n2) ，稳定性：稳定
 * 基本思想：比较相邻的元素，如果前一个比后一个大，就把它们两个调换位置。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @date 2019/6/322:33
 */
@Component("bubblesort")
@Scope(value = "prototype")
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
        int[] array = {2,1,9,4,5,3,0,6,2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
