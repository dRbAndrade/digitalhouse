package main.java.aula1018.sincrona.facade.mesadetrabalho;

import main.java.util.Generator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hotel {

    private String name;
    private Cities city;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Hotel(String name, Cities city, LocalDate checkIn, LocalDate checkOut) {
        this.name = name;
        this.city = city;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return city.equals(hotel.city)
                && (checkIn.isAfter(hotel.checkIn) || checkIn.equals(hotel.checkIn))
                && (checkOut.isBefore(hotel.checkOut) || checkOut.equals(hotel.checkOut));
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, checkIn, checkOut);
    }

    public static List<Hotel> generateRandomHotels(){

        List<Hotel> hotels = new ArrayList<>();

        for (int i = 0; i<1000;i++){

            String name = Generator.generateRandomGibberish(10);
            LocalDate checkIn = Generator.generateRandomDateWithinRange(2021,2022);
            LocalDate checkOut = LocalDate.now();
            while(checkOut.isBefore(checkIn)){
                checkOut = Generator.generateRandomDateWithinRange(2021,2022);
            }
            hotels.add(new Hotel(name,Cities.randomCity(),checkIn,checkOut));

        }

        return hotels;


    }

    @Override
    public String toString() {
        return String.format("""
                  Hotel: %s
                  Cidade: %s
                  CheckIn: %s
                  CheckOut: %s%n""",
                name,city,
                checkIn,checkOut);
    }
}
