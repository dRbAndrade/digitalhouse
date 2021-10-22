package main.java.aula1018.sincrona.templatemethod.mesadetrabalho;

import main.java.util.Generator;

public class ChildMenu extends Menu{

    private String surprise;
    private Double surpriseValue;

    public ChildMenu(Double basePrice) {
        super(basePrice);
    }

    public String getSurprise() {
        return surprise;
    }

    public void setSurprise(String surprise) {
        this.surprise = surprise;
    }

    public Double getSurpriseValue() {
        return surpriseValue;
    }

    public void setSurpriseValue(Double surpriseValue) {
        this.surpriseValue = surpriseValue;
    }

    public static ChildMenu generateRandomChildMenu(){
        ChildMenu menu = new ChildMenu(Math.random()*90+10);
        menu.setDishName(Generator.generateRandomGibberish((int)(Math.random()*7+3)));
        menu.surprise = Generator.generateRandomGibberish((int)(Math.random()*7+3));
        menu.surpriseValue = Math.random()*30+10;
        return menu;
    }
}
