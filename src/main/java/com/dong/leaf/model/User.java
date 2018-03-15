package com.dong.leaf.model;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Create by liudong on 2018/3/15
 */
@Data
@Entity
@Table(name="tbl_user")
public class User {

    @Id
    private String uId;

    private String name;

    @Column(unique = true)
    private String phone;

    private String password;

    private String description;

}
