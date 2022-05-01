package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RepositoryProduct {
    private static String jdbcURL =
            "jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true";
    private static String jdbcUsername = "hongha";
    private static String jdbcPassword = "12456";
    public static Connection getConection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,
                    jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        Connection connection = getConection();
        if (connection != null){
            System.out.println("hello");
        }
    }
}
