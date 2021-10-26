package main.java.aula1025.testing;

public class Calculator {

    public static double sum(double ...numbers){
        double sum = 0;
        for (double number:numbers) {
            sum+=number;
        }
        return sum;
    }

}
