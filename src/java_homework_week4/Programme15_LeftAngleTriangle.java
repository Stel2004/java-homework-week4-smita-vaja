package java_homework_week4;

import java.util.Scanner;

public class Programme15_LeftAngleTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input of value: ");
        int numVal = scanner.nextInt();
        System.out.println("Enter the special symbol of pattern to display: ");
        Character ch = scanner.next().charAt(0);

        // Called display diamond method
        displayLeftAnglePattern(numVal, ch);
    }

    public static void displayLeftAnglePattern(int numRows, Character ch){
        for (int i = 0; i < numRows; i++) {
            // Print spaces before the pattern symbol
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the pattern of symbol
            for (int k = 0; k <= i; k++) {
                System.out.print(ch);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
