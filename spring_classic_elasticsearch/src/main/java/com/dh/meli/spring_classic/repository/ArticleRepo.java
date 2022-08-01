package com.dh.meli.spring_classic.repository;

import com.dh.meli.spring_classic.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface ArticleRepo extends ElasticsearchRepository<Article, Integer> {
    @Query("{\"match_all\": {} }")
    List<Article> findAllArticles();

    @Query("{\"match\": {\"title\": {\"query\": \"?0\"}}}")
    Page<Article> findByTitle(String title, Pageable pg);
}
