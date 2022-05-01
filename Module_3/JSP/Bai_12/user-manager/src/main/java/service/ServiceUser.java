package service;

import bean.User;

import java.util.List;

public interface ServiceUser {
    List<User> getAll();
    void create(User user);
    void delete(int id);
    void update(User user);
    List<User> findByName(String name);
}
