package aula1109.model.service;

import aula1109.model.enitity.Professor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProfessorService {

    public List<Professor> listProfessors(){
        return Arrays.asList(new Professor("Matheus"), new Professor("Andrade"));
    }

}
