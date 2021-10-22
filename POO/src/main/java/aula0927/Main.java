package aula0927;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FiguraComplexa vagao = new FiguraComplexa();
        FiguraComplexa locomotiva = new FiguraComplexa();

        List<Forma> vagaoFormas = Arrays.asList(
                new Retangulo(5.0, 4.0),
                new Circulo(1.0),
                new Circulo(1.0),
                new Circulo(1.0)
        );

        List<Forma> locomotivaFormas = Arrays.asList(
                new Retangulo(6.0, 4.0),
                new Circulo(1.0),
                new Circulo(1.0),
                new Triangulo(2.0,2.0)
        );

        vagao.getFormas().addAll(vagaoFormas);
        locomotiva.getFormas().addAll(locomotivaFormas);

        System.out.printf("O vagão tem uma área total de: %.3f%n",vagao.calcularArea());
        System.out.printf("A locomotiva tem uma área total de: %.3f%n",locomotiva.calcularArea());

    }

}
