package me.adamcraftmaster;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test to ensure if given number is prime
 */
public class AppTest 
{
    @Test
    public void testIsPrime()
    {
        App tester = new App();
        //check that prime numbers return valid
        //System.out.println("Starting Prime test");
        assertTrue(tester.isPrime(2));
        assertTrue(tester.isPrime(3));
        assertTrue(tester.isPrime(5));
        assertTrue(tester.isPrime(7));
        assertTrue(tester.isPrime(11));
        assertTrue(tester.isPrime(13));
        assertTrue(tester.isPrime(17));
        assertTrue(tester.isPrime(19));
    }
    @Test
    public void testIsNotPrime()
    {
        App tester = new App();
        //check that non-prime numbers return invalid
        //System.out.println("Starting Not Prime test");
        assertFalse(tester.isPrime(4));
        assertFalse(tester.isPrime(6));
        assertFalse(tester.isPrime(8));
        assertFalse(tester.isPrime(9));
        assertFalse(tester.isPrime(10));
        assertFalse(tester.isPrime(12));
        assertFalse(tester.isPrime(14));
        assertFalse(tester.isPrime(15));
        assertFalse(tester.isPrime(16));
        assertFalse(tester.isPrime(18));
        assertFalse(tester.isPrime(20));
    }
}
