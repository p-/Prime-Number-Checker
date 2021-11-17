package me.adamcraftmaster;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime");
        } 
        else {
            System.out.println("The number " + number + " is not prime");
        }
    }

    
    /** 
     * A method to check if a number is prime
     * @param num the number to check
     * @return boolean: is the number prime?
     */
    public static boolean isPrime(int num) {
        //step 1: check if num is less than or equal to 1
        if (num <= 1) {
            return false;
        }

        //step 2: check if num is equal to 2
        if (num == 2) {
            return true;
        }

        //step 3: check if num is even
        if (num % 2 == 0) {
            return false;
        }

        //step 4: check if num is divisible by any number less than or equal to the square root of num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        //step 5: if everything passes, return true
        return true;
    }
}
