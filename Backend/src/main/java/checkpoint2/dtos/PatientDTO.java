package checkpoint2.dtos;

import checkpoint2.models.Patient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDTO {

    private Long id;
    private String firstName;
    private String lastName;

    public PatientDTO() {
    }

    public PatientDTO(Patient entity) {
        this.id = entity.getId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
    }

}
