package aula1122;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Transactional(readOnly = true)
    public List<User> findAll(){

        return repository.findAll();

    }

}
