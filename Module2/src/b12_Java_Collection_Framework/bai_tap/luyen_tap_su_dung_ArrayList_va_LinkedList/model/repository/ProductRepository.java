package b12_Java_Collection_Framework.bai_tap.luyen_tap_su_dung_ArrayList_va_LinkedList.model.repository;

import b12_Java_Collection_Framework.bai_tap.luyen_tap_su_dung_ArrayList_va_LinkedList.model.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    public static List<Product> products = new ArrayList<>();


    @Override
    public List<Product> getAll() {
        return  products;
    }
}


