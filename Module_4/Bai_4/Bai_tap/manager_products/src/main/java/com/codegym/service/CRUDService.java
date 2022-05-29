package com.codegym.service;

import java.util.List;

public interface CRUDService <E>{
    List<E> getAll();
    void save(E e);
    void delete(int id);
    List<E> search(String name);
    E findById(int id);
}
