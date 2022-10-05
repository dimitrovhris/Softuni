package definingClasses.bankAccount;

public class BankAccount {
    private static int nextId = 1;
    private int id = nextId;
    private double balance = 0;
    private static double interestRate = 0.02;

    public int getId() {
        return id;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }
    public BankAccount(){
        nextId++;
    }
    public static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }
    public double getInterestRate(int years){
        return interestRate * years * this.balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
}
