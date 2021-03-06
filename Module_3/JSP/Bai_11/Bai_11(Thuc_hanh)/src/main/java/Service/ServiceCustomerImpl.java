package Service;

import Model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceCustomerImpl implements ServiceCustomer {
    private static Map<Integer,Customer> customerMap;
    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customerMap.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customerMap.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customerMap.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customerMap.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customerMap.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }
    @Override
    public void create(Customer customer) {
        if (!customerMap.containsKey(customer.getId())){
            customerMap.put(customer.getId(),customer);
        }
    }

    @Override
    public void update(int id, Customer customer) {
        if (customerMap.containsKey(id)){
            customerMap.put(id,customer);
        }
    }

    @Override
    public void delete(int id) {
        if (customerMap.containsKey(id)){
            customerMap.remove(id);
        }
    }

    @Override
    public Customer findByID(int id) {
        if (customerMap.containsKey(id)){
            return customerMap.get(id);
        }
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }
}
