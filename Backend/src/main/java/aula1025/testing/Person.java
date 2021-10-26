package main.java.aula1025.testing;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDay;

    public Person(String firstName, String lastName, String email, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDay = birthDay;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public boolean isOver18(){
        return Period.between(birthDay, LocalDate.of(2021, 10, 25)).getYears() >= 18;
    }

}
