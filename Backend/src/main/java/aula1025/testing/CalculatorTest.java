package aula1025.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalculatorTest {

    @Test
    void deveRetornarZero(){
        double sum = Calculator.sum(1,2,3);
        Assertions.assertEquals(1+2+3,sum);
    }

}