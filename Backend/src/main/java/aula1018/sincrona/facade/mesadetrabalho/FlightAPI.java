package main.java.aula1018.sincrona.facade.mesadetrabalho;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FlightAPI {

    private static List<Flight> flights;

    public static List<Flight> searchFlight(Cities origin, Cities destination, LocalDate departure, LocalDate returnDate){
        flights = Flight.generateRandomFlights();
        Flight searchParams = new Flight("", origin,destination,departure,returnDate);
        flights = flights.stream().filter(e->e.equals(searchParams)).toList();
        if(flights.size()>2) flights = Arrays.asList(flights.get(0),flights.get(1));
        return flights;
    }

}
