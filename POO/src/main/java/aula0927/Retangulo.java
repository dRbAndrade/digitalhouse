package aula0927;

public class Retangulo implements Forma{

    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura*largura;
    }

}
