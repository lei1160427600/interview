package com.example.interview.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author xiaolei
 * @Title: User
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/7/140:07
 */
@Data
@Component
public class User {
    private Long id;
    private String name;
    private String email;
}
