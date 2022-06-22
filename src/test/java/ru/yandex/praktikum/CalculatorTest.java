package ru.yandex.praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(2,3);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void sum1() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(-2,3);
        int expected = -1;
        assertEquals(expected, actual);
    }
}
