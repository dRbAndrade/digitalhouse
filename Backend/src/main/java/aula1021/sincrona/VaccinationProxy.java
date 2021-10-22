package main.java.aula1021.sincrona;

import javax.swing.*;
import java.time.LocalDate;

public class VaccinationProxy implements Vaccination {

    private VaccinationService vaccinationService;

    public VaccinationProxy(VaccinationService vaccinationService){
        this.vaccinationService = vaccinationService;
    }

    @Override
    public void vaccinate(Person person) {
        LocalDate today = LocalDate.now();

        if (person.getVaccinationDate().isBefore(today) || person.getVaccinationDate().isEqual(today)) {
            vaccinationService.vaccinate(person);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Ainda não chegou seu dia de se vacinar");
        }

    }
}
