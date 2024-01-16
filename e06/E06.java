import java.util.Scanner;

public class E06 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Which multiplication table to show?");

    
        int number = scanner.nextInt();

        
        scanner.close();

        for (int i = 0; i <= 10; i++) {
            int result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}


