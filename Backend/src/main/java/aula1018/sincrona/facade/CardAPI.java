package main.java.aula1018.sincrona.facade;

public class CardAPI {

    public static double applyDiscount(Card card){
        if (card.getBank().equalsIgnoreCase("Star Bank"))return 0.20;
        return 0;
    }

}
