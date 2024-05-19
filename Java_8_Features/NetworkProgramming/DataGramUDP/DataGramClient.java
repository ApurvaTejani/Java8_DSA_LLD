package DataGramUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataGramClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Hello World";
        //Sending the packet
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(), InetAddress.getByName("localhost"),2000);
        ds.send(dp);
        //Receving the packet
         byte b[] = new byte[1024];
         dp = new DatagramPacket(b,1024);
         ds.receive(dp);

         msg=new String(dp.getData()).trim();
        System.out.println("From Server "+msg);
        ds.close();


    }
}
