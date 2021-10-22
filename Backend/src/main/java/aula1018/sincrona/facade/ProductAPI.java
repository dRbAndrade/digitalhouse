package main.java.aula1018.sincrona.facade;

public class ProductAPI {

    public static double applyDiscount(Product product){
        if (product.getType().equalsIgnoreCase("latas"))return 0.10;
        return 0;
    }

}
