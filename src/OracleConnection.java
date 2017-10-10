


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        
   Connection conn =null;
        
    
        String DriverName="oracle.jdbc.driver.OracleDriver";
        Class.forName(DriverName);
        String ServerName="DESKTOP-L9V4O19";
        String ServerPort="1521";
        String sid="SSBR";
        String url="jdbc:oracle:thin:@" + ServerName +":"+ ServerPort + ":" + sid;
        String Username="myuser1";
        String password="mypassword";
        conn=DriverManager.getConnection(url,Username,password);
          System.out.println("Successfully connected to the database");
     
      /////////////////////////////////////
      try{
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("select * from TestingTable");
      while(rs.next()){
          int no =rs.getInt(1);
          String name=rs.getString(2).toString();
          
          System.out.println("" + no + " " + name );
         
      }
      rs.close();
     
      }catch (Exception e){
     
          e.printStackTrace();
    
      }
      
      
      
        





    }
    
}
