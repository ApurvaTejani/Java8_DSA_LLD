package S9_DesginPatterns.Adapter_DP;

public interface BankAPIForPhonePe {
    int checkBalance(int accountno);

    void depositMoney(int accountno, int money);

    void withdrawMoney(int accountno, int money);
}
