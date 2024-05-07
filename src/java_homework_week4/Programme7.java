package java_homework_week4;

import java.util.Scanner;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 *  gives us 0+0 and the sum is 0.
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 *  gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme7 {

    // Declared main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to calculate the sum of first and last digit:");
        int number = scanner.nextInt();

        // Called method to calculate sum of first and last digit
        sumFirstAndLastDigit(number);

        // Scanner close
        scanner.close();
    }

    // Declared method for sum of first and last digit
    public static void sumFirstAndLastDigit(int num){
            int firstDigit = num;
            while (firstDigit >= 10){
                firstDigit = firstDigit / 10;
            }
            int lasDigit = (num % 10);
            int sum = (firstDigit+lasDigit);
            if(sum >= 0){
                System.out.println("Sum of first and last digit is " + sum);
            } else {
                System.out.println(-1);
            }
    }
}
