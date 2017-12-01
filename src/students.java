
import com.alien.enterpriseRFID.tags.Tag;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
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
public class students {
    
    
   
   public static String First_name;
   public static  String Last_name;

    

   
    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

   
    
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
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  


    
        rs = st.executeQuery("select username,password, FIRST_NAME,LAST_NAME from Users where user_type = 'Student'");
        try {
            while (rs.next()) {
               uname = rs.getString(1).toString();
                pass = rs.getString(2).toString();
                String fname=rs.getString(3).toString();
                String lname =rs.getString(4).toString();
           if (username.equals(uname) && passw.equals(pass)){
               First_name=fname;
               Last_name=lname;
        ch=true;
        }
                

                           
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
       
        if(ch==false){
        
         JOptionPane.showMessageDialog(null," Wrong Password or Username " );

        }
        return ch;
}
     
    
   
        
   

    
   
      
}
