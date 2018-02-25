package com.dong.leaf.service.inf;

import com.dong.leaf.model.Article;

import java.util.List;

/**
 * Create by liudong on 2018/2/24
 */
public interface IArticleService {

    void insert(Article article);

    List<Article> findAllArticle();

    Article findById(Integer id);

}
