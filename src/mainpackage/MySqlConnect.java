package mainpackage;


import java.sql.*;
import javax.swing.*;

public class MySqlConnect {
    Connection con = null;
    
    public static Connection dbConnect() 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/employeedb", "root", "");
           // JOptionPane.showMessageDialog(null, "Conect to Database Success!");
            
            return con;
        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, er);
            
            return null;
        }
    }
}
