package com.example.interview.constant;

/**
 * @author xiaolei
 * @Title: EnumTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/112:57
 */
public enum EnumTest {
    TEST1(1),TEST2(2), TEST3(3);
    EnumTest(int code){
        this.code = code;
    }

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
