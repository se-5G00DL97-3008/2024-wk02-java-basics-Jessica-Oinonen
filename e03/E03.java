package e03;

import java.util.Scanner;

public class E03 {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
    
            // Ask the user to enter a number
            System.out.println("Enter a number:");
    
            // Read the user's input
            double number = scanner.nextDouble();
    
            // Close the Scanner to avoid resource leak
            scanner.close();
    
            // Evaluate and print if the number is positive or negative
            if (number > 0) {
                System.out.println("Positive number");
            } else if (number < 0) {
                System.out.println("Negative number");
            } else {
                System.out.println("The number is zero");
            }
        }
    }
    
    


