package checkpoint1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dentist {

    private int id;
    private String firstName;
    private String lastName;

    public Dentist() {
    }

    public Dentist(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
