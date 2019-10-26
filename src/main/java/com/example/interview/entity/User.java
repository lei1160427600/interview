package com.example.interview.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Objects;

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
    private long id;
    private String name;
    private String email;

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(o instanceof User){
            return true && Objects.equals(((User) o).getId(), id) && Objects.equals(((User) o).getEmail(), email) && Objects.equals(((User) o).getName(), name);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
//        Runnable runnable = () -> System.out.println("test");
//        Thread thread = new Thread(runnable);
//        thread.start();
        return Objects.hash(id, name, email);
    }
}
