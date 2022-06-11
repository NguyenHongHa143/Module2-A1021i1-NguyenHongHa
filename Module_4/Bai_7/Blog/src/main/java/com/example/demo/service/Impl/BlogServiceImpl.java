package com.example.demo.service.Impl;

import com.example.demo.model.Blog;
import com.example.demo.repository.IBlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private IBlogRepository repository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllPage(Pageable pageable) {
//        return repository.findAllPage(pageable);
        return null;
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void delete(Long id) {
        repository.delete(findById(id).get());
    }


}
