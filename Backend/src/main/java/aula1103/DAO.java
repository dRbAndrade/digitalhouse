package aula1103;

public interface DAO<T> {

    public void insert(T t);

    public void delete(int id);

    public void selectAll();

    public void selectById(int id);

}
