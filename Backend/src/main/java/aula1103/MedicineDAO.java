package aula1103;

import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public List<Medicine> selectAll() {
        String query = "SELECT * FROM medicine";
        List<Medicine> resultList = new ArrayList<>();
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while(result.next()) {

                Medicine med = new Medicine();
                med.setId(result.getInt("id"));
                med.setName(result.getString("name"));
                med.setLab(result.getString("lab"));
                med.setCode(result.getInt("code"));
                med.setPrice(result.getDouble("price"));
                med.setQuantity(result.getInt("quantity"));
                resultList.add(med);

            }

            connection.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return resultList;
    }

    @Override
    public Medicine selectById(int id) {
        String query = String.format("SELECT * FROM medicine WHERE id=%d",id);
        Medicine med = new Medicine();
        try {

            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while(result.next()) {

                med.setId(result.getInt("id"));
                med.setName(result.getString("name"));
                med.setLab(result.getString("lab"));
                med.setCode(result.getInt("code"));
                med.setPrice(result.getDouble("price"));
                med.setQuantity(result.getInt("quantity"));

            }

            connection.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

        return med;
    }


}
