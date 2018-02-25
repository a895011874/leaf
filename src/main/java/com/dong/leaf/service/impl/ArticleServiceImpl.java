package com.dong.leaf.service.impl;

import com.dong.leaf.model.Article;
import com.dong.leaf.repository.ArticleRepository;
import com.dong.leaf.service.inf.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by liudong on 2018/2/24
 */
@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public void insert(Article article) {
        Long dateTime = System.currentTimeMillis()/1000;
        article.setDateTime(dateTime);
        articleRepository.save(article);
    }

    @Override
    public List<Article> findAllArticle() {

        List<Article> articles = articleRepository.findAll();

        return articles;
    }

    @Override
    public Article findById(Integer id) {
        Article article = articleRepository.findOne(id);

        return article;
    }
}
