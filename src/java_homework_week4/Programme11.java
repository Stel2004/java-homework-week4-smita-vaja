package java_homework_week4;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme11 {
    // Declared main method
    public static void main(String[] args) {
        int sumOfEvenDigits = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to get the even number sum: ");
        int number = scanner.nextInt();

        sumOfEvenDigits = getEvenDigitSum(number);
        if(sumOfEvenDigits > 0){
            // display result
            System.out.println("The sum of even digits of"+
                    " the number "+number+" = "+ sumOfEvenDigits);
        } else {
            // display result
            System.out.println("The given number is negative number "+number);
        }
        // close Scanner class object
        scanner.close();
    }

    // Declared method for even digit sum
    public static int getEvenDigitSum(int number){
        int lastDigit = 0;
        int evenDigit = 0;
        if(number > 0){
            while (number != 0){
                lastDigit = number % 10;

                if(lastDigit % 2 == 0){
                    evenDigit += lastDigit;
                }
                number = number / 10;
            }
            return evenDigit;
        } else {
            return -1;
        }
    }
}
