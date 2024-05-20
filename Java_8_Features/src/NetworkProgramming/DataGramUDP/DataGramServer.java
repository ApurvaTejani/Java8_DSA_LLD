package NetworkProgramming.DataGramUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataGramServer {
    public static void main(String[] args) throws  Exception{
        DatagramSocket ds = new DatagramSocket(2000);
        //Receving the packet
        byte [] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,1024);
        ds.receive(dp);
        String msg = new String(dp.getData()).trim();
        //Reversing the String
        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg=sb.toString();

        //Sending the packet

        dp = new DatagramPacket(msg.getBytes(),msg.length(), InetAddress.getByName("localhost"),2001);
        ds.send(dp);
        ds.close();


    }
}
