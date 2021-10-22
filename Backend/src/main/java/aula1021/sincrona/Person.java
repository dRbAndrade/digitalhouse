package main.java.aula1021.sincrona;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private String document;
    private String vaccine;
    private LocalDate vaccinationDate;

    public Person(String firstName, String lastName, String document, String vaccine, LocalDate vaccinationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        this.vaccine = vaccine;
        this.vaccinationDate = vaccinationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public LocalDate getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(LocalDate vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
