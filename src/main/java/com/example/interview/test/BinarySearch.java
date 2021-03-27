package com.example.interview.test;

/**
 * @author xiaolei
 * @Title: binarySearch
 * @ProjectName interview
 * @Description: 二分查找又称折半查找:优点是比较次数少，查找速度快，平均性能好；其缺点是要求待查表为有序表，且插入删除困难。因此，折半查找方法适用于不经常变动而查找频繁的有序列表时间复杂度log2n
 * @date 2020/3/1715:41
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = BinarySearch.binarySearch(array, 0);
        int b = binarySearch1(array, 0, array.length - 1, 0);
        System.out.println("a " + a + ",b " + b);
    }

    /**
     *  while 循环
     * @param array
     * @param item
     * @return
     */
    public static int binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            System.out.println("A " + "low " + low + "high " + high);
            int middle = (low + high) / 2;
            if (array[middle] == item) {
                return middle;
            }
            if (array[middle] > item) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 递归方式
     *
     * @param array
     * @param low
     * @param high
     * @param item
     * @return
     */
    public static int binarySearch1(int[] array, int low, int high, int item) {

        int middle = (low + high) / 2;
        if (array[middle] == item) {
            return middle;
        }
        if (low <= high) {
            if (array[middle] > item) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
            return binarySearch1(array, low, high, item);
        } else {
            return -1;
        }
    }
}
