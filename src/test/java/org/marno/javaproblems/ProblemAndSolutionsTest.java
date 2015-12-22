package org.marno.javaproblems;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marno Kulmala
 */
public class ProblemAndSolutionsTest {
    
    private ProblemAndSolutions problems;
    
    @Before
    public void setUp() {
        problems = new ProblemAndSolutions();
    }
    
    @After
    public void tearDown() {
        problems = null;
    }

    /**
     * Test of fibo method, of class ProblemAndSolutions.
     */
    @Test
    public void testFibo() {
        int num = 1;
        int expResult = 1;
        @SuppressWarnings("static-access")
        int result = problems.fibo(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of fibo2 method, of class ProblemAndSolutions.
     */
    @Test
    public void testFibo2() {
        int num = 2;
        int expResult = 1;
        @SuppressWarnings("static-access")
        int result = problems.fibo2(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of fizzBuzz method, of class ProblemAndSolutions.
     */
    @Test
    public void testFizzBuzz() {
        int doToThisPoint = 5;
        @SuppressWarnings("UnusedAssignment")
        StringBuffer testBuffer = new StringBuffer();
        testBuffer = problems.fizzBuzz(doToThisPoint);

        assertEquals(11, testBuffer.length());
    }
    
    /**
     * Test to prove that 112 is not a Armstrong number
     */
    @Test
    @SuppressWarnings("static-access")
    public void testNumberIsNotArmstrongNumber() {
        int number = 112;
        
        assertFalse(problems.isArmStrong(number));
    }
    
    /**
     * Test to prove that 153 is a Armstrong number
     */
    @Test
    @SuppressWarnings("static-access")
    public void testNumberIsArmstrongNumber() {
        int number = 153;
        
        assertTrue(problems.isArmStrong(number));
    }
    
    /**
     * Test String reverse
     */
    @Test
    @SuppressWarnings("static-access")
    public void testThatRockIsKcorReversed() {
        String testString = "rock";
        String reversed = "kcor";
        
        assertEquals(reversed, problems.reverse(testString));
    }
    
    /**
     * Recursive factorial test
     */
    @Test
    @SuppressWarnings("static-access")
    public void testThatNumber5FactorialIs120Recursively() {
        assertEquals(120,problems.factRecursive(5));
    }
    
    /**
     * Iterative factorial test
     */
    @Test
    @SuppressWarnings("static-access")
    public void testThatNumber5FactorialIs120RIteratively() {
        assertEquals(120,problems.factIterative(5));
    }
    
}
