package checkpoint2.services;

import checkpoint2.dtos.PatientDTO;
import checkpoint2.models.Patient;
import checkpoint2.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientService {

    private final PatientRepository repository;

    @Autowired
    public PatientService(PatientRepository repository){
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Page<PatientDTO> findAllPaged(Pageable pageable){
        return repository.findAll(pageable).map(PatientDTO::new);
    }

    @Transactional
    public PatientDTO persistNew(PatientDTO dto){
        return new PatientDTO(repository.save(new Patient(dto)));
    }
    @Transactional
    public PatientDTO update(long id,PatientDTO dto){
        Patient entity = repository.getById(id);
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        return new PatientDTO(repository.save(entity));
    }
    @Transactional
    public void delete(long id){
        repository.deleteById(id);
    }

}
