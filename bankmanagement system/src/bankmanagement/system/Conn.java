/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement.system;


import java.sql.*;
//import java.sql.Connection;

/**
 *
 * @author NetImpact
 */
public class Conn {// we dont need main method here becoz we make object of this class and use it in  other class ,, so no use in here 
     Connection c;
     Statement s;
    
    public Conn(){/// only here we need to set upconnection , onther place we just make object of this class and use it 
     try{
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         c=(Connection)DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","123456");
         s=c.createStatement();
         
     }catch(Exception e){
         System.out.println(e);
     }
}
        
    
    
}
