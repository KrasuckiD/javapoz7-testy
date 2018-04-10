package com.sda.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init(){
        this.calculator = new Calculator();
    }
    @Test
    public void testAdd (){
        //when
        int sum = calculator.sum(3,5);
        //them
        Assert.assertEquals("Result is not 8",8, sum);
    }
    @Test
    public void testReg(){
        //when
        int reg = calculator.reg(10,5);
        //them
        Assert.assertEquals("Result is not 5", 5, reg);
    }
@Test
    public void testMul(){
        //when
        int mul = calculator.mul(10,5);
        //them
        Assert.assertEquals("Result is not 50", 50, mul);
    }
@Test
    public void testSub(){
        //when
        int sub = calculator.sub(10,5);
        //them
        Assert.assertEquals("Result is not 2", 2, sub);
    }
}
