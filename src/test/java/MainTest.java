
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

}

