package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3325/taskmanagementapp";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    
    public static Connection getConnection(){
    
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }
    
    public static void closeConnection(Connection connection){
        try {
            if (connection != null){
                closeConnection(connection);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", e);
        }   
    }
}
