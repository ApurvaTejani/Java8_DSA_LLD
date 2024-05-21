package JDBC.DDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\SQLLite\\univ.db");
        Statement stm = con.createStatement();
        stm.executeUpdate("create table temp(tempid integer, tempname text)");
    }
}
