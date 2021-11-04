package aula1018.sincrona.facade;

public class QuantityAPI {

    public static double applyDiscount(Integer quantity){
        if (quantity>12)return 0.15;
        return 0;
    }

}
