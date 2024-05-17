package Java_8_Features.NetworkProgramming;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket stk = new Socket(" 10.0.2.15", 16);
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
