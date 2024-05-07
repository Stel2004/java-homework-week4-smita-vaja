package java_homework_week4;

import java.util.Scanner;

public class Programme8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your choice of symbol:");
        Character charVal = scanner.next().charAt(0);

        System.out.println("Please enter the length of rows you want to show triangle: ");
        int rowsLength = scanner.nextInt();

        // Called method to display triangle
        displayTriangle(charVal, rowsLength);

    }

    // Declared method for triangle
    public static void displayTriangle(Character symbol, int rows){
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
