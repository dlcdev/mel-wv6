package com.dh.meli.spring_classic.service;

import com.dh.meli.spring_classic.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IArticleService {
    Article save(Article article);
    Article findById(int id);
    List<Article> findAll();
    String deleteById(int id);
    Article update(Article article);
    Page<Article> getPageByTitle(String title, Pageable pg);
}
