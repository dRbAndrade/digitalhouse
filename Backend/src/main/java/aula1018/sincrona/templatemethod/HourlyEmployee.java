package aula1018.sincrona.templatemethod;

import util.Generator;

public class HourlyEmployee extends Employee{

    private Integer workedHours;
    private Double hourValue;

    public HourlyEmployee(String firstName, String lastName, String accountNumber) {
        super(firstName, lastName, accountNumber);
    }

    public static HourlyEmployee generateRandomHourlyEmployee(){
        HourlyEmployee employee = new HourlyEmployee(
                Generator.generateRandomGibberish(6),
                Generator.generateRandomGibberish(9),
                Generator.generateRandomNumberSequence(5)
        );
        employee.workedHours = (int) (Math.random()*200);
        employee.hourValue = Math.random()*20+5;
        return employee;
    }

    public Integer getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Integer workedHours) {
        this.workedHours = workedHours;
    }

    public Double getHourValue() {
        return hourValue;
    }

    public void setHourValue(Double hourValue) {
        this.hourValue = hourValue;
    }

}
