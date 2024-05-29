package S9_DesginPatterns.Adapter_DP;

import S9_DesginPatterns.Adapter_DP.YesBank.YesBankAdapter;
import S9_DesginPatterns.Adapter_DP.ICICIBank.ICICIAdapter;

public class DIC {
    // make a call to phone pe server, which will read from config, which adapter object to give
    public static BankAPIForPhonePe getBankAPI() {
        return new YesBankAdapter();// hard coding for example
    }
}
