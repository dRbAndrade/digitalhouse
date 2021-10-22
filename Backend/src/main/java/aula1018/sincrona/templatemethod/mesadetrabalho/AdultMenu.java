package main.java.aula1018.sincrona.templatemethod.mesadetrabalho;

import main.java.util.Generator;

public class AdultMenu extends Menu{



    public AdultMenu(Double basePrice) {
        super(basePrice);
    }

    public static AdultMenu generateRandomAdultMenu(){
        AdultMenu menu = new AdultMenu(Math.random()*90+10);
        menu.setDishName(Generator.generateRandomGibberish((int)(Math.random()*7+3)));
        return menu;
    }

}
