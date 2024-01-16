import java.util.Scanner;
public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            
            System.out.println("Give a number (0 to quit):");
            number = scanner.nextInt();

            if (number > 0) {
                
                if (number % 2 == 0) {
                    System.out.println("Number is even");
                } else {
                    System.out.println("Number is odd");
                }
            
            } 

        } while (number != 0);

        
        scanner.close();
    }
}