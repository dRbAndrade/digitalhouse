package aula1018.sincrona.facade;

import util.Generator;

public class Card {

    private String number;
    private String bank;

    public Card(String number, String bank) {
        this.number = number;
        this.bank = bank;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public static Card generateRandomCard(){

        String number = Generator.generateRandomNumberSequence(16);
        String bank = Generator.generateRandomGibberish(8);
        int coinFlip = (int) (Math.random()*2);
        if(coinFlip%2==0) bank = "Star Bank";

        return new Card(number,bank);

    }
}
