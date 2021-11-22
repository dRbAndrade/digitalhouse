package util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.*;

public class ConnectionFactory {

    private static final Logger logger = Logger.getLogger(ConnectionFactory.class);
    private static Connection connection;

    public static Connection getConnection() {
        PropertyConfigurator.configure("log4j.properties");
        String user = "dRb";
        String password = "Re@perAndrade22";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test1",user,password);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            logger.error(String.format("Não foi possível conectar: %n%s",ex.getMessage()));
        }
        return connection;
    }



}
