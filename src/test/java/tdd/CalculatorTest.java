package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator test = new Calculator();

    @Test
    public void setTest(){

    assertEquals(8, test.add(3,5));
    assertEquals(4, test.subtract(10,6));
    assertEquals(6, test.multiply(2,3));
    assertEquals(3, test.divide(9,3));
    assertEquals(6, test.add("1,2,3"));
    assertEquals(6,test.add(new int[]{1,2,3}));


    }
}