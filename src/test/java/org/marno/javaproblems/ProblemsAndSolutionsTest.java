package org.marno.javaproblems;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marno Kulmala
 */
public class ProblemsAndSolutionsTest {
    
    private ProblemsAndSolutions problems;
    
    @Before
    public void setUp() {
        problems = new ProblemsAndSolutions();
    }
    
    @After
    public void tearDown() {
        problems = null;
    }

    /** palindrome tests */
    @Test
    public void testMaamIsPalindrome() {
        assertTrue(ProblemsAndSolutions.isGivenStringPalindrome("maam"));
    }

    @Test
    public void testMamaIsNotPalindrome() {
        assertFalse(ProblemsAndSolutions.isGivenStringPalindrome("mama"));
    }

    @Test
    public void test122IsNotPalindrome() {
        assertFalse(ProblemsAndSolutions.isGivenNumberPalindrome(122));
    }

    @Test
    public void test101IsPalindrome() {
        assertTrue(ProblemsAndSolutions.isGivenNumberPalindrome(101));
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
    
    /**
     * Test to replace given character with another in a String
     */
    @Test
    public void testReplacer() {
        String replacedString = "Sbarb";
        String str = "Start";
        char ch = 't';
        char replacer = 'b';
        assertEquals(replacedString, ProblemsAndSolutions.replace(str, ch, replacer));
    }
    
    /**
     * Test for printing a * pyramid
     */
    @Test
    public void testPrintingAStructure() {
        ProblemsAndSolutions.printStructure(5);
    }
}
