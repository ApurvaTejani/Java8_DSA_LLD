package MethodChallenge;

public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

    double getSimpleInterest(int time) {
        double interest = (balance * time * roi) / 100;
        return interest;
    }

    double getBalanceWithInterest(int time) {
        double interest = (balance * time * roi) / 100;
        double newbalance = balance + interest;
        return newbalance;
    }
}
