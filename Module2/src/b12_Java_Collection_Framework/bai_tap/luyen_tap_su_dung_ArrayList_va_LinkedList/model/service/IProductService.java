package b12_Java_Collection_Framework.bai_tap.luyen_tap_su_dung_ArrayList_va_LinkedList.model.service;

import b12_Java_Collection_Framework.bai_tap.luyen_tap_su_dung_ArrayList_va_LinkedList.model.model.Product;

import java.util.List;

public interface IProductService<E> {
    void add();
    void display();
    void update(int id);
    void delete(int id);
    List<Product> search(String name);
    void sort(int choice);

}
