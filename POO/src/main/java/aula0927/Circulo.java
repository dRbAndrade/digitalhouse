package aula0927;

public class Circulo implements Forma{

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*(Math.pow(raio,2));
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
