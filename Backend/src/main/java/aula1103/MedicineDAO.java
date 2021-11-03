package aula1103;

import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicineDAO implements DAO<Medicine>{
    @Override
    public void insert(Medicine medicine) {
        String query = String.format("INSERT INTO medicine VALUES (null,'%s',%s,'%s',%s,%s)",
                medicine.getName(),medicine.getCode(),medicine.getLab(),medicine.getPrice(),medicine.getQuantity());

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.execute();
            connection.close();
            statement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        String query = String.format("DELETE FROM medicine WHERE id=%d",id);
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.execute();
            connection.close();
            statement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void selectAll() {
        String query = "SELECT * FROM medicine";

        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while(result.next()) {
                System.out.println("----------------");
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
                System.out.println(result.getString(3));
                System.out.println(result.getString(4));
                System.out.println(result.getInt(5));
                System.out.println(result.getDouble(6));
            }
            connection.close();
            statement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void selectById(int id) {
        String query = String.format("SELECT * FROM medicine WHERE id=%d",id);
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                System.out.println("----------------");
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
                System.out.println(result.getString(3));
                System.out.println(result.getString(4));
                System.out.println(result.getInt(5));
                System.out.println(result.getDouble(6));
            }
            connection.close();
            statement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }


}
