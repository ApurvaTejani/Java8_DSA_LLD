package S9_DesginPatterns.Adapter_DP.YesBank;

import S9_DesginPatterns.Adapter_DP.BankAPIForPhonePe;

public class YesBankAdapter implements BankAPIForPhonePe {

    YesBank_Remote yb = new YesBank_Remote();

    public int checkBalance(int accountno) {
        int acc = yb.getBalace(accountno);
        return acc;
    }

    public void depositMoney(int accountno, int money) {
        yb.addMoney(accountno, money);
    }

    public void withdrawMoney(int accountno, int money) {
        yb.subMoney(accountno, money);
    }
}
