package service;

import bean.User;
import repository.RepositoryUser;
import repository.RepositoryUserImpl;

import java.util.List;

public class ServiceUserImpl implements ServiceUser{
    RepositoryUser repositoryUser = new RepositoryUserImpl();
    @Override
    public List<User> getAll() {
        return repositoryUser.getAll();
    }

    @Override
    public void create(User user) {
        repositoryUser.create(user);
    }

    @Override
    public void delete(int id) {
        repositoryUser.delete(id);
    }

    @Override
    public void update(User user) {
        repositoryUser.update(user);
    }

    @Override
    public List<User> findByCountry(String country) {
        return repositoryUser.findByCountry(country);
    }

    @Override
    public List<User> sort(String sortStyle) {
        return repositoryUser.sort(sortStyle);
    }
}
