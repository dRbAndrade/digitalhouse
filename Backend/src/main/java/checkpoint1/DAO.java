package checkpoint1;

import java.util.List;

public interface DAO<T> {

    void insert(T t);
    List<T> selectAll();
    T selectById(int id);
    void delete(int id);
    void update(T t);


}
