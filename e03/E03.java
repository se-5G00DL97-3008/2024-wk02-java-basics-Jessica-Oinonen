import java.util.Scanner;

public class E03 {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
    
            
            System.out.print("Enter a number: ");
    
            
            double number = scanner.nextDouble();
    
           
            scanner.close();
    
            
            if (number > 0) {
                System.out.println("Positive number");
            } else if (number < 0) {
                System.out.println("Negative number");
            } 
        }
    }
    
    


