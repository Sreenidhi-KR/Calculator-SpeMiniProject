
import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;


    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, Calculator.factorial(6), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 6, Calculator.factorial(3), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, Calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 10, Calculator.factorial(6), DELTA);

    }

}

