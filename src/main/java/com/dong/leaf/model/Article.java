package com.dong.leaf.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Create by liudong on 2018/2/23
 */
@Data
@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String auther;

    private String content;

    private Long dateTime;
}
