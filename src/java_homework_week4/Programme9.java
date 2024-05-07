package java_homework_week4;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9 {

    // Declared main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the end value to get the fibonacci number: ");
        int number = scanner.nextInt();

        fibonacciNumber(number);
    }

    // Declared method for Fibonacci number
    public static void fibonacciNumber(int len){
        int secondNumber = 1;
        int firstNumber=1;
        int number3;

        for(int i=1; i<= len; i++){
            System.out.print(firstNumber + " ");
            // Swap the number to get the numbers
            number3 = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = number3;


        }
    }
}
