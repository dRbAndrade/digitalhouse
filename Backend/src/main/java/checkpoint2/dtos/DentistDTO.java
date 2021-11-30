package checkpoint2.dtos;

import checkpoint2.models.Dentist;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DentistDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String cro;

    public DentistDTO() {
    }

    public DentistDTO(Dentist entity) {
        this.id = entity.getId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.cro = entity.getCro();
    }

}
