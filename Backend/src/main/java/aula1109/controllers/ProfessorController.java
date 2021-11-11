package aula1109.controllers;

import aula1109.model.enitity.Professor;
import aula1109.model.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @GetMapping("/list")
    public List<Professor> getTrainer(){
        return service.listProfessors();
    }


}
