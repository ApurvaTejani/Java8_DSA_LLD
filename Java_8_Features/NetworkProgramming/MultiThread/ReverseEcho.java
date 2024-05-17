import java.net.*;
import java.io.*;

public class ReverseEcho extends Thread {
    Socket stk;

    public ReverseEcho(Socket st) {
        stk = st;
    }

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        System.out.println("Server is running on port 2000");
        Socket stk;
        int count = 1;
        do {
            stk = ss.accept();
            System.out.println("Client Connected " + count++);
            ReverseEcho re = new ReverseEcho(stk);
            Thread t = new Thread(re);
            t.start();

        } while (true);

    }

    public void run() {
        try {
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
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
