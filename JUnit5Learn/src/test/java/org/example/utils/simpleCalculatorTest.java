package org.example.utils;

import org.example.utils.simpleCalculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.Assertions.*;
public class simpleCalculatorTest  {

    simpleCalculator calc;

    @BeforeEach
    void init() {
        calc = new simpleCalculator();
    }

    @AfterEach
    void cleanup(){
        System.out.println("cleaning up...");
    }

    @Test
    void twoPlusTwoEqualFour(){
        assertEquals(calc.add(2,2),4,"the sum of two numbers should equal four");

    }
    @RepeatedTest(3)
    void onePlusOneShouldEqualTwo(){
        assertEquals(calc.add(1,1),2,"the sum of two numbers should equal two");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    @Tag("exception Throwing test")
    void checkDivideByZero(){
        assertThrows(ArithmeticException.class,()->calc.devide(1,0),"divide by 0 should throw");
    }

}