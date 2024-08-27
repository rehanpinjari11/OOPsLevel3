package OOPs_Level_3;

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double interestRate;

    public BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getInterestRate()
    {
        return interestRate;
    }
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public void displayAccountDetails()
    {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Balance: " + getBalance());
        System.out.println("Interest Rate: " + getInterestRate());
    }

    class Interest{

        public double calculateInterest()
        {
            return balance * interestRate / 10;
        }

        public void displayInterestRate()
        {
            double interest = calculateInterest();
            System.out.println("Calculated Interest: " + interest);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Account Number:");
        String accountNumber = sc.nextLine();

        System.out.println("Enter the Account Balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter the Interest Rate:");
        double interestRate = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, balance, interestRate);

        account.displayAccountDetails();

        BankAccount.Interest interestCalculator = account.new Interest();

        interestCalculator.displayInterestRate();


    }
}
