
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


 

public class AttendanceHistory extends javax.swing.JFrame {

    public AttendanceHistory() {
        initComponents();
        Cname();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("User type: Student");
        jLabel3.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(0, 102, 153));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Attendance System");
        jLabel4.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\3badi\\Desktop\\hr1.png")); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Course" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 19)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("My Attendance History");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 51));
        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4)
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String course;

        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        


        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  
 
        course= jComboBox1.getSelectedItem().toString();

        if (course.contains("choose")==false){
     
     
            try {
            
                rs = st.executeQuery("select * from attendance where Course_name =  "+"'"+course+"' and STUDENT_NAME="+"'"+students.First_name+" "+students.Last_name+"'" );
             
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
        }  
             try {
                 
        FileOutputStream outputStream = new FileOutputStream("Student.xls");
        File ff = new File("Student.xls");
        
        Workbook wb = new HSSFWorkbook();
        Font f = wb.createFont();
        f.setColor(IndexedColors.WHITE.index);
        f.setBold(true);
        Sheet sh = wb.createSheet("Attendance");
        
        Cell c = sh.createRow(0).createCell(0);
        Cell c1 = sh.createRow(0).createCell(1);
        Cell c2 = sh.createRow(0).createCell(2);
        Cell c3 = sh.createRow(0).createCell(3);
        CellStyle cs= wb.createCellStyle();
        
        cs.setFillForegroundColor(IndexedColors.GOLD.index);
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cs.setFont(f);
        c.setCellStyle(cs);
        c.setCellValue("Student Name:");
        c1.setCellStyle(cs);
        c1.setCellValue("Attendance Date:");
        c2.setCellStyle(cs);
        c2.setCellValue("Status:");
        c3.setCellStyle(cs);
        c3.setCellValue("Course name:");
        
            int x=1,y=0;
            
            while (rs.next()) {
               Date Adte=rs.getDate(1);
               String St=rs.getString(2).toString();
               String Cname = rs.getString(3).toString();
               String Fname = rs.getString(4).toString();
              
              Row r= sh.createRow(x);
              
              r.createCell(y).setCellValue(Fname);
              y++;

              r.createCell(y).setCellValue(Adte.toString());
              y++;

              r.createCell(y).setCellValue(St);
              y++;

              r.createCell(y).setCellValue(Cname);
              y=0;
              
              x++;
                  
 
            }
              
            wb.write(outputStream);
            outputStream.close();
            Desktop d = Desktop.getDesktop();
            d.open(ff);
            
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "please close the file to update ");
    } catch (IOException ex) {
        Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
    }
 
} 


    }//GEN-LAST:event_jButton1ActionPerformed
 
    
    public  void Cname(){
  

        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        


        Statement st = null;
        
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  
    
      try {
            rs = st.executeQuery("select Course_name from course " );
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                String Cname = rs.getString(1).toString();

                 
             jComboBox1.addItem(Cname);
      
            }
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
