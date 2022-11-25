package com.mustache.article.controller;

import com.mustache.article.domain.Article;
import com.mustache.article.domain.dto.ArticleDto;
import com.mustache.article.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/new")
    public String newArticle() {
        return "aritlces/new";
    }

    @PostMapping("/posts")
    public String createArticle(ArticleDto articleDto) {
        Article article = articleDto.toEntity();
        articleRepository.save(article);
        return "";
    }
}
