package java_homework_week4;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class SharedDigit {

    // Declared main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        boolean res = hasSharedDigit(number1, number2);
        if(res == true){
            System.out.println("The digit 2 appears in both numbers");
        } else{
            System.out.println("9 is not within the range of 10-99");
        }
    }

    //Declared method to check the shared digit between given range 10-99
    public static boolean hasSharedDigit(int number1, int number2){

        int number1FirstDigit = number1 % 10;
        int number2FirstDigit = number2 % 10;
        int number1LastDigit = number1 / 10;
        int number2LastDigit = number2 / 10;

        if ((number1 < 10 || number1 > 99) ) {
            System.out.println(number1 + "or  is not within the range of 10-99");
            return false;
        }
        if ((number2 < 10 || number2 > 99)) {
            System.out.println(number2 + "or  is not within the range of 10-99");
            return false;
        }

        if(number1FirstDigit == number2FirstDigit || number1LastDigit == number2LastDigit) {
            System.out.println("The digit "+ number1FirstDigit +" appears in both numbers");
            return true;
        } else {
            return false;
        }
    }


}
