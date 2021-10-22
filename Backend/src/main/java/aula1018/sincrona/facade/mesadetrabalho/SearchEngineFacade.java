package main.java.aula1018.sincrona.facade.mesadetrabalho;

import java.time.LocalDate;
import java.util.List;

public interface SearchEngineFacade {

    List[] searchHotelsAndFlights(Cities origin, Cities destination, LocalDate depature, LocalDate returnDate);

}
