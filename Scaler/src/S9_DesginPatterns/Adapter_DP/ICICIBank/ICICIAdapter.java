package S9_DesginPatterns.Adapter_DP.ICICIBank;

import S9_DesginPatterns.Adapter_DP.BankAPIForPhonePe;
import S9_DesginPatterns.Adapter_DP.YesBank.YesBank_Remote;

public class ICICIAdapter implements BankAPIForPhonePe {

    ICICIBank_Remote ib = new ICICIBank_Remote();

    public int checkBalance(int accountno) {
        int acc = ib.WhatisBalance(accountno);
        return acc;
    }

    public void depositMoney(int accountno, int money) {
        ib.putMoney(accountno, money);
    }

    public void withdrawMoney(int accountno, int money) {
        ib.removeMoney(accountno, money);
    }
}
