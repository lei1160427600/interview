package com.example.interview.test;

import java.util.Arrays;

/**
 * @author xiaolei
 * @Title: SortTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/1720:23
 */
public class SortTest {
    public static void main(String[] args) {
        int[] array = {6, 2, 4, 7, 1, 8, 0, 3, 9, 5};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 冒泡排序：
     * 把第一个元素与第二个元素比较，如果第一个比第二个大，则交换他们的位置。接着继续比较第二个与第三个元素，如果第二个比第三个大，则交换他们的位置….
     * 我们对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样一趟比较交换下来之后，排在最右的元素就会是最大的数。
     * 除去最右的元素，我们对剩余的元素做同样的工作，如此重复下去，直到排序完成
     * 时间复杂度：
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
    }

    /**
     * 首先，找到数组中最小的那个元素，其次，将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。
     * 其次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。如此往复，直到将整个数组排序。这种方法我们称之为选择排序。
     *
     * @param array
     */
    public static void selectSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int length = array.length;
        for (int m = 0; m < length; m++) {
            int minIndex = m;
            for (int n = m; n < length; n++) {
                if (array[n] < array[minIndex]) {
                    minIndex = n;
                }
            }
            if(minIndex != m){
                int temp = array[m];
                array[m] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    /**
     * 插入排序：
     * 我们在玩打牌的时候，你是怎么整理那些牌的呢？一种简单的方法就是一张一张的来，将每一张牌插入到其他已经有序的牌中的适当位置。
     * 当我们给无序数组做排序的时候，为了要插入元素，我们需要腾出空间，将其余所有元素在插入之前都向右移动一位，这种算法我们称之为插入排序。
     * 过程简单描述：
     * 1、从数组第2个元素开始抽取元素。
     * 2、把它与左边第一个元素比较，如果左边第一个元素比它大，则继续与左边第二个元素比较下去，直到遇到不比它大的元素，然后插到这个元素的右边。
     * 3、继续选取第3，4，….n个元素,重复步骤 2 ，选择适当的位置插入。
     * 为方便理解我还准备了动图：
     * @param array
     */
    public static void insertSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < array.length; i++) {

        }
    }
}
