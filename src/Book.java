
import com.alien.enterpriseRFID.tags.Tag;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmed aljohani
 */
public class Book {
     
    
    
       int Book_tag;
 String title;
     String Author;
     String Location;
     String Publisher;
     
     
    public int getBook_tag() {
        return Book_tag;
    }

    public static void setBook_tag(String Taglist) {
       
        
        
//         Statement st = null;
//        Connection conn = null;
//
//        String DriverName = "oracle.jdbc.driver.OracleDriver";
//        try {
//            Class.forName(DriverName);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        String ServerName = "DESKTOP-L9V4O19";
//        String ServerPort = "1521";
//        String sid = "SSBR";
//        String url = "jdbc:oracle:thin:@" + ServerName + ":" + ServerPort + ":" + sid;
//        String Username = "sys as sysdba";
//        String password = "tiger";
//        try {
//            conn = DriverManager.getConnection(url, Username, password);
//        } catch (SQLException ex) {
//            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         
//        try {
//            st = conn.createStatement();
//        } catch (SQLException ex) {
//            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        ResultSet rs = null;
//  
//
//
//    
//        rs = st.executeQuery("insert into users values("'');
     
        
        
        
        
        
          
      
 
         
         
        
        
          
      
        
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }
      

    
}
