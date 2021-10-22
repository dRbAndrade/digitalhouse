package main.java.aula1018.assincrona.templatemethod;

import main.java.util.Generator;

public class Main {

    public static void main(String[] args) {

        Card creditCard = new CreditCard(
                Generator.generateRandomNumberSequence(16),
                Generator.generateRandomNumberSequence(3),
                Generator.generateRandomDateWithinRange(2021,2025));
        Card debitCard = new DebitCard(
                Generator.generateRandomNumberSequence(16),
                Generator.generateRandomNumberSequence(3),
                Generator.generateRandomDateWithinRange(2021,2025));

        Processor creditProcessor = new CreditProcessor();
        Processor debitProcessor = new DebitProcessor();

        creditProcessor.processPayment(creditCard, 4000.0);
        debitProcessor.processPayment(debitCard, 4000.0);

    }

}
