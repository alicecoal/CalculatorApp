package com.example.calculatorapp;

import static com.example.calculatorapp.Utils.solveExpression;
import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class UtilsTest{

    @Test
    public void calculatorAddingTest(){
        assertEquals("59",solveExpression("56+3"));
    }

    @Test
    public void calculatorMultipleAddingTest(){
        assertEquals("59",solveExpression("52+3+4"));
    }

    @Test
    public void calculatorSubtractTest(){
        assertEquals("59",solveExpression("61-2"));
    }

    @Test
    public void calculatorMultipleSubtractTest(){
        assertEquals("59",solveExpression("65-4-2"));
    }

    @Test
    public void calculatorMultiplyTest(){
        assertEquals("9",solveExpression("3*3"));
    }

    @Test
    public void calculatorDivideTest(){
        assertEquals("12",solveExpression("24/2"));
    }

    @Test
    public void calculatorDivideByZeroTest(){
        assertEquals("не число",solveExpression("9/0"));
    }

    @Test
    public void calculatorSinTest(){
        assertEquals("0",solveExpression("sin(0)"));
    }

    @Test
    public void calculatorCosTest(){
        assertEquals("1",solveExpression("cos(0)"));
    }

    @Test
    public void calculatorTanTest(){
        assertEquals("0",solveExpression("tan(0)"));
    }

    @Test
    public void calculatorArcsinTest(){
        assertEquals("0",solveExpression("arcsin(0)"));
    }

    @Test
    public void calculatorArccosTest(){
        assertEquals("0",solveExpression("arccos(1)"));
    }

    @Test
    public void calculatorArctanTest(){
        assertEquals("0",solveExpression("arctan(0)"));
    }

    @Test
    public void calculatorLnTest(){
        assertEquals("0",solveExpression("ln(1)"));
    }

    @Test
    public void calculatorLnInfinityTest(){
        assertEquals("-∞",solveExpression("ln(0)"));
    }

    @Test
    public void calculatorLgTest(){
        assertEquals("0",solveExpression("lg(1)"));
    }

    @Test
    public void calculatorSqrtTest(){
        assertEquals("2",solveExpression("sqrt(4)"));
    }

    @Test
    public void calculatorSqrtNegativeTest(){
        assertEquals("не число",solveExpression("sqrt(-4)"));
    }

    @Test
    public void calculatorAbsNegativeTest(){
        assertEquals("4",solveExpression("abs(-4)"));
    }

    @Test
    public void calculatorAbsPositiveTest(){
        assertEquals("4",solveExpression("abs(4)"));
    }

    @Test
    public void calculatorSqrNegativeTest(){
        assertEquals("16",solveExpression("(-4)^(2)"));
    }

    @Test
    public void calculatorSqrPositiveTest(){
        assertEquals("16",solveExpression("(4)^(2)"));
    }

    @Test
    public void calculatorPositiveXNegativePowerTest(){
        assertEquals("0.0625",solveExpression("(4)^(-2)"));
    }

    @Test
    public void calculatorNegativeXNegativePowerTest(){
        assertEquals("0.04",solveExpression("(-5)^(-2)"));
    }

    @Test
    public void calculatorNegativeXPositivePowerTest(){
        assertEquals("25",solveExpression("(-5)^(2)"));
    }

    @Test
    public void calculatorPiTest(){
        assertEquals("3.14159",solveExpression("pi"));
    }

    @Test
    public void calculatorRadTest(){
        assertEquals("0",solveExpression("rad(0)"));
    }

    @Test
    public void calculatorETest(){
        assertEquals("2.71828",solveExpression("e"));
    }

    @Test
    public void calculatorExpression1Test(){
        assertEquals("17.6",solveExpression("(25-3)*4/5-sqrt(4)*sin(0)"));
    }

    @Test
    public void calculatorExpression2Test(){
        assertEquals("3545.83128",solveExpression("(12/4-89)^(5-9/3)*sin(0.5)"));
    }

    @Test
    public void calculatorExpression3Test(){
        assertEquals("не число",solveExpression("1*---"));
    }

    @Test
    public void calculatorExpression4Test(){
        assertEquals("не число",solveExpression("sqrt(4"));
    }

    @Test
    public void calculatorExpression5Test(){
        assertEquals("не число",solveExpression("^(1)"));
    }

    @Test
    public void calculatorExpression6Test(){
        assertEquals("не число",solveExpression("abc-3"));
    }

    @Test
    public void calculatorExpression7Test(){
        assertEquals("не число",solveExpression("*"));
    }
}