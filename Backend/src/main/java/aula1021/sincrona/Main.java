package aula1021.sincrona;

import util.Generator;

import java.text.ParseException;


public class Main {

    public static void main(String[] args) throws ParseException {

        Person person = new Person(
                Generator.generateRandomGibberish(6),
                Generator.generateRandomGibberish(10),
                Generator.generateRandomNumberSequence(10),
                Generator.generateRandomGibberish(4),
                Generator.generateRandomDateWithinRange(2021,2021)
        );

        Vaccination proxy = new VaccinationProxy(new VaccinationService());

        proxy.vaccinate(person);

    }

}
