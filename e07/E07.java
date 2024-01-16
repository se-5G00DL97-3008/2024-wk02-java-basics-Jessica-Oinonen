import java.util.Scanner;

public class E07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplicand multiplication table to show?");
        int multiplicand = scanner.nextInt();

        
        System.out.println("Until which multiplier?");
        int multiplierLimit = scanner.nextInt();

        
        for (int i = 0; i <= multiplierLimit; i++) {
            int result = i * multiplicand;
            System.out.println(i + " x " + multiplicand + " = " + result);
        }

        scanner.close();
    }
}
