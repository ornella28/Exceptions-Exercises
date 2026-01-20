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
        /*try {
            int number = readNumberInRange(1, 100);
            System.out.println("Valid number entered: " + number);
        } catch (InputMismatchException e){
            System.err.println("Error: Invalid input. Please enter an integer.");
        } catch (OutOfRangeException e){
            System.err.println("Error:" + e.getMessage());
        }*/

        // Exercise 3
        BankAccount account = new BankAccount(500.0);
        try {
            account.deposit(1000);
            account.withdraw(200);
            account.withdraw(1500); // This should trigger InsufficientBalanceException
        } catch (InsufficientBalanceException e){
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("Final Balance: " + account.getBalance());




    }

    public static int readNumberInRange (int min, int max) throws OutOfRangeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + "and" + max + ":");
        int input;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e){
            throw e;
        }
        if (input < min || input > max){
            throw new OutOfRangeException("Number " + input + " is out of range. It should be between " + min + " and " + max + ".");
        }
        return input;
    }
}
