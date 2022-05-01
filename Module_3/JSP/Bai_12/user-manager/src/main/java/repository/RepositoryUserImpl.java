package repository;

import bean.User;
import util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryUserImpl implements RepositoryUser{
    static Connection connection = null;
    private static final String GET_ALL = "select * from user";
    private static final String CREATE_USER = "insert into user(name, email, country) values(?,?,?)";
    private static final String UPDATE_USER = "update user set name=?,email=?,country=? where id=?;";
    private static final String DELETE_USER = "delete from user where id=?";
    private static final String FIND_BY_NAME_USER = "select * from user where name like %?%";
    @Override
    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        connection = ConnectionDB.getAll();
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                list.add(new User(id,name,email,country));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public void create(User user) {
        connection = ConnectionDB.getAll();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USER);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            int result = preparedStatement.executeUpdate();
            if(result==0){
                System.out.println("fail");
            }else {
                System.out.println("success");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        connection = ConnectionDB.getAll();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(User user) {
        connection = ConnectionDB.getAll();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setInt(4,user.getId());
            preparedStatement.executeLargeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<User> findByName(String name) {
        connection = ConnectionDB.getAll();
        ResultSet resultSet = null;
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_NAME_USER);
            preparedStatement.setString(1,name);
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name1 = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                list.add(new User(id,name1,email,country));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
