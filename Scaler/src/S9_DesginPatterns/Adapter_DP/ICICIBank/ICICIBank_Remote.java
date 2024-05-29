package S9_DesginPatterns.Adapter_DP.ICICIBank;

public class ICICIBank_Remote {
    public int WhatisBalance(int accountno) {
        System.out.println("Makes call to ICICI bank api for checking balance ");
        return 0;
    }

    public void putMoney(int accountno, int money) {

        System.out.println("Makes call to ICICI bank api for depositing money");
    }

    public void removeMoney(int accountno, int money) {
        System.out.println("Makes call to ICICI bank api for withdrawing money");
    }
}
