package org.marno.javaproblems;

/**
 * Holds some usual Java interview problems and their possible solutions
 * 
 * @author Marno Kulmala
 */
public class ProblemAndSolutions {

    /**
     * Recursive fibonacci
     *
     * @param num
     * @return
     */
    public static int fibo(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibo(num - 1) + fibo(num - 2);
    }

    /**
     * Iterative fibonacci
     *
     * @param num
     * @return
     */
    public static int fibo2(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= num; i++) {

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci;
    }

    /**
     * Fizzbuzz problems solution
     *
     * @param doToThisPoint
     * @return StringBuffer holding the fizzBuzz
     */
    public StringBuffer fizzBuzz(int doToThisPoint) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 1; i <= doToThisPoint; i++) {
            if (i % (3 * 5) == 0) {
                buffer.append("FizzBuzz");
            } else if (i % 5 == 0) {
                buffer.append("Buzz");
            } else if (i % 3 == 0) {
                buffer.append("Fizz");
            } else {
                buffer.append(i);
            }
        }

        return buffer;
    }

    /**
     * Is given number Armstrongs number:
     *
     * An Armstrong number of three digit is a number whose sum of cubes of its
     * digit is equal * to its number. For example 153 is an Armstrong number of
     * 3 digit because 1^3+5^3+3^3 or 1+125+27=153
     *
     * @param number
     * @return boolean
     */
    public static boolean isArmStrong(int number) {
        int result = 0;
        int orig = number;

        while (number != 0) {
            int remainder = number % 10;
            result = result + remainder * remainder * remainder;
            number = number / 10;
        }
        //number is Armstrong return true
        return orig == result;
    }

    /**
     * String reverse without StringBuilder or StringBuffer
     * @param source
     * @return 
     */
    public static String reverse(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }

    /*
     * Java example to find factorial of a number using recursion
     * @return factorial of number
     */
    public static int factRecursive(int number) {
        //base case
        if (number == 0) {
            return 1;
        }
        return number * factRecursive(number - 1); //is this tail-recursion?
    }

    /*
     * Java example to calculate factorial using while loop or iteration
     * @return factorial of number
     */
    public static int factIterative(int number) {
        int result = 1;
        while (number != 0) {
            result = result * number;
            number--;
        }

        return result;
    }
    
    /**
     * Print a * pyramid to
     * @TODO: fix this
     * @param size
     * @return 
     */
    public static String printStructure(int size) {
        return " ";
    }
}
