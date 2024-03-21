package MethodChallenge;

// It should have 3 data members
// accountNumber: String
// balance: int
// roi:double (Should represent rate of interest)
// It should have 2 methods
// getSimpleInterest: It should take time (in years) as a parameter. The data type of time should be int. It should return Simple Interest as a double.
// getBalanceWithInterest: It should take time (in years) as a parameter. The data type of time should be int. It should return a new balance (including simple interest) as a double.
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.accountNumber = "11000e134";
        ba.balance = 1000;
        ba.roi = 12.00;
        double interest1 = ba.getSimpleInterest(2);
        double totalAmount1 = ba.getBalanceWithInterest(2);
        System.out.println(interest1);
        System.out.println(totalAmount1);

    }

}
