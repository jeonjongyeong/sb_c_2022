package com.jjy.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jjy.example.demo.vo.Article;

@Mapper
public interface ArticleRepository {
		
	
	public void writeArticle(@Param("title") String title,@Param("body") String body);
	
	
	public Article getArticle(@Param("id") int id);
	
	
	public void deleteArticle(@Param("id") int id);
	
	
	public void modifyArticle(@Param("id") int id,@Param("title") String title,@Param("body") String body);

	
	public List<Article> getArticles();

	
	public int getLastInsertId();

	}
