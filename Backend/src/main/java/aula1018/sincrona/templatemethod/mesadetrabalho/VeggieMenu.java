package main.java.aula1018.sincrona.templatemethod.mesadetrabalho;

import main.java.util.Generator;

public class VeggieMenu extends Menu{

    private String specialPackaging;
    private Double condimentsValue;


    public VeggieMenu(Double basePrice) {
        super(basePrice);
        condimentsValue = 0.01;
    }

    public String getSpecialPackaging() {
        return specialPackaging;
    }

    public void setSpecialPackaging(String specialPackaging) {
        this.specialPackaging = specialPackaging;
    }

    public Double getCondimentsValue() {
        return condimentsValue;
    }

    public void setCondimentsValue(Double condimentsValue) {
        this.condimentsValue = condimentsValue;
    }

    public static VeggieMenu generateRandomVeggieMenu(){
        VeggieMenu menu = new VeggieMenu(Math.random()*90+10);
        menu.setDishName(Generator.generateRandomGibberish((int)(Math.random()*7+3)));
        menu.specialPackaging = "Embalagem especial para temperos.";
        return menu;
    }
}
