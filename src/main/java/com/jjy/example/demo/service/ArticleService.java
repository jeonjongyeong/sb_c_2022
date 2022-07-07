package com.jjy.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjy.example.demo.repository.ArticleRepository;
import com.jjy.example.demo.vo.Article;

@Service

public class ArticleService {

	private ArticleRepository articleRepository;

	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
		articleRepository.makeTestData();
	}

	public Article writeArticle(String title, String body) {
		return articleRepository.writeArticle(title, body);

	}

	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}

	public Article getArticle(int id) {
		return articleRepository.getArticle(id);
	}

	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);
	}

	public void ModifyArticle(int id, String title, String body) {
		articleRepository.ModifyArticle(id, title, body);

	}
}
