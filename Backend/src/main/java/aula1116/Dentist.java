package aula1116;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dentist {

    private String name;
    private String lastName;
    private String cro;

    public Dentist(String name, String lastName, String cro) {
        this.name = name;
        this.lastName = lastName;
        this.cro = cro;
    }

    public Dentist(DentistDTO dto){
        this.name = dto.getName();
        this.lastName = dto.getLastName();
        this.cro = dto.getCro();
    }



}
