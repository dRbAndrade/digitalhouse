package aula1018.sincrona.facade;

import util.Generator;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private String type;
    private Double value;

    public Product(String name, String type, Double value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public static List<Product> generateRandomProducts(){

        List<Product> products = new ArrayList<>();

        for(int i=0;i<10;i++){

            String type = Generator.generateRandomGibberish(6);
            String name = Generator.generateRandomGibberish(10);
            Double value = Math.random()*100;
            if(i%2==0)type = "Latas";

            products.add(new Product(name,type,value));

        }

        return products;

    }
}
