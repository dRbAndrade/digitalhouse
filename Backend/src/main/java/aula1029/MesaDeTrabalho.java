package aula1029;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import util.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MesaDeTrabalho {

    private static final Logger logger = Logger.getLogger(main.java.aula1027.Log4J.class);

    public static void main(String[] args) throws ClassNotFoundException {
        PropertyConfigurator.configure("Backend\\log4j.properties");
        Connection connection = DAO.getConnection();
        String query = """
                DROP TABLE IF EXISTS employee""";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.execute();
            query = """
                CREATE TABLE IF NOT EXISTS employee (
                employee_id int not null auto_increment,
                employee_name varchar(255),
                primary key(employee_id))""";
            statement = connection.prepareStatement(query);
            statement.execute();
            query = """
                INSERT INTO employee VALUES
                (1,"Matheus"),
                (3,"Chucre"),
                (4,"Andrade")""";
            statement = connection.prepareStatement(query);
            statement.execute();
            statement = connection.prepareStatement("""
            INSERT INTO employee VALUES (1,"Monteiro")""");
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        query = """
                UPDATE employee SET employee_name = "dRb" WHERE employee_id = 1""";
        try {
            statement = connection.prepareStatement(query);
            statement.execute();
            query= """
                    SELECT * FROM employee WHERE employee_id=1""";
            statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            result.next();
            logger.info(result.getString(1) +" "  + result.getString(2));
            query= """
                    SELECT * FROM employee WHERE employee_id=4""";
            statement = connection.prepareStatement(query);
            ResultSet result2= statement.executeQuery();
            result2.next();
            logger.info(result2.getString(1) +" "  + result2.getString(2));
            query= """
                    DELETE FROM employee WHERE employee_id=4""";
            statement = connection.prepareStatement(query);
            statement.execute();
            query= """
                    SELECT * FROM employee WHERE employee_name="Chucre" """;
            statement = connection.prepareStatement(query);
            ResultSet result3= statement.executeQuery();
            result3.next();
            logger.info(result3.getString(1) +" "  + result3.getString(2));
            query= """
                    DELETE FROM employee WHERE employee_name="Chucre" """;
            statement = connection.prepareStatement(query);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
