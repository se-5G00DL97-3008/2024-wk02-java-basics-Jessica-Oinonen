import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number between 1 and 7
        System.out.println("Enter a number between 1 and 7:");

        // Read the user's input
        int dayNumber = scanner.nextInt();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Use a switch statement to print the corresponding day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are only 7 days in a week. Please enter a valid number.");
        }
    }
}

