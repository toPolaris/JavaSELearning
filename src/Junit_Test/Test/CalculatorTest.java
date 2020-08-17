package Junit_Test.Test;

import Junit_Test.Calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * learning.Junit_Test
 * Created on 2020/8/9 20:16
 *
 * @author Protein
 */
public class CalculatorTest {
    @Before
    public void start(){
        System.out.println("Loading...");
    }
    @After
    public void close(){
        System.out.println("Closing...");
    }
    @Test
    public void testAdd(){
        start();
        System.out.println("testAdd Running...");
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        Assertions.assertEquals(3,result);
        close();
    }
}
