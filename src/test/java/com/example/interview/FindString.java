package com.example.interview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xiaolei
 * @Title: FindString
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/5/3119:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FindString {
    /**
     * @Description 求字符串m在字符串n中出现的位置
     * @date 2019/5/31 19:43
     * @param n
     * @param m
     * @return int
     */

    public int getIndex(char[] n, char[] m) {
        //字符串m在字符串n中出现的位置,-1表示n中不存在m
        int index = -1;
        if (m.length <= n.length) {
            for (int i = 0; i < n.length; i++) {
                if (n.length - i >= m.length && n[i] == m[0]) {
                    int k = i;
                    index = i;
                    for (int i1 = 1; i1 < m.length; i1++) {
                        k++;
                        if (m[i1] != n[k]) {
                            index = -1;
                            break;
                        }
                    }
                    // 返回字符串第一次出现的位置
                    if(index != -1){
                        return index;
                    }
                }
            }
        }
        return index;
    }

    public int getIndex(String n,String m){
        int index = -1;
        if(m.length() <= n.length()){
            char first = m.charAt(0);
            for (int i = 0; i < n.length() ; i++) {
                if(n.length()-i >= m.length() && n.charAt(i) == first){
                    int k = i;
                    index = i;
                    for (int j = 1; j < m.length(); j++) {
                        k++;
                        if(m.charAt(j) != n.charAt(k)){
                            index = -1;
                            break;
                        }
                    }
                    // 返回字符串第一次出现的位置
                    if(index != -1){
                        return index;
                    }
                }
            }
        }
        return index;
    }

    public int kmp(){
        int index = -1;


        return index;
    }

    @Test
    public void test() {
        char[] n = {'1','3', '2', '3', 'w', '1', '2'};
        char[] m = {'1','2'};
        System.out.println("index========:" +  getIndex(n, m));
        System.out.println("index========:" +  getIndex("1323w1361213", "12"));
    }
}
