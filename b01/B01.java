import java.util.Scanner;

public class B01 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the starting count of bottles:");
        int bottlesCount = scanner.nextInt();

        
        scanner.close();

        
        for (int i = bottlesCount; i > 0; i--) {
            System.out.println(i + " bottle" + (i == 1 ? "" : "s") + " of beer on the wall, " + i + " bottle" + (i == 1 ? "" : "s") + " of beer.");
            System.out.println("Take one down and pass it around, " + (i - 1 == 0 ? "no more" : (i - 1)) + " bottle" + ((i - 1) == 1 ? "" : "s") + " of beer on the wall.");
            System.out.println();
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, " + bottlesCount + " bottles of beer on the wall.");
    }
}


