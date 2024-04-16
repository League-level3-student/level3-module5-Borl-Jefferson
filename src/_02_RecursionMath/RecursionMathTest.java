package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(5, RecursionMath.recursiveDivision(50, 10));
    	assertEquals(3, RecursionMath.recursiveDivision(21, 7));
    	assertEquals(9, RecursionMath.recursiveDivision(108, 12));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(25, RecursionMath.recursivePower(5, 2));
    	assertEquals(125, RecursionMath.recursivePower(5, 3));
    	assertEquals(64, RecursionMath.recursivePower(4, 3));
    }
}
