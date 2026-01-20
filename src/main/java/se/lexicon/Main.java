package se.lexicon;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

        //Exercise 1
       /* Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.err.println("Error: Division by zero is not allowed.");
        } catch (Exception e){
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Operation completed.");
            scanner.close();
        } */

        //Exercise 2
        try {
            int number = readNumberInRange(1, 100);
            System.out.println("Valid number entered: " + number);
        } catch (InputMismatchException e){
            System.err.println("Error: Invalid input. Please enter an integer.");
        } catch (OutOfRangeException e){
            System.err.println("Error:" + e.getMessage());
        }




    }

    public static int readNumberInRange (int min, int max) throws OutOfRangeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + "and" + max + ":");
        int number = scanner.nextInt();
        if (number<min || number>max){
            throw new OutOfRangeException("Number must be between " + min + " and " + max);
        }return number;
    }
}
