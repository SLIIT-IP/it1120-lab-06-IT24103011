import java.util.Scanner;

public class IT24103011Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = Math.pow(number,2);
        double squareRoot = Math.sqrt(number);

      
        System.out.println("The square of " + " " + number + " " + "is : " + square);
        System.out.println("The square root of " + " " + number + " " + "is : " + squareRoot);

        
    }
}
