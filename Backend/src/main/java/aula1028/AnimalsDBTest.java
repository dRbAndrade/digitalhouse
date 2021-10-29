package aula1028;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnimalsDBTest {

    private static final Logger logger = Logger.getLogger(main.java.aula1027.Log4J.class);

    public static void main(String[] args) throws ClassNotFoundException {

        PropertyConfigurator.configure("Backend\\log4j.properties");
        Connection connection = DAO.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("""
                    DROP TABLE IF EXISTS animal""");
            statement.execute();
            statement = connection.prepareStatement(
                    """
                            CREATE TABLE IF NOT EXISTS animal(
                            animal_id int not null auto_increment,
                            animal_name varchar(100) not null,
                            animal_type varchar(100) not null,
                            primary key(animal_id)
                            );""");
            statement.execute();
            statement = connection.prepareStatement("""
                    INSERT INTO animal VALUES
                    (null,"Haru","Gato"),
                    (null,"Rylai","Gato"),
                    (null,"Banguela","Gato"),
                    (null,"Miya","Gato"),
                    (null,"Ryuk","Gato");""");
            statement.execute();
            statement = connection.prepareStatement("""
                    DELETE FROM animal WHERE animal_id = 2;""");
            statement.execute();
            statement = connection.prepareStatement("""
                    SELECT * FROM animal;
                    """);
            ResultSet result = statement.executeQuery();

            while (result.next()) {

                String[] resultData = new String[result.getMetaData().getColumnCount()];
                for (int i = 0; i < resultData.length; i++) {
                    resultData[i] = result.getString(i + 1);
                }
                System.out.printf("""
                                Id: %s
                                Nome: %s
                                Tipo: %s
                                %n""",
                        resultData[0],
                        resultData[1],
                        resultData[2]);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            logger.error(String.format("Erro de sql: %s", ex.getMessage()));
        }


    }
}



