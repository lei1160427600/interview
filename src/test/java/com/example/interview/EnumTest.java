package com.example.interview;

/**
 * @author xiaolei
 * @Title: EnumTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/2/1116:20
 */
public enum  EnumTest {
    SMALL(1,"xiaohao"),
    MIDDLE(2,"zhonghao"),
    LAGGE(3, "dahao");

    private int size;
    private String desc;

    EnumTest(int size,String desc){
        this.size = size;
        this.desc = desc;
    }

}
