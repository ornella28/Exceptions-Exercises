package se.lexicon;

// Exercise 3
public class InsufficientBalanceException  extends Exception{

    public InsufficientBalanceException(String message){
        super(message);
    }
}
