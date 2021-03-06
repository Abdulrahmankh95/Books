

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

 
public class Librarian {
    
    
    int Librarian_id;
    String First_name;
    String Last_name;
    int Mobile_num;
    String Email;
    String Username;
    String Password;

    public int getLibrarian_id() {
        return Librarian_id;
    }

    public void setLibrarian_id(int Librarian_id) {
        this.Librarian_id = Librarian_id;
    }

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

    public int getMobile_num() {
        return Mobile_num;
    }

    public void setMobile_num(int Mobile_num) {
        this.Mobile_num = Mobile_num;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
      
    
     public static void Notify_students(String stemail) throws AddressException, MessagingException{
     
         // Email connection 
     String host="smtp.gmail.com" ;
     String user="university.kau.2017@gmail.com";
     String pass="a1b2d3c4";
     String to = stemail;
     String from="university.kau.2017.gmail.com";
     String subject=" Book return time reminder "; 
     String messageText= " please return the borrowed book as soon as possible ";
     boolean sessionDebug=false; 
     
     Properties props=System.getProperties();
     
     props.put("mail.smtp.starttls.enable", "true");
     props.put("mail.smtp.host", host);
     props.put("mail.smtp.port", 587);
     props.put("mail.smtp.auth", "true");
     props.put("mail.smtp.starttls.required", "true");
     
     java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
     
     Session mailSession = Session.getDefaultInstance(props, null);
     mailSession.setDebug(sessionDebug);
     
     Message msg = new MimeMessage(mailSession);
     msg.setFrom(new InternetAddress(from));
     InternetAddress[] address = { new InternetAddress(to)};
     msg.setRecipients(Message.RecipientType.TO, address);
     msg.setSubject(subject);  
     msg.setText(messageText);
     
     
     Transport transport=mailSession.getTransport("smtp");
     transport.connect(host,user,pass);
     transport.sendMessage(msg, msg.getAllRecipients());
     transport.close();
     
    }
    
     public static void Search_for_books(){
    }
     
     public static void Print_reports(){
    }
    
       public static boolean Log_in(String username,String passw) throws SQLException{
        
        String uname="" ;
        String pass ="";
        boolean ch=false;
        
        // database connection 
        Statement st = null;
        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Librarian.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ServerName = "DESKTOP-L9V4O19";
        String ServerPort = "1521";
        String sid = "SSBR";
        String url = "jdbc:oracle:thin:@" + ServerName + ":" + ServerPort + ":" + sid;
        String Username = "project";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Librarian.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Librarian.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  

        rs = st.executeQuery("select username,password from userss where user_type = 'Librarian'");
        try {
            while (rs.next()) {
               uname = rs.getString(1).toString();
                pass = rs.getString(2).toString();
                
        if (username.equals(uname) && passw.equals(pass)){
        
        ch=true;
        }
                             
        }

        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        if(ch==false){
        
           JOptionPane.showMessageDialog(null," Wrong Password or Username " );
        }
        return ch;
}
      
      public static void L_Notify() throws SQLException{
      
       // database connection 
        Statement st = null;
        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Librarian.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ServerName = "DESKTOP-L9V4O19";
        String ServerPort = "1521";
        String sid = "SSBR";
        String url = "jdbc:oracle:thin:@" + ServerName + ":" + ServerPort + ":" + sid;
        String Username = "project";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password); 
        } catch (SQLException ex) {
            Logger.getLogger(Librarian.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Librarian.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;

        // system date 
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
    
        // retrieve end date and student id from the database 
        rs = st.executeQuery("select end_date,student_id from borrowing");
   
        try{

        while(rs.next()){
   
            if(rs.getDate(1).toString().equals(sdf.format(date).toString())){
                
        // retrieve studentemail from the database based on student id
        rs2 = st.executeQuery("select email from student where Student_id='"+rs.getString(2)+"'");
                             
                               while(rs2.next()){
                              Notify_students( rs2.getString(1));  
                               }
            }
  
            }

        } catch(Exception e){
                    
            
                }   
      }
 
}
