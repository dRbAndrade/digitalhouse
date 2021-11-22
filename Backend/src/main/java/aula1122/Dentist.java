package aula1122;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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
