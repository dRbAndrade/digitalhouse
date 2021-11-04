package aula1103;

import java.util.List;

public interface DAO<T> {

    public void insert(T t);

    public void delete(int id);

    public List<T> selectAll();

    public T selectById(int id);

}
