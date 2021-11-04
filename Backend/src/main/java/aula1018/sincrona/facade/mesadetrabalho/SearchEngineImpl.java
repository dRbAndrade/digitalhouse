package aula1018.sincrona.facade.mesadetrabalho;

import util.Generator;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class SearchEngineImpl implements SearchEngineFacade{

    @Override
    public List[] searchHotelsAndFlights(Cities origin, Cities destination, LocalDate depature, LocalDate returnDate) {

        return new List[] {
                FlightAPI.searchFlight(origin,destination,depature,returnDate),
                HotelAPI.searchHotel(destination,depature,returnDate)
        };

    }

    public static void main(String[] args) {


        Cities origin = Cities.randomCity();
        Cities destination = Cities.randomCity();
        LocalDate departure = Generator.generateRandomDateWithinRange(2021, 2022);
        LocalDate returnDate = Generator.generateRandomDateWithinRange(2021, 2022);
        while (returnDate.isBefore(departure)||destination.equals(origin)) {
            destination = Cities.randomCity();
            returnDate = Generator.generateRandomDateWithinRange(2021, 2022);
        }

        List[] hotelsAndFlights = new SearchEngineImpl()
                .searchHotelsAndFlights(origin, destination, departure, returnDate);

        JOptionPane.showMessageDialog(null,
                String.format(
                        """
                        Origem: %s
                        Destino: %s
                        Data de inicio: %s
                        Data de retorno: %s
                                                
                        Voos: 
                        %s                      
                        Hoteis:
                        %s""",
                        origin,
                        destination,
                        departure,
                        returnDate,
                        flightsToString(hotelsAndFlights[0]),
                        hotelsToString(hotelsAndFlights[1]))
        );

    }

    private static String hotelsToString(List hotels) {
        var ref = new Object() {
            String toString = "";
        };
        hotels.forEach(e-> ref.toString += e.toString()+"\n");
        if (ref.toString.equals(""))ref.toString="Nenhum hotel encontrado.";
        return ref.toString;
    }

    private static String flightsToString(List flights) {
        var ref = new Object() {
            String toString = "";
        };
        flights.forEach(e-> ref.toString += e.toString()+"\n");
        if (ref.toString.equals(""))ref.toString="Nenhum voo encontrado.";
        return ref.toString;
    }


}
