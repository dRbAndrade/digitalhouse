package aula1116;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.TreeSet;

@Service
public class DentistService {

    private static TreeSet<DentistDTO> dentists = new TreeSet<>();

    public List<Dentist> findAll() {
        return dentists.stream().map(Dentist::new).toList();
    }


    public Dentist findById(int id) {
        return dentists.stream().filter(e->e.getId()==id).map(Dentist::new).findFirst().get();
    }

    public Dentist save(Dentist dentist) {
        DentistDTO dto = new DentistDTO(dentist);
        dto.setId(dentists.size()+1);
        dentists.add(dto);
        return dentist;
    }

    public Dentist delete(int id) {

        DentistDTO dto = dentists.stream().filter(e->e.getId()==id).findFirst().get();
        dentists.remove(dto);
        return new Dentist(dto);
    }

    public Dentist update(DentistDTO dto) {

        DentistDTO dto2 = dentists.stream().filter(e->e.getId()==dto.getId()).findFirst().get();
        dentists.remove(dto2);
        dentists.add(dto);
        return new Dentist(dto);

    }
}
