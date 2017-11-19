
import com.alien.enterpriseRFID.tags.Tag;
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
public class students {
    
    
    int Student_id;
    String First_name;
     String Last_name;
      int Birth_date;
    String Adrress;
    int Mobile_num;
    int Std_tag;
    String password;
    String Std_email;
    

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int Student_id) {
        this.Student_id = Student_id;
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

    public int getBirth_date() {
        return Birth_date;
    }

    public void setBirth_date(int Birth_date) {
        this.Birth_date = Birth_date;
    }

    public String getAdrress() {
        return Adrress;
    }

    public void setAdrress(String Adrress) {
        this.Adrress = Adrress;
    }

    public int getMobile_num() {
        return Mobile_num;
    }

    public void setMobile_num(int Mobile_num) {
        this.Mobile_num = Mobile_num;
    }

    public int getStd_tag() {
        return Std_tag;
    }

    public void setStd_tag(int Std_tag) {
        this.Std_tag = Std_tag;
    }

    public String getStd_email() {
        return Std_email;
    }

    public void setStd_email(String Std_email) {
        this.Std_email = Std_email;
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
  


    
        rs = st.executeQuery("select username,password from Users where user_type = 'Student'");
        try {
            while (rs.next()) {
               uname = rs.getString(1).toString();
                pass = rs.getString(2).toString();
                

                

                           
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        if (username.equals(uname) && passw.equals(pass)){
        
        ch=true;
        }
        else{
        
            System.out.println("wrong password");
        }
        return ch;
}
     
    
    public static void Barrow_books(Tag[] Taglist){
       
//        String Std[]=new String[5];
//      
//     Std[0]="100"; 
//     Std[1]="200"; 
//     Std[2]="300"; 
//     Std[3]="400"; 
//     Std[4]="500"; 
//     
//  String Book[]=new String[5];
//      
//     Book[0]="1000"; 
//     Book[1]="2000"; 
//     Book[2]="3000"; 
//     Book[3]="4000"; 
//     Book[4]="5000"; 
//
//      
//        Scanner Scan = new Scanner(System.in);
//        int S_id;
//        int B_id;
//        int a = 0;
//        do{
//        
//        for(int i=0;i<Std.length;i++){
//             for(int j=0;i<Taglist.length;j++){
//           if(Taglist[j].toString() == Std[i]){
//        
//            System.out.println("Student ID is correct");
//            a++;
//          break;
//        }else if(i==Std.length-1){
//               System.out.println("Student id is not correct");
//               break;
//           }
//             }
//           }
//         }while(a==0);
//        
//        
//        
//  
//            
//       do{
//    
//         for(int i=0;i<Book.length;i++){
//           for(int j=0;i<Taglist.length;j++){
//        if(Taglist[j].toString() == Book[i]){
//        
//            System.out.println("Book ID is correct");
//            a++;
//            
//           break;
//        
//        }else if(i==Book.length-1){
//               System.out.println("Book id is not correct");
//               break;
//           }
//           
//         }
//         }
//       }while(a==1);
             

    
    
    
   }
        
        
   

    
   
      
}
