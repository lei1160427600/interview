package com.example.interview.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xiaolei
 * @Title: MergeArray
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/6/1817:12
 */
public class MergeArray {

    /**
     * @Description a,b 为有序数组，
     * @date 2019/6/18 17:15
     * @param a
     * @param b
     * @return int[]
     */

    public int[] mergeArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int index = 0;
        int i = 0;
        int k = 0;
        while (i < a.length && k < b.length) {
            if (a[i] < b[k]) {
                result[index++] = a[i++];
            } else {
                result[index++] = b[k++];
            }
        }
        while (i < a.length) {
            result[index++] = a[i++];
        }
        while (k < b.length) {
            result[index++] = b[k++];
        }
        return result;
    }

    @Test
    public void test (){
        int[] a = {5, 7, 8, 9};
        int[] b = {1, 2, 4, 5};
        System.out.println(Arrays.toString(mergeArray(a, b)));
        String str1="hello";
        String str2 = "he" + new String("llo");
        String str3="he"+"llo";
        System.out.println((str1==str3)+":"+str1.equals(str2));
        System.out.println((str1==str2)+":"+str1.equals(str2));

    }
}
