
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed aljohani
 */
public class Atin_admin {
    
    int id;
    String first_name;
    String last_name;
    String username;
    String email;
    String password;
    
    
    
     public static boolean Log_in(String username,String passw) throws SQLException{
        String uname="" ;
        String pass ="";
        boolean ch=false;
        
        Statement st = null;
        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Atin_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ServerName = "DESKTOP-L9V4O19";
        String ServerPort = "1521";
        String sid = "SSBR";
        String url = "jdbc:oracle:thin:@" + ServerName + ":" + ServerPort + ":" + sid;
        String Username = "attendance";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Atin_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Atin_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  


    
        rs = st.executeQuery("select username,password from Users where user_type = 'Admin'");
        try {
            while (rs.next()) {
               uname = rs.getString(1).toString();
                pass = rs.getString(2).toString();
                
             if (username.equals(uname) && passw.equals(pass)){
        
              ch=true;
        }
                

                           
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Atin_admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        if(ch==false){
        
         JOptionPane.showMessageDialog(null," Wrong Password or Username " );
        }
        return ch;
}
    
    
    
    
    
}
