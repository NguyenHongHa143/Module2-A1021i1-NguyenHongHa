package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllPage(Pageable pageable);
    Optional<Blog> findById(Long id);
    void save(Blog blog);
    void delete(Long id);

}
