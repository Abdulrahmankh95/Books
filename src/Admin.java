
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 


public class Admin {
    
    int Admin_id;
    String Username;
    String First_name;
    String Last_name;
    String Admin_email;
    String Password;

    public int getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(int Admin_id) {
        this.Admin_id = Admin_id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
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

    public String getAdmin_email() {
        return Admin_email;
    }

    public void setAdmin_email(String Admin_email) {
        this.Admin_email = Admin_email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    public static boolean Log_in(String username,String passw) throws SQLException{
        
        String uname="" ;
        String pass ="";
        boolean ch = false;
        
        // database coonection 
        Statement st = null;
        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  


      // retrieve username and password of the admin users
        rs = st.executeQuery("select username,password from userss where user_type = 'Admin'");
        try {
            while (rs.next()) {
               uname = rs.getString(1).toString();
                pass = rs.getString(2).toString();
                

               if (username.equals(uname) && passw.equals(pass)){
                ch=true;
        
            }
            
            }

        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
        if(ch==false){
         JOptionPane.showMessageDialog(null," Wrong Password or Username " );
            
        }
        
       return ch;
    }
 
     public static void Create_accounts(){
    }
    
     public static void Search_for_books(){
    }
}
