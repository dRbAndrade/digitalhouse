package main.java.aula1018.sincrona.templatemethod;

import main.java.util.Generator;

public class SalaryEmployee extends Employee{

    private Double grossIncome;
    private Double discount;
    private Double bonus;


    public SalaryEmployee(String firstName, String lastName, String accountNumber) {
        super(firstName, lastName, accountNumber);
    }

    public static SalaryEmployee generateRandomSalaryEmployee(){
        SalaryEmployee employee = new SalaryEmployee(
                Generator.generateRandomGibberish(6),
                Generator.generateRandomGibberish(8),
                Generator.generateRandomNumberSequence(5)
        );
        employee.grossIncome = Double.parseDouble(Generator.generateRandomNumberSequence(4));
        employee.discount = Double.parseDouble(Generator.generateRandomNumberSequence(3));
        employee.bonus = Double.parseDouble(Generator.generateRandomNumberSequence(3));
        return employee;
    }

    public Double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(Double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

}
