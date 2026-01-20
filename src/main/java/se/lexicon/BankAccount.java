package se.lexicon;

public class BankAccount {

    private double balance;
    // Exercise 3
    // Constructor
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount > balance){
            throw new InsufficientBalanceException("Insufficient balance. Available balance: " + balance + ", Requested: " + amount);
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }

    // Get balance method
    public double getBalance(){
        return balance;
    }
}
