package main.java.aula1025.testing.mesadetrabalho;

import java.math.BigDecimal;

public class Square implements Shape{

    private BigDecimal side;

    public Square(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return side.multiply(new BigDecimal("4.0"));
    }
}
