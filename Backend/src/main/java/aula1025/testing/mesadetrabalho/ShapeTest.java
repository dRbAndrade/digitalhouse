package main.java.aula1025.testing.mesadetrabalho;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void verifyCirclePerimeter(){
        Circle circle = new Circle(new BigDecimal("4"));
        BigDecimal perimeter = circle.calculatePerimeter();
        assertEquals(new BigDecimal("2").multiply(new BigDecimal("4")).multiply(new BigDecimal(String.valueOf(Math.PI))), perimeter);
    }

    @Test
    void verifySquarePerimeter(){
        Square square = new Square(new BigDecimal("4"));
        BigDecimal perimeter = square.calculatePerimeter();
        assertEquals(new BigDecimal("16.0"),perimeter);
    }

}