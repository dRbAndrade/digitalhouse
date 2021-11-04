package aula1018.sincrona.templatemethod.mesadetrabalho;

import java.util.HashMap;
import java.util.Map;

public abstract class Menu {

    private Double basePrice;
    private String dishName;
    private Map<String,Double> additionals;

    public Menu(Double basePrice) {
        this.basePrice = basePrice;
        this.additionals = new HashMap<>();
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Map<String, Double> getAdditionals() {
        return additionals;
    }

    public void setAdditionals(Map<String, Double> additionals) {
        this.additionals = additionals;
    }

    public String getAdditionalsAsString(){
        final String[] additionals = {""};
        this.additionals.forEach((dish, dishValue) -> additionals[0] += String.format("%5s%s : R$%.2f%n","",dish,dishValue) );
        if(additionals[0].equals(""))additionals[0]="Sem adicionais.";
        return additionals[0];
    }

}
