/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolApp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Iredafe
 */
public class SqlConnection {





    public static Connection getConnection(){
        
    Connection con = null;

    String url= "jdbc:mysql://localhost:3306/schoolapp_db";
    
    String username= "root";
    
    String password = "";
       

    try{
    Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection(url, username, password);
    
    
    
}
catch(Exception e){JOptionPane.showMessageDialog(null, e);


}
return con;    
    }
}


    
