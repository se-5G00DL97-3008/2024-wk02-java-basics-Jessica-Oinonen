package e08;

import java.util.Scanner;
public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            
            System.out.println("Enter a positive number (enter 0 to exit):");
            number = scanner.nextInt();

            if (number > 0) {
                
                if (number % 2 == 0) {
                    System.out.println("The number " + number + " is even.");
                } else {
                    System.out.println("The number " + number + " is odd.");
                }
            } else if (number < 0) {
                System.out.println("Please enter a positive number.");
            } else {
                System.out.println("Exiting the program. Goodbye!");
            }

        } while (number != 0);

        scanner.close();
    }
}