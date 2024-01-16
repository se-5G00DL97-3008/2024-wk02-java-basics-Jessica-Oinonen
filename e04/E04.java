import java.util.Scanner;

public class E04 {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
    
            
            System.out.print("Enter a day: ");
            int num1 = scanner.nextInt();
    
            
            System.out.print("Enter a month: ");
            int num2 = scanner.nextInt();
    

            scanner.close();


            if (num1 == 24 && (num2 == 12)){
                System.out.println("Merry Christmas!");
            
        }
    }
}