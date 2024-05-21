package JDBC.PreparedStmDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepStmIntDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\SQLLite\\univ.db");
        while (true) {
            PreparedStatement pstm = con.prepareStatement("INSERT into  students values(?,?,?,?)");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Roll no");
            int r = Integer.parseInt(sc.nextLine());

            if (r == -1)
                break;
            System.out.println("Enter name");
            String name = sc.nextLine();
            System.out.println("Enter City");
            String city = sc.nextLine();
            System.out.println("Enter Deptno");
            int deptno = sc.nextInt();
            pstm.setInt(1, r);
            pstm.setString(2, name);
            pstm.setString(3, city);
            pstm.setInt(4, deptno);
            pstm.executeUpdate();
        }
    }
}
