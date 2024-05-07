package java_homework_week4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class ReadingUserInputChallenge {

    // Declared Main method
    public static void main(String[] args) {
        int i = 0;
        // Scanner class used to get the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of number you want to enter like 10:");
        int len = scanner.nextInt();
        int num[] = new int[len];

        // While loop used for getting number from user
        while (i < len){
            System.out.println("Enter the number #" + (i+1));
            // Checked the user input number is valid integer number of not, If not then return with specific message
            if(!scanner.hasNextInt()){
                System.out.println("Entered " + (i+1) + " number is not valid");
                //return;
            } else {
                num[i] = scanner.nextInt();
                i++;
            }
        }
        // Scanner class closed
        scanner.close();

        // Creating object of class
        ReadingUserInputChallenge resObj = new ReadingUserInputChallenge();
        // Called the instance method for sum of all inputted numbers
        resObj.sumOfArray(num);
    }

    public void sumOfArray(int[] numArray){
        int sum = 0;
        int i = 0;

        // Calculating the sum of arrays value
        while (i < numArray.length){
            sum = (sum + numArray[i]);
            i++;
        }

        System.out.println("Entered values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Sum of given array elements are : " + sum);
    }
}
