package com.dong.leaf.repository;

import com.dong.leaf.model.Article;
import com.dong.leaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Create by liudong on 2018/3/15
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {

    @Query("SELECT u FROM tbl_user u WHERE phone=:phone")
    User getUserByPhone(@Param("phone")String phone);
}
