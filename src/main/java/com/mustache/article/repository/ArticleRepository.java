package com.mustache.article.repository;

import com.mustache.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
