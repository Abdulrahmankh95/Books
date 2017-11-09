
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

public class ReaderConnection2 extends Thread   {

    String tag;
    public static String f;
    public static int k=0;
    public static String time;
    public static String[] sd= new String[10];
    public static String[] ed = new String[10];
    public static String[] cid= new String[10];
    
    
    public static Date Tagtime;
    
public ReaderConnection2(String mn,String kn, String kj) throws AlienReaderTimeoutException, AlienReaderConnectionException, AlienReaderException, AlienReaderNotValidException, SQLException{
k++;
    
 sd[k]= mn;
 ed[k]= kn;
 cid[k]= kj;
 

  
}


    public void run() {

        try {      
            int j=Integer.parseInt(Thread.currentThread().getName().substring(7));
            gettag(sd[j],ed[j],cid[j]);
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

    public static void gettag(String start, String end, String course_id) throws AlienReaderNotValidException, AlienReaderTimeoutException, AlienReaderConnectionException, AlienReaderException, SQLException, InterruptedException {
 String tagListo="";
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
        String Username = "attendance";
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



while(true){
    
Date sysdate = new Date();
   SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm");
        time = localDateFormat.format(sysdate);
        
        System.out.println(time);
        
        if (start.equals(time)){
            
              
            
while(!end.equals(Tagtime)){
        try {
            
           
            
   AlienClass1Reader reader = new AlienClass1Reader(); 
reader.setConnection("192.168.1.5", 23); 
reader.setUsername("alien"); 
reader.setPassword("password"); 

       
        reader.open();
         
 

      
      tagList = reader.getTagID();
     
        
       Tagtime= reader.getTime(); 
         
        time = localDateFormat.format(Tagtime);
        System.out.println(time);
        
        System.out.println(Tagtime);
      String t5=" ";
      String studentname=null;
 rs3 = st2.executeQuery("select Course_Name from course where Course_Id='"+course_id+"' ");
       while(rs3.next()){
              t5 = rs3.getString(1);
        
       }

 
            
       rs = st.executeQuery("select Courses,Student_Id,First_Name,Last_Name from student ");
        while (rs.next()) {
             String t = rs.getString(1);
             String Stid=rs.getString(2).toString();
             String FN=rs.getString(3).toString();
             String LN=rs.getString(4).toString();
           if(t.contains(course_id)){
                 if(Stid.equals(tagList)){
                  rs3 = st4.executeQuery("select STUDENT_NAME from attendance");
                   while (rs.next()) {
                    studentname = rs.getString(1);
                   
                       
                   }
                   
                   if(studentname!= FN+" "+LN){
         rs2 = st3.executeQuery("insert into attendance values(sysdate,'Present','"+t5+"','"+FN+" "+LN+"')");
                   }
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
        try {
           Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReaderConnection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}
       }
      Thread.sleep(60000);
} 
    }
    
    
    
    

    public static void main(String[] args) throws AlienReaderNotValidException, AlienReaderTimeoutException, AlienReaderConnectionException, AlienReaderCommandErrorException, AlienReaderException, SQLException, InterruptedException, Exception {

        

     
//          System.out.println("Tag(s) found:"); 
//          for (int i=0; i<tagList.length; i++) { 
//              Tag tag = tagList[i]; 
//              System.out.println("ID:" + tag.getTagID() + 
//                      ", Discovered:" + tag.getDiscoverTime() + 
//                      ", Last Seen:" + tag.getRenewTime() + 
//                      ", Antenna:" + tag.getAntenna() + 
//                      ", Reads:" + tag.getRenewCount()); 
//                           reader.clearTagList();
//
//          }
    }

   
}
