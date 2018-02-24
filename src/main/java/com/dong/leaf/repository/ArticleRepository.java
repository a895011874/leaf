package com.dong.leaf.repository;

import com.dong.leaf.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by liudong on 2018/2/23
 */
public interface ArticleRepository extends JpaRepository<Article,Integer> {

}
