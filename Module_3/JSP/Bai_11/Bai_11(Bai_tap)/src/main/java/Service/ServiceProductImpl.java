package Service;

import Model.Product;
import Repository.Repository2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ServiceProductImpl implements ServiceProduct{
    Repository2 repository2 = new Repository2();
    private static Map<Integer,Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"Iphone X",10,10,"Apple"));
        productMap.put(2,new Product(2,"Iphone 13",30,5,"Apple"));
        productMap.put(3,new Product(3,"Iphone 12",15,12,"Apple"));
        productMap.put(4,new Product(4,"SamSung Galaxy Note10",6,7,"SamSung"));
        productMap.put(5,new Product(5,"SamSung Galaxy S20 FE",11,15,"SamSung"));
        productMap.put(6,new Product(6,"SamSung Galaxy Z Fold 3",32,4,"SamSung"));

    }
    @Override
    public void create(Product product) {
        if (!productMap.containsKey(product.getId())){
            productMap.put(product.getId(), product);
        }
    }

    @Override
    public List<Product> findAll() {
        return repository2.getAll();
    }

    @Override
    public void update(int id, Product product) {
        if (productMap.containsKey(id)){
            productMap.put(id,product);
        }
    }

    @Override
    public void delete(int id) {
        if (productMap.containsKey(id)){
            productMap.remove(id);
        }
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list = new ArrayList<>(productMap.values());
        return list.stream().filter(e->e.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public Product findByID(int id) {
        return productMap.get(id);
    }
}
