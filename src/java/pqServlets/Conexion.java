/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqServlets;

//import javax.swing.*;
import java.sql.*;

public class Conexion {
    Connection conexion = null;
    
    String user = "postgres";
    String pass = "12345";
    String url = "jdbc:derby://localhost:1527/Java";
   
    Conexion()
    {
        try {
            Class.forName("org.apache.derby.jdbc.OracleDriver");	
          } catch (ClassNotFoundException e) {
            System.out.println("ERROR: exception loading driver class");
          }
    }
    
    public void conectarme()
    {
        try{
            conexion=DriverManager.getConnection(url, user, pass);
            //System.out.println("Estas conectado");
         
        }catch(SQLException e)
        {System.out.println("No estas conectado");
        }
        
    }

   public Connection getC()
   {
       return conexion;
   }
}