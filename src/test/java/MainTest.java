
import static org.junit.Assert.*;

import org.example.Main;
import org.junit.Test;

public class MainTest {
    private static final double DELTA = 1e-15;


    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, Main.factorial(6), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 6, Main.factorial(3), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, Main.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 10, Main.factorial(6), DELTA);

    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, Main.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 1, Main.power(1, 3), DELTA);
        assertEquals("Finding power for True Positive", 81, Main.power(3, 4), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, Main.power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", -7, Main.power(3, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 99, Main.power(4, 3), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 4, Main.squareRoot(16), DELTA);
        assertEquals("Finding square root for True Positive", 1, Main.squareRoot(1), DELTA);
        assertEquals("Finding square root for True Positive", 9, Main.squareRoot(81), DELTA);
        assertEquals("Finding square root for True Positive", 6, Main.squareRoot(36), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, Main.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 3, Main.squareRoot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, Main.squareRoot(81), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, Main.squareRoot(36), DELTA);

    }

}

