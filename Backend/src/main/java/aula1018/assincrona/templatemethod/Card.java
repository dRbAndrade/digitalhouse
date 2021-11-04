package aula1018.assincrona.templatemethod;

import java.time.LocalDate;

public abstract class Card {

    private String number;
    private String cvv;
    private LocalDate expirationDate;

    public Card(String number, String cvv, LocalDate expirationDate) {
        this.number = number;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public abstract boolean pay(Double value);

    public String getCensoredNumber(){
        return "******"+number.substring(6,10)+"******";
    }
}
