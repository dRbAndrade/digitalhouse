package main.java.aula1025.testing.mesadetrabalho;

import java.math.BigDecimal;

public class Circle implements Shape {

    private BigDecimal radius;

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return radius.multiply(new BigDecimal("2")).multiply(new BigDecimal(String.valueOf(Math.PI)));
    }
}
