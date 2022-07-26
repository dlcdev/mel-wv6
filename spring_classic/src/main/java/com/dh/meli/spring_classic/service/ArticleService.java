package com.dh.meli.spring_classic.service;

import com.dh.meli.spring_classic.model.Article;
import com.dh.meli.spring_classic.repository.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;


import java.util.List;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleRepo repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }

    @Override
    public Article findById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Article> findAll() {
//        List<Article> list = new ArrayList<>();
//        Iterable<Article> resp = repo.findAll();
//        resp.forEach(
//                a -> {
//                    list.add(a);
//                }
//        );
//        resp.forEach(list::add);

        return repo.findAllArticles();
    }

    @Override
    public String deleteById(int id) {
        repo.deleteById(id);
        return "Artigo removido com sucesso";
    }

    @Override
    public Article update(Article article) {
        return repo.save(article);
    }

    @Override
    public Page<Article> getPageByTitle(String title, Pageable pg) {
        return repo.findByTitle(title, pg);
    }
}
