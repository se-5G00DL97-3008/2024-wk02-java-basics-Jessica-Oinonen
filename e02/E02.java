import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Give a number: ");
        int num1 = scanner.nextInt();

        
        System.out.print("Give a number: ");
        int num2 = scanner.nextInt();

       
        scanner.close();

        
        int sum = (int) (num1 + num2);
        int times = (int) (num1 * num2);
        int minus = (int) (num1 - num2);
        int division = (int) (num1 / num2);
        

        System.out.println(num1 + " + " + num2 + ": " + sum);
        System.out.println(num1 +" * " + num2 + ": " + times);
        System.out.println(num1 + " - " + num2 + ": " + minus);
        System.out.println(num1 + " / " + num2 + ": " + division);



    }
}


