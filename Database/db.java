/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author vivek
 */
public class db {
    public static Connection conn;
    public static Statement st;
    static{
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/expensedb"+"?useSSL=false","root","Foundher@1");
            st= conn.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
