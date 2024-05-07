package java_homework_week4;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10 {

    // Declared the main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the end value to get the fibonacci number: ");
        int number = scanner.nextInt();

        // Called method to check armstrong number
        checkArmstrongNumber(number);
    }

    // Declared armstrong number method
    public static void checkArmstrongNumber(int number){

        int remainder = 0;
        int result = 0;
        int mainNumber = 0;
        mainNumber = number;

        while (mainNumber != 0){
            remainder = mainNumber % 10;
            result += Math.pow(remainder, 3); // Cubing the digit
            mainNumber /= 10;
        }

        if (result == number){
            System.out.println(number + " is an Armstrong number.");
        }
        else{
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
