package Service;

import Model.Customer;

import java.util.List;

public interface ServiceCustomer {
    void create(Customer customer);
    void update(int id,Customer customer);
    void delete(int id);
    Customer findByID(int id);
    List<Customer> findAll();
}
