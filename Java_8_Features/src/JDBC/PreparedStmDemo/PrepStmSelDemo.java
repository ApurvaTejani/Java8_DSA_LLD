package JDBC.PreparedStmDemo;

import java.sql.*;
import java.util.Scanner;

public class PrepStmSelDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\SQLLite\\univ.db");
        PreparedStatement pstm = con.prepareStatement("SELECT *FROM  Students where deptno=?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dept number : ");
        int deptno = sc.nextInt();
        pstm.setInt(1, deptno);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.println(rs.getInt(4));
        }
    }
}
