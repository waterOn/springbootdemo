package com.cp.repository;

import com.cp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/*
created by cp on 2018/10/29
        User表操作接口
*/
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("select t from User t where t.name = :name")
    User findBYUserName(@Param("name") String name);

}
