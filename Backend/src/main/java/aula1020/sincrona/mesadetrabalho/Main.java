package main.java.aula1020.sincrona.mesadetrabalho;

public class Main {

    public static void main(String[] args) {

        QualityControl batchControl = new BatchControl(new PackagingControl(new WeightControl(null)));

        Product p = Product.generateRandomProduct();

        batchControl.handleProduct(p);


    }

}
