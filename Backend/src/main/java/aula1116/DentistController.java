package aula1116;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentists")
public class DentistController {

    @Autowired
    private DentistService service;

    @GetMapping("/{id}")
    public Dentist getDentistById(@PathVariable int id){
        return service.findById(id);
    }
    @GetMapping
    public List<Dentist> getAllDentists(){
        return service.findAll();
    }
    @PostMapping
    public Dentist persistDentist(@RequestBody Dentist dentist){
        return service.save(dentist);
    }
    @DeleteMapping("/{id}")
    public Dentist deleteDentist(@PathVariable int id){
        return service.delete(id);
    }
    @PutMapping
    public Dentist updateDentist(@RequestBody DentistDTO dto){
        return service.update(dto);
    }

}
