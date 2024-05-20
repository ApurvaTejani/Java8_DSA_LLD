package NetworkProgramming.MultiThread;

import java.io.*;
import java.io.InputStreamReader;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket stk = new Socket("localhost", 2000);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;
        do {
            msg = keyboard.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server " + msg);
        } while (!msg.equals("dne"));
    }
}
