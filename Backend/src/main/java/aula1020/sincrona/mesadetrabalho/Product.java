package main.java.aula1020.sincrona.mesadetrabalho;

import main.java.util.Generator;

public class Product {
    private String name;
    private int batch;
    private int weight;
    private String packaging;

    public Product(String name, int batch, int weight, String packaging) {
        this.name = name;
        this.batch = batch;
        this.weight = weight;
        this.packaging = packaging;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public static Product generateRandomProduct(){
        int batch = (int)(Math.random()*4000);
        int weight = (int)(Math.random()*2600);
        int seed = (int)(Math.random()*4);
        String packaging;
        switch (seed){
            case 0-> packaging = "Saudável";
            case 1-> packaging = "Quase saudável";
            default ->  packaging = "Doente";
        }
        return new Product(
                Generator.generateRandomGibberish(6),
                batch, weight, packaging
        );
    }
}
