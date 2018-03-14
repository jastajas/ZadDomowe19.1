package com.example.domowe19a;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void showSumFor10() {
//given
        Calculator calc = new Calculator();
        int limit = 10;
//when
        int result = calc.calculate(limit);
//then
        Assert.assertThat(result, CoreMatchers.is(23));
    }

    @Test
    public void showSumFor100() {
//given
        Calculator calc = new Calculator();
        int limit = 100;
//when
        int result = calc.calculate(limit);
//then
        Assert.assertThat(result, CoreMatchers.is(2318));
    }

    @Test
    public void showSumFor1000() {
//given
        Calculator calc = new Calculator();
        int limit = 1000;
//when
        int result = calc.calculate(limit);
//then
        Assert.assertThat(result, CoreMatchers.is(233168));
    }

    @Test
    public void showSumForNegNo() {
//given
        Calculator calc = new Calculator();
        int limit = -15;
//when
        int result = calc.calculate(limit);
//then
        Assert.assertThat(result, CoreMatchers.is(0));
    }

}

