package se.lexicon;


import java.util.Scanner;

public class Main {
    static void main() {

        //Exercise 1
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            scanner.close();
        }

        //Exercise 2




    }
}
