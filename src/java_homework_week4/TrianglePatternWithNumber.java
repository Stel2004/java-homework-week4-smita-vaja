package java_homework_week4;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class TrianglePatternWithNumber {

    public static void main(String[] args) {
        // Declared Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows:");
        int number = scanner.nextInt();
        displayTrianglePattern(number);

    }

    public static void displayTrianglePattern(int number){
        for(int i = 0; i <= number; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
