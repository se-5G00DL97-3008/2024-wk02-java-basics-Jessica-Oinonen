package e07;

import java.util.Scanner;

public class E07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the multiplicand
        System.out.println("Which multiplicand multiplication table to show?");
        int multiplicand = scanner.nextInt();

        // Ask the user for the desired multiplier
        System.out.println("Until which multiplier?");
        int multiplierLimit = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication Table for " + multiplicand + " until " + multiplierLimit + ":");

        for (int i = 1; i <= multiplierLimit; i++) {
            int result = multiplicand * i;
            System.out.println(i + " x " + multiplicand + " = " + result);
        }

        scanner.close();
    }
}
