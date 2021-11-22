package aula1028;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

    private static final Logger logger = Logger.getLogger(DAO.class);
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException {
        PropertyConfigurator.configure("Backend\\log4j.properties");
        String user = "dRb";
        String password = "Re@perAndrade22";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test1",user,password);
        } catch (SQLException ex) {
            ex.printStackTrace();
            logger.error(String.format("Não foi possível conectar: %n%s",ex.getMessage()));
        }
        return connection;
    }


}
