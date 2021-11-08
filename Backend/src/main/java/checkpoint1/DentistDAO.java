package checkpoint1;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import util.ConnectionFactory;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DentistDAO implements DAO<Dentist> {

    private static final Logger logger = Logger.getLogger(main.java.aula1027.Log4J.class);
    private Connection connection;

    public DentistDAO(){
        PropertyConfigurator.configure("log4j.properties");
        createTable();
    }

    private void createTable(){
        try {
        connection=ConnectionFactory.getConnection();
        String query = """
                CREATE TABLE IF NOT EXISTS dentist(
                    id int not null auto_increment,
                    name varchar(100) not null,
                    last_name varchar(200) not null,
                    primary key (id)
                );""";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.execute();
            statement = connection.prepareStatement(query);
            statement.execute();
            statement.close();
        } catch (SQLException ex) {
            logger.error("Erro ao criar tabela: "+ex.getMessage());
        }
    }
    @Override
    public void insert(Dentist dentist) {
        try {
            String query;
            query = "INSERT INTO dentist(name,last_name) VALUES(?,?);";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,dentist.getFirstName());
            statement.setString(2,dentist.getLastName());
            statement.execute();
            statement.close();
        }catch (SQLException ex){
            logger.error("Erro ao inserir na tabela: "+ex.getMessage());
        }
    }

    @Override
    public List<Dentist> selectAll() {
        List<Dentist> result = new ArrayList<>();
        try{
            String query="SELECT * FROM dentist";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                result.add(new Dentist(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name")
                ));
            }
        }catch (SQLException ex){
            logger.error("Erro ao pesquisar na tabela: "+ex.getMessage());
        }
        return result;
    }

    @Override
    public Dentist selectById(int id) {
        Dentist result = null;
        try{
            String query="SELECT * FROM dentist WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                result = new Dentist(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name")
                );
            }
        }catch (SQLException ex){
            logger.error("Erro ao pesquisar por id na tabela: "+ex.getMessage());
        }
        return result;

    }

    @Override
    public void delete(int id) {
        try{
            String query = "DELETE FROM dentist WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            statement.execute();
            JOptionPane.showMessageDialog(null, String.format("""
                    Dentista de id %d foi deletado com sucesso.
                    """,id));
        }catch (SQLException ex){
            logger.error("Erro ao deletar na tabela: "+ex.getMessage());
        }
    }

    @Override
    public void update(Dentist dentist) {
        try{
            String query = """
                    UPDATE dentist SET
                    name = ?,
                    last_name = ?
                    WHERE id=?""";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,dentist.getFirstName());
            statement.setString(2,dentist.getLastName());
            statement.setInt(5,dentist.getId());
            statement.execute();
            JOptionPane.showMessageDialog(null, String.format("""
                    Dentist com id = %d atualizado com sucesso.
                    Novos valores:
                    %5sNome: %s,
                    %5sSobrenome: %s
                    """,
                    dentist.getId(),
                    "",dentist.getFirstName(),
                    "",dentist.getLastName()));
        }catch (SQLException ex){
            logger.error("Erro ao atualizar na tabela: "+ex.getMessage());
        }
    }


}
