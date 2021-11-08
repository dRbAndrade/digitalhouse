package integrador;

import lombok.Getter;
import lombok.Setter;
import util.Generator;

@Getter
@Setter
public class Address {

    private int number,id;
    private String street,city,state;

    public Address(int id, int number,String street, String city, String state) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("""
                %5sNúmero: %d
                %5sRua: %s
                %5sCidade: %s
                %5sEstado: %s%n""",
                "",number,
                "",street,
                "",city,
                "",state);
    }

    public static Address generateRandomAddress(){
        return new Address(
                1,(int)(Math.random()*9999)+1,
                Generator.generateRandomGibberish((int)(Math.random()*13)+3),
                Generator.generateRandomGibberish((int)(Math.random()*13)+3),
                Generator.generateRandomGibberish((int)(Math.random()*13)+3)
        );

    }
}
