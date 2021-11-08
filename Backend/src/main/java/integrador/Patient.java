package integrador;

import lombok.Getter;
import lombok.Setter;
import util.Generator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
@Setter
public class Patient {

    private int id;
    private String name, lastName;
    private LocalDate registerDate;
    private Address address;

    public Patient(int id,String name, String lastName, LocalDate registerDate, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.registerDate = registerDate;
        this.address = address;
    }

    @Override
    public String toString() {
        registerDate = registerDate==null? LocalDate.of(1,1,1):registerDate;
        return String.format("""
                id: %d
                Nome: %s
                Sobrenome: %s
                Data de Registro: %s
                Endereço: 
                %s""",
                id,
                name,
                lastName,
                registerDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                address);
    }

    public static Patient generateRandomPatient(){

        List<Address> addresses = new AddressDAO().selectAll();

        return new Patient(
                0,
                Generator.generateRandomGibberish((int)(Math.random()*7)+3),
                Generator.generateRandomGibberish((int)(Math.random()*7)+3),
                null, addresses.get(addresses.size()-1)
        );
    }
}
