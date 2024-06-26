package NetworkProgramming.SingleThread;

import java.io.*;
import java.net.*;

public class ClientSingle {
    public static void main(String[] args) throws Exception {
        try(Socket stk = new Socket("localhost", 2000)) {

            // Display server's IP address
            InetAddress serverAddress = stk.getInetAddress();

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader keyboard = new BufferedReader(isr);
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());
            String msg;
            do {
                msg = keyboard.readLine();
                ps.println(msg);
                msg = br.readLine();
                System.out.println("From Server " + serverAddress + " " + msg);
            } while (!msg.equals("dne"));
        }

    }
}
