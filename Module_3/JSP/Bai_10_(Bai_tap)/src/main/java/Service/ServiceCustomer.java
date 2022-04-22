package Service;

import Model.Customer;

import java.util.List;

public interface ServiceCustomer {
    void add(Customer customer);
    void update(Customer customer);
    void delete(int id);
    List<Customer> findName(String name);
    List<Customer> getAll();
}
