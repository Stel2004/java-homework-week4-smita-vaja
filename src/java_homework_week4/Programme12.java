package java_homework_week4;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme12 {

    // Declared main method
    public static void main(String[] args) {

        // Scanner class used to get the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= scanner.nextInt();

        if(isPrimeNumber(number)){
            System.out.println(number+" is a prime number");
        } else {
            System.out.println(number +" is not a prime number");
        }

        // Scanner class closed
        scanner.close();
    }

    // Declared prime method to check number is prime or not
    public static boolean isPrimeNumber(int number){
        if(number <= 1) {
            return false;
        } else {
            // Check number from 2 to number/2
            for(int i = 2; i <= (number/2); i++) {
                if(( number % i ) == 0)
                    return  false;
            }
            return true;
        }
    }
}
