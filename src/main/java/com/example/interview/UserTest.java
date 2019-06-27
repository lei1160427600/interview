package com.example.interview;

import javax.persistence.*;

/**
 * @author xiaolei
 * @Title: UserTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/6/2617:22
 */
@Entity
@Table(name = "t_user_test")
public class UserTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "age")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
