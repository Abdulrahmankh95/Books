
import com.alien.enterpriseRFID.reader.AlienClass1Reader;
import com.alien.enterpriseRFID.reader.AlienReaderConnectionException;
import com.alien.enterpriseRFID.reader.AlienReaderConnectionRefusedException;
import com.alien.enterpriseRFID.reader.AlienReaderException;
import com.alien.enterpriseRFID.reader.AlienReaderTimeoutException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Attendance {
    
    
   


  public static void Time () throws SQLException, AlienReaderTimeoutException, AlienReaderConnectionException, AlienReaderException{
  
      
       // Alien RFID connection 
       
         AlienClass1Reader reader = new AlienClass1Reader(); 
       
         reader.setConnection("192.168.1.3", 23); 
         reader.setUsername("alien"); 
         reader.setPassword("password"); 
         reader.open();
      
        // database connection  
        Connection conn = null;
        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
          

        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
      
        rs = st.executeQuery("select Start_Time,End_Time,COURSE_ID from schedule");
        try {
            while (rs.next()) {
            String   t = rs.getString(1);
            String  t1 = rs.getString(2);
            String  cid = rs.getString(3);

             
 
                new ReaderConnection2(t,t1,cid,reader).start();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  
      }   
    

    
    public static void main(String[] args) throws SQLException, AlienReaderConnectionException, AlienReaderException {

            Time();

  
    }

}
