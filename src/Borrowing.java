
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
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
public class Borrowing {
    
     int Book_id;
     int Student_id;
    String Book_title;
    int Start_date;
    int End_date;
     String Status;
     
     public static boolean borrowing2 (String a,boolean ch) throws SQLException{
     
       Statement st = null;
        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ServerName = "DESKTOP-L9V4O19";
        String ServerPort = "1521";
        String sid = "SSBR";
        String url = "jdbc:oracle:thin:@" + ServerName + ":" + ServerPort + ":" + sid;
        String Username = "sys as sysdba";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password);
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        ResultSet rs = null;
        
         String book_id=" ";
        while(!book_id.equals(a)){
   
         


    
        rs = st.executeQuery("select book_id from book ");
       
        
        while(rs.next()){
            
         book_id = rs.getNString(1).toString();
         if(a.equals(book_id))
         break;
        }
         
          

        if(book_id.equals(a)){
        
            System.out.println(" Match is found: ");
        ch=true;
        
        }else{
        
             System.out.println(" Error ");
break;
        }
        
        }
        return ch;
     
     }
     
     public static boolean Borrwowing(String b,boolean ch) throws SQLException{
         // String taglist = TagList;

         
           

          
         
         Statement st = null;
        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ServerName = "DESKTOP-L9V4O19";
        String ServerPort = "1521";
        String sid = "SSBR";
        String url = "jdbc:oracle:thin:@" + ServerName + ":" + ServerPort + ":" + sid;
        String Username = "sys as sysdba";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password);
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        
        ResultSet rss = null;
        
        String student_id=" ";
  
while(!student_id.equals(b)){

    
        rss = st.executeQuery("select student_id from student ");
       
        
        while(rss.next()){
         student_id = rss.getNString(1).toString();
        if(student_id.equals(b))
            break;
          
        
        }
         
          
 
        if(student_id.equals(b)){
        
            System.out.println(" Match is found: ");
        ch=true;
        }else{
        
             System.out.println(" Error ");
break;
        }
         
     
     
     
}
     
     
     return ch;
     
     }

    public int getBook_tag() {
        return Book_id;
    }

    public void setBook_tag(int Book_tag) {
        this.Book_id = Book_tag;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int Student_id) {
        this.Student_id = Student_id;
    }

    public String getBook_title() {
        return Book_title;
    }

    public void setBook_title(String Book_title) {
        this.Book_title = Book_title;
    }

    public int getStart_date() {
        return Start_date;
    }

    public void setStart_date(int Start_date) {
        this.Start_date = Start_date;
    }

    public int getEnd_date() {
        return End_date;
    }

    public void setEnd_date(int End_date) {
        this.End_date = End_date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
         
   public static void main(String[] args) throws SQLException{
   
       
      
   
   }
}
