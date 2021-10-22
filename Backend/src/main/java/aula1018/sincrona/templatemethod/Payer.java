package main.java.aula1018.sincrona.templatemethod;

import javax.swing.*;

public abstract class Payer {

    public void payUp(Employee e){
        Double amount = calculateSalary(e);
        print(e);
        deposit(e,amount);
    }

    protected abstract void deposit(Employee e, Double amount);

    protected abstract void print(Employee e);

    protected abstract Double calculateSalary(Employee e);


}
