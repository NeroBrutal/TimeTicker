/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBLayer;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *The connection URL for the mysql database 
 * jdbc is the API, mysql is the database, localhost is the server name 
 * on which mysql is running,
 * @author HP
 */
public class ConnectionProvider {
    
    public static Connection getConn(){
        
        try{
            
            String url = "jdbc:mysql://localhost:3306/timeticker";
            String uname = "root";
            String password = "1234";
            
            
            Connection con1 = DriverManager.getConnection(url,uname,password);
            
            return con1;
            
            
        }
        
        catch(Exception e)
        {
            
         return null;   
        }
        
    }
    
    
    
}

