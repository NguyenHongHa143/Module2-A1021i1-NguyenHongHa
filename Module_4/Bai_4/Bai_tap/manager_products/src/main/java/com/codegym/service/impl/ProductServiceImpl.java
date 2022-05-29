package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.ProductService;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> list ;
    static {
        list = new HashMap<>();
        list.put(1,new Product(1,"Iphone X",799,"ok","Apple"));
        list.put(2,new Product(2,"Iphone 10",999,"ok","Apple"));
        list.put(3,new Product(3,"Iphone 1",1199,"ok","Apple"));
        list.put(4,new Product(4,"SamSung",599,"ok","Samsung"));
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public void save(Product product) {
        if (product.getId()==0){
            product.setId(list.get(list.size()).getId()+1);
        }
        list.put(product.getId(), product);
    }


    @Override
    public void delete(int id) {
        list.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = getAll().stream().filter(e->e.getName().contains(name)).collect(Collectors.toList());
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product:getAll()
             ) {
            if (product.getId()==id){
                return product;
            }
        }
        return null;
    }
}
