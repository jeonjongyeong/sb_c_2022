package com.jjy.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jjy.example.demo.vo.Article;

@Mapper
public interface ArticleRepository {
		
	public Article writeArticle(String title, String body);
	
	@Select("SELECT * FROM article WHERE id = #{id}")
	public Article getArticle(@Param("id") int id);
	
	@Delete("DELETE FROM article WHERE id = #{id}")
	public void deleteArticle(@Param("id") int id);
	
	@Update("UPDATE article Set title = #{title}, `body` = #{body} WHERE id = #{id}")
	public void ModifyArticle(@Param("id") int id,@Param("title") String title,@Param("body") String body);

	@Select("SELECT * FROM article ORDER BY id DESC")
	public List<Article> getArticles();

	}
