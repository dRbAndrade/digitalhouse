package main.java.aula1021.sincrona;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VaccinationService implements Vaccination{
    @Override
    public void vaccinate(Person person) {
        String formattedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        JOptionPane.showMessageDialog(null, String.format("""
                %s, portador do RH: %s, tomou a vacina %s no dia %s""",
                person,person.getDocument(),person.getVaccine(), formattedDate));
    }
}
