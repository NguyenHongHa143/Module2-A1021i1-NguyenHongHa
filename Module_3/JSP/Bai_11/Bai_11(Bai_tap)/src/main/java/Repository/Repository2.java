package Repository;

import Model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Repository2 {
    private static final String GET_ALL ="select * from product";
    public List<Product> getAll() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        connection = RepositoryProduct.getConection();
        List<Product> list = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(GET_ALL);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String manufacturer = resultSet.getString("manufacturer");
                list.add(new Product(id,name,price,quantity,manufacturer));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
}
