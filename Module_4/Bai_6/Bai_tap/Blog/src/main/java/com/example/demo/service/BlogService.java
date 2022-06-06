package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAll();
    Optional<Blog> findById(Long id);
    void save(Blog blog);
    void delete(Long id);

}
