import com.alien.enterpriseRFID.notify.Message;
import com.alien.enterpriseRFID.notify.MessageListener;
import com.alien.enterpriseRFID.notify.MessageListenerService;
import com.alien.enterpriseRFID.reader.AlienClass1Reader;
import com.alien.enterpriseRFID.reader.AlienReaderCommandErrorException;
import com.alien.enterpriseRFID.reader.AlienReaderConnectionException;
import com.alien.enterpriseRFID.reader.AlienReaderException;
import com.alien.enterpriseRFID.reader.AlienReaderNotValidException;
import com.alien.enterpriseRFID.reader.AlienReaderTimeoutException;
import com.alien.enterpriseRFID.tags.Tag;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


import com.alien.enterpriseRFID.reader.*; 
 import com.alien.enterpriseRFID.tags.*; 
 import com.alien.enterpriseRFID.notify.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Parking extends Thread   {

    String tag;
    public static String f;
    public static int k=0;
    public static String time;
    public static String[] sd= new String[10];
    public static String[] ed = new String[10];
    public static String[] cid= new String[10];
    
    
    public static Date Tagtime;
    
public Parking() throws AlienReaderTimeoutException, AlienReaderConnectionException, AlienReaderException, AlienReaderNotValidException, SQLException{

 

  
}


    public void run() {

        try {      
          
            gettag();
        } catch (AlienReaderTimeoutException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlienReaderConnectionException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlienReaderException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        

    }

    public static void gettag() throws AlienReaderNotValidException, AlienReaderTimeoutException, AlienReaderConnectionException, AlienReaderException, SQLException, InterruptedException {

  String tagList;



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
        String Username = "parking";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password);
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
            

Statement st = null;
Statement st2 = null;
Statement st3 = null;
Statement st4 = null;


        try {
            st = conn.createStatement();
            st2 = conn.createStatement();
            st3 = conn.createStatement();
            st4 = conn.createStatement();

           

        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
ResultSet rs2 = null;
ResultSet rs3 = null;
ResultSet rs4 = null;


  AlienClass1Reader reader = new AlienClass1Reader(); 
reader.setConnection("192.168.1.3", 23); 
reader.setUsername("alien"); 
reader.setPassword("password"); 

String GAN = "";
String  GAN2 = " ";
String CON=null;
        reader.open();
 
String RID=Integer.toString(reader.getReaderNumber());

        System.out.println(RID);
while(true){
    
    

      try {
            
           
            
 
    tagList = reader.getTagID();
    
     if(tagList!=null){
            
      rs = st.executeQuery("select GATE_NUM from student where STUDENT_ID='"+tagList+"' ");

        while (rs.next()) {
              GAN = rs.getString(1);
     
         
        }
          rs2 = st2.executeQuery("select GATE_NUM,COLLEGE_NAME from gates where READER_ID='"+RID+"' ");

                   while (rs2.next()) {
                 GAN2 = rs2.getString(1);
                 CON = rs2.getString(2);

                 
                   }
                   String sd = null;
                    rs4 = st4.executeQuery("select STUDENT_ID from PARKING ");

                   while (rs4.next()) {
                 sd = rs4.getString(1);
            

                 
                   }
                   
                   if(!sd.equals(tagList)){
                   
                   if(GAN.contains(GAN2)){
                   
                   
                   rs3 = st3.executeQuery("insert into parking values('Success',sysdate,'"+GAN2+"','"+tagList+"','"+CON+"')");
                         JOptionPane.showMessageDialog(null, "Gate opened ");
 
         
                   }else {
                rs3 = st3.executeQuery("insert into parking values('Fail',sysdate,'"+GAN2+"','"+tagList+"','"+CON+"')");
                          JOptionPane.showMessageDialog(null, "Not Authrized ");

                   } 
                   }
 
                   
     }     
                   
        } catch (AlienReaderTimeoutException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlienReaderConnectionException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlienReaderException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}
       }
      


    
    public static void main(String[] args) throws AlienReaderConnectionException, AlienReaderException, AlienReaderTimeoutException, AlienReaderNotValidException, SQLException {


new Parking().start();



    }
    
}
