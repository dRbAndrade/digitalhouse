package aula1018.sincrona.facade.mesadetrabalho;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class HotelAPI {

    private static List<Hotel> hotels;

    public static List<Hotel> searchHotel(Cities city, LocalDate checkIn, LocalDate checkout){
        hotels = Hotel.generateRandomHotels();
        Hotel searchParams = new Hotel("", city,checkIn,checkout);
        hotels = hotels.stream().filter(e->e.equals(searchParams)).toList();
        if(hotels.size()>2) hotels = Arrays.asList(hotels.get(0),hotels.get(1));
        return hotels;
    }

}
