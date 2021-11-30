package checkpoint2.services;

import checkpoint2.dtos.DentistDTO;
import checkpoint2.models.Dentist;
import checkpoint2.repositories.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DentistService {

    private final DentistRepository repository;

    @Autowired
    public DentistService(DentistRepository repository){
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Page<DentistDTO> findAllPaged(Pageable pageable){
        return repository.findAll(pageable).map(DentistDTO::new);
    }

    @Transactional
    public DentistDTO persistNew(DentistDTO dto){
        return new DentistDTO(repository.save(new Dentist(dto)));
    }
    @Transactional
    public DentistDTO update(long id,DentistDTO dto){
        Dentist entity = repository.getById(id);
        entity.setCro(dto.getCro());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        return new DentistDTO(repository.save(entity));
    }
    @Transactional
    public void delete(long id){
        repository.deleteById(id);
    }

}
