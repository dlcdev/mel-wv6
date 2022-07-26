package com.dh.meli.spring_classic.controller;

import com.dh.meli.spring_classic.model.Article;
import com.dh.meli.spring_classic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article article) {
        return ResponseEntity.ok(service.save(article));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        return ResponseEntity.ok(service.deleteById(id));
    }

    @GetMapping
    public ResponseEntity<List<Article>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PutMapping
    public ResponseEntity<Article> update(@RequestBody Article article){
        return ResponseEntity.ok(service.update(article));
    }

    @GetMapping("/title/{title}")
    public Page<Article> getPageByTitle(@PathVariable String title, Pageable pg){
        return service.getPageByTitle(title, pg);

    }
}
