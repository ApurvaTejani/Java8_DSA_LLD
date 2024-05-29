package S9_DesginPatterns.Adapter_DP.YesBank;

public class YesBank_Remote {
    public int getBalace(int accountno) {
        System.out.println("Makes call to yes bank api for checking balance ");
        return 0;
    }

    public void addMoney(int accountno, int money) {
        System.out.println("Makes call to yes bank api for depositing money");
    }

    public void subMoney(int accountno, int money) {
        System.out.println("Makes call to yes bank api for withdrawing money");
    }
}
