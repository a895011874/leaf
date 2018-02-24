package com.dong.leaf.controller;

import com.dong.leaf.model.Article;
import com.dong.leaf.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create by liudong on 2018/2/23
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping("article")
    public String createArticle(@RequestBody String articleJson){
        Article article = new Article();
        articleRepository.save(article);
        return null;
    }
    @GetMapping("articles")
    public String findArticles(){
        List<Article> articles = articleRepository.findAll();
        System.out.println(articles.toString());
        return articles.toString();
    }
    @GetMapping("article/{id}")
    public String findArticleById(@PathVariable("id")Integer id){
        Article article = articleRepository.findOne(id);
        return article.toString();
    }
}
