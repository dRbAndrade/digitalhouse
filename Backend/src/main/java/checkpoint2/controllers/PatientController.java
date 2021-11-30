package checkpoint2.controllers;

import checkpoint2.DentistApp;
import checkpoint2.dtos.PatientDTO;
import checkpoint2.services.PatientService;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private PatientService service;

    private static Logger log = Logger.getLogger(DentistApp.class.getName());

    @Autowired
    public PatientController(PatientService service) {
        this.service = service;
        PropertyConfigurator.configure(DentistApp.class.getResource("log4j.properties"));
    }

    @GetMapping
    public ResponseEntity<Page<PatientDTO>> findAll(Pageable pageable){
        try {
            return ResponseEntity.ok(service.findAllPaged(pageable));
        }catch(Exception ex){
            log.error(ex.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<PatientDTO> persistNew(@RequestBody PatientDTO dto){
        try {
            return ResponseEntity.ok(service.persistNew(dto));
        }catch(Exception ex){
            log.error(ex.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<PatientDTO> update(@PathVariable Long id,
                                             @RequestBody PatientDTO dto){

        try {
            return ResponseEntity.ok(service.update(id,dto));
        }catch(Exception ex){
            log.error(ex.getMessage());
            return ResponseEntity.badRequest().build();
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try {
            service.delete(id);
            return ResponseEntity.noContent().build();
        }catch(Exception ex){
            log.error(ex.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }

}
