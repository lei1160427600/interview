package com.example.interview.dao;

import com.example.interview.UserTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author xiaolei
 * @Title: UserDao
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/6/2617:51
 */
@Repository
public interface UserDao extends CrudRepository<UserTest,Long> {
    @Query(" from UserTest where id =:id")
    UserTest getUserById(@Param("id") Long id);
}
