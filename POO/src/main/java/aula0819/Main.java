package aula0819;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cachorro> cachorroList = Arrays.asList(
                new Cachorro("Armando", LocalDate.of(2015,1,1),6),
                new Cachorro("Arnaldo", LocalDate.of(2016,2,1),5),
                new Cachorro("Armenio", LocalDate.of(2017,3,1),4),
                new Cachorro("Armaria", LocalDate.of(2018,4,1),5),
                new Cachorro("José", LocalDate.of(2020,1,1),6)
        );
        cachorroList.forEach(Cachorro::showInfo);
    }

}