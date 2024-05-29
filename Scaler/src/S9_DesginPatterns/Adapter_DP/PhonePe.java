package S9_DesginPatterns.Adapter_DP;

public class PhonePe {
    static BankAPIForPhonePe obj = DIC.getBankAPI();

    static int checkBalance() {
        return obj.checkBalance(509924234);
    }

    static void depMoney() {
        obj.depositMoney(509924234, 200);
    }

    static void withdrawMoney() {
        obj.withdrawMoney(509924234, 200);
    }

    public static void main(String[] args) {

        PhonePe.checkBalance();
        PhonePe.depMoney();
        PhonePe.withdrawMoney();

        // In future if YesBank gets into maintenance then we would just change the Dependency to ICICI Adapter in DIC App.config
        //so that customer don't have to update the App through PlayStore , once the call happens to the server where App.config files
        // are located Switch from YesBank API to ICICI bank will take place

    }

}
