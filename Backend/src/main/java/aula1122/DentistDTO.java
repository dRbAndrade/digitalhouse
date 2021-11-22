package aula1122;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class DentistDTO {

    private int id;
    private String name;
    private String lastName;
    private String cro;

    public DentistDTO(Dentist dentist) {

        this.name = dentist.getName();
        this.lastName = dentist.getLastName();
        this.cro = dentist.getCro();

    }

    public DentistDTO() {
    }

    public DentistDTO(int id, String name, String lastName, String cro) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.cro = cro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DentistDTO that = (DentistDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(cro, that.cro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, cro);
    }
}
