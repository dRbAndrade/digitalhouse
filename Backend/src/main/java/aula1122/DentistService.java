package aula1122;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.TreeSet;

@Service
public class DentistService {

    @Autowired
    private  DentistRepository repository;

    public List<Dentist> findAll() {
        return repository.findAll();
    }


    public Dentist findById(long id) {
        return repository.findById(id).orElseThrow();
    }

    public Dentist save(Dentist dentist) {
        dentist = repository.save(dentist);
        return dentist;
    }

    public void delete(long id) {

        repository.deleteById(id);

    }

    public Dentist update(DentistDTO dto) {

        Dentist dentist = new Dentist(dto);
        dentist = repository.save(dentist);
        return dentist;

    }
}
