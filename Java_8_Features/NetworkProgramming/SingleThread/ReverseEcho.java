
package Java_8_Features.NetworkProgramming;

import java.net.*;
import java.io.*;

public class ReverseEcho {
    public static void main(String[] args) throws Exception {

            ServerSocket ss = new ServerSocket(2000);
            System.out.println("Server is running on port 2000");
            Socket stk = ss.accept();

            // Display client's IP address
            InetAddress clientAddress = stk.getInetAddress();
            System.out.println("Client connected from IP: " + clientAddress.getHostAddress());

            InputStreamReader ir = new InputStreamReader(stk.getInputStream());
            BufferedReader br = new BufferedReader(ir);
            PrintStream ps = new PrintStream(stk.getOutputStream());


            String msg;
            StringBuilder sb;

            do {
                msg = br.readLine();
                System.out.println("Got the input from client : " + msg);
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);
                System.out.println("Sending the reverse string : " + msg);
                System.out.println(("=").repeat(50));
            } while (!msg.equals("dne"));


    }
}
