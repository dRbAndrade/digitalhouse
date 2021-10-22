package main.java.aula1018.assincrona.templatemethod;

import java.time.LocalDate;

public class DebitCard extends Card{

    private Double balance;

    public DebitCard(String number, String cvv, LocalDate expirationDate) {
        super(number, cvv, expirationDate);
        balance = Math.random()*10000;
    }

    @Override
    public boolean pay(Double value) {
        if(value>balance)return false;
        balance-=value;
        return true;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
