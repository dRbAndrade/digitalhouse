package aula1105;

import util.ConnectionFactory;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressDAO implements DAO<Address>{

    private Connection connection;

    public AddressDAO(){
        createTable();
    }

    private void createTable(){
        try {
        connection=ConnectionFactory.getConnection();
        String query = """
                CREATE TABLE IF NOT EXISTS address(
                    id int not null auto_increment,
                    number int not null,
                    street varchar(200) not null,
                    city varchar(200) not null,
                    state varchar(100) not null,
                    primary key (id)
                );""";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.execute();
            statement = connection.prepareStatement(query);
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void insert(Address address) {
        try {
            String query;
            query = "INSERT INTO address VALUES(null,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,address.getNumber());
            statement.setString(2,address.getStreet());
            statement.setString(3,address.getCity());
            statement.setString(4,address.getState());
            statement.execute();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public List<Address> selectAll( ) {
        List<Address> result = new ArrayList<>();
        try{
            String query="SELECT * FROM address";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                result.add(new Address(
                        resultSet.getInt("id"),
                        resultSet.getInt("number"),
                        resultSet.getString("street"),
                        resultSet.getString("city"),
                        resultSet.getString("state")
                ));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Address selectById(int id) {
        Address result = null;
        try{
            String query="SELECT * FROM address WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                result=new Address(
                        resultSet.getInt("id"),
                        resultSet.getInt("number"),
                        resultSet.getString("street"),
                        resultSet.getString("city"),
                        resultSet.getString("state")
                );
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public void delete(int id) {
        try{
            String query = "DELETE FROM address WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            statement.execute();
            JOptionPane.showMessageDialog(null, String.format("""
                    Endereço de id %d foi deletado com sucesso.
                    """,id));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Address address) {
        try{
            String query = """
                    UPDATE address SET
                    number = ?,
                    street = ?,
                    city = ?,
                    state = ?
                    WHERE id=?""";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,address.getNumber());
            statement.setString(2,address.getStreet());
            statement.setString(3,address.getCity());
            statement.setString(4,address.getState());
            statement.setInt(5,address.getId());
            statement.execute();
            JOptionPane.showMessageDialog(null, String.format("""
                    Endereço com id = %d atualizado com sucesso.
                    Novos valores:
                    %s""",
                    address.getId(),address));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }


}
