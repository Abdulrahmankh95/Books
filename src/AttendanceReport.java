
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



public class AttendanceReport extends javax.swing.JFrame {

    public static AttendanceReport Owin = new AttendanceReport();
   
    public AttendanceReport() {
        initComponents();
        Sname();
        Cname();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox1.setBackground(new java.awt.Color(0, 102, 153));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 204, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Student" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(0, 102, 153));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 204, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Course" }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("Print Report ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jRadioButton1.setText("Student");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jRadioButton2.setText("Course");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("User type: Instructor");
        jLabel3.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(0, 102, 153));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Attendance System");
        jLabel4.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\3badi\\Desktop\\hr1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

jComboBox2.setVisible(true);
jComboBox1.setVisible(false);
jComboBox1.setSelectedIndex(0);
jComboBox2.enable();

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String student,course;


        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        Statement st = null;
        
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  


        student= jComboBox1.getSelectedItem().toString();

        course= jComboBox2.getSelectedItem().toString();

        if (student.contains("Choose")==false){
        
      
            try {
            rs = st.executeQuery("select * from attendance where STUDENT_NAME =  "+"'"+student+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            try {
                
        FileOutputStream outputStream = new FileOutputStream("Attendance.xls");
        File ff = new File("Attendance.xls");

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
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "please close the file to update ");
        } catch (IOException ex) {
        Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
    }
 
} 
              else if(course.contains("Choose")==false){
    
              try {
            
                rs = st.executeQuery("select * from attendance where Course_name =  "+"'"+course+"'" );
             
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
       
              try {
        FileOutputStream outputStream = new FileOutputStream("Attendance.xls");
        File ff = new File("Attendance.xls");

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
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "please close the file to update ");
        } catch (IOException ex) {
        Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
    }

}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

jComboBox1.setVisible(true);
jComboBox2.setVisible(false);
jComboBox2.setSelectedIndex(0);
jComboBox1.enable();

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    
    public  void Sname(){
  

        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        


        Statement st = null;
        
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  
    
      try {
            rs = st.executeQuery("select FIRST_NAME,LAST_NAME from STUDENT " );
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                String fname = rs.getString(1).toString();
                String lname = rs.getString(2).toString();
                 
             jComboBox1.addItem(fname+" "+lname);
       
            }
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    
    public  void Cname(){
  

        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        } 
        


        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  
    
      try {
            rs = st.executeQuery("select Course_name from course " );
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                String Cname = rs.getString(1).toString();

                 
             jComboBox2.addItem(Cname);
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    
    
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Owin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
