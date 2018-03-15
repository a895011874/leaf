package com.dong.leaf;

import com.dong.leaf.model.Article;
import com.dong.leaf.service.inf.IArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeafApplicationTests {

	@Autowired
	private IArticleService articleService;

	@Test
	public void contextLoads() {
	}
	@Test
	public void testGetArticle(){
		IArticleService articleServices = mock(IArticleService.class);
		List<Article> articles =  articleServices.findAllArticle();
		assertEquals(CollectionUtils.isEmpty(articles),true);
	}
}
