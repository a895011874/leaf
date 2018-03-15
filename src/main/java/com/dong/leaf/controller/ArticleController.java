package com.dong.leaf.controller;

import com.alibaba.fastjson.JSONObject;
import com.dong.leaf.model.Article;
import com.dong.leaf.model.HttpRes;
import com.dong.leaf.service.inf.IArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by liudong on 2018/2/23
 */
@RestController
@Api("Article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @ApiOperation(value = "创建")
    @PostMapping("article")
    public HttpRes createArticle(@ApiParam(value = "article")@RequestBody String articleJson){

        HttpRes httpRes = new HttpRes();
        Article article = JSONObject.parseObject(articleJson,Article.class);
        articleService.insert(article);

        httpRes.setMsg(HttpRes.SUCCESS);
        httpRes.setState("200");
        return httpRes;
    }

    @ApiOperation(value="获取所有")
    @GetMapping("articles")
    @RequestMapping()
    public HttpRes findArticles(){
        HttpRes httpRes = new HttpRes();
        List<Article> articles = articleService.findAllArticle();

        httpRes.setData(articles);
        httpRes.setMsg(HttpRes.SUCCESS);
        httpRes.setState("200");

        return httpRes;
    }

    @ApiOperation(value="按id查询")
    @GetMapping("article/{id}")
    public HttpRes findArticleById(@ApiParam(value="id",name="id")@PathVariable("id")Integer id){

        HttpRes httpRes = new HttpRes();
        Article article = articleService.findById(id);
        List<Article> articles = new ArrayList<>();
        articles.add(article);

        httpRes.setData(articles);
        httpRes.setState("200");
        httpRes.setMsg(HttpRes.SUCCESS);

        return httpRes;
    }
}
