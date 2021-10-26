package main.java.aula1020.sincrona;

import main.java.util.Generator;

public class Email {

    private String origin, recipient, subject;

    public Email(String origin, String recipient, String subject) {
        this.origin = origin;
        this.recipient = recipient;
        this.subject = subject;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static Email generateRandomEmail(){
        int seed = (int) (Math.random()*6);
        String recipient;
        String subject;
        switch (seed){
            case 0 -> {recipient = "gerencia@colmeia.com";subject = "Gerência";}
            case 1 -> {recipient = "comercial@colmeia.com";subject = "Comecrial";}
            case 2 -> {recipient = "tecnica@colmeia.com";subject = "Técnico";}
            default -> {
                recipient = Generator.generateRandomGibberish(5) + "@gmail.com";
                subject = Generator.generateRandomGibberish(7);
            }
        }
        return new Email(Generator.generateRandomGibberish(6)+"@gmail.com",
                recipient, subject);

    }
}
