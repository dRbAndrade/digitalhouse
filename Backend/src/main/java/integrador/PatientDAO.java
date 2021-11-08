package integrador;

import util.ConnectionFactory;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO implements DAO<Patient>{

    private Connection connection;

    public PatientDAO(){
        createTable();
    }

    private void createTable(){
        try {
        connection=ConnectionFactory.getConnection();
        String query = """
                CREATE TABLE IF NOT EXISTS patient(
                    id int not null auto_increment,
                    name varchar(100) not null,
                    last_name varchar(200) not null,
                    register_date DATETIME DEFAULT CURRENT_TIMESTAMP() not null,
                    address_id int not null,
                    primary key (id),
                    CONSTRAINT fk_address FOREIGN KEY(address_id) REFERENCES address(id)
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
    public void insert(Patient patient) {
        try {
            String query;
            query = "INSERT INTO patient(name,last_name,address_id) VALUES(?,?,?);";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,patient.getName());
            statement.setString(2,patient.getLastName());
            statement.setInt(3,patient.getAddress().getId());
            statement.execute();
            statement.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public List<Patient> selectAll() {
        List<Patient> result = new ArrayList<>();
        try{
            String query="SELECT * FROM patient";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                result.add(new Patient(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getDate("register_date").toLocalDate(),
                        new AddressDAO().selectById(resultSet.getInt("address_id"))
                ));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Patient selectById(int id) {
        Patient result = null;
        try{
            String query="SELECT * FROM patient WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                result = new Patient(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"),
                        resultSet.getDate("register_date").toLocalDate(),
                        new AddressDAO().selectById(resultSet.getInt("address_id"))
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
            String query = "DELETE FROM patient WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            statement.execute();
            JOptionPane.showMessageDialog(null, String.format("""
                    Paciente de id %d foi deletado com sucesso.
                    """,id));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Patient patient) {
        try{
            String query = """
                    UPDATE address SET
                    name = ?,
                    last_name = ?,
                    register_date = ?,
                    address_id = ?
                    WHERE id=?""";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,patient.getName());
            statement.setString(2,patient.getLastName());
            statement.setDate(3, Date.valueOf(patient.getRegisterDate()));
            statement.setInt(4,patient.getAddress().getId());
            statement.setInt(5,patient.getId());
            statement.execute();
            JOptionPane.showMessageDialog(null, String.format("""
                    Paciente com id = %d atualizado com sucesso.
                    Novos valores:
                    %5sNome: %d,
                    %5sSobrenome: %s,
                    %5sData de Registro: %s,
                    %5sEndereço: %s,
                    """,
                    patient.getId(),
                    "",patient.getName(),
                    "",patient.getLastName(),
                    "",patient.getRegisterDate(),
                    "",patient.getAddress()));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }


}
