package Service;

import Model.Product;

import java.util.List;

public interface ServiceProduct {
    void create(Product product);
    List<Product> findAll();
    void update(int id,Product product);
    void delete(int id);
    List<Product> findByName(String name);
    Product findByID(int id);
}
