package repository;

import bean.User;

import java.util.List;

public interface RepositoryUser {
    List<User> getAll();
    void create(User user);
    void delete(int id);
    void update(User user);
    List<User> findByCountry(String country);
    List<User> sort(String sortStyle);
}
