package aula1018.sincrona.facade.mesadetrabalho;

import util.Generator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flight {

    private String number;
    private Cities origin;
    private Cities destination;
    private LocalDate departure;
    private LocalDate returnDate;

    public Flight(String number, Cities origin, Cities destination, LocalDate departure, LocalDate returnDate) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.returnDate = returnDate;
    }

    public static List<Flight> generateRandomFlights(){

        List<Flight> flights = new ArrayList<>();

        for (int i = 0; i<5000;i++){

            String number = String.valueOf((int)(Math.random()*9999-Math.random()*1000)+1000);
            LocalDate checkIn = Generator.generateRandomDateWithinRange(2021,2022);
            LocalDate checkOut = LocalDate.now();
            while(checkOut.isBefore(checkIn)){
                checkOut = Generator.generateRandomDateWithinRange(2021,2022);
            }
            flights.add(new Flight(number,Cities.randomCity(),Cities.randomCity(),checkIn,checkOut));

        }

        return flights;


    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Cities getOrigin() {
        return origin;
    }

    public void setOrigin(Cities origin) {
        this.origin = origin;
    }

    public Cities getDestination() {
        return destination;
    }

    public void setDestination(Cities destination) {
        this.destination = destination;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return origin.equals(flight.origin) && destination.equals(flight.destination)
                && (departure.equals(flight.departure) || departure.isAfter(flight.departure))
                && (returnDate.equals(flight.returnDate) || returnDate.isBefore(flight.returnDate));
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, destination, departure, returnDate);
    }
    @Override
    public String toString() {
        String formatedNumber = String.format("%4s",number).replace(" ","0");
        return String.format("""
                Voo: %4s
                Origem: %s
                Destino: %s
                Saída: %s
                Retorno: %s%n""",
                formatedNumber,origin,destination,
                departure,returnDate);
    }
}
