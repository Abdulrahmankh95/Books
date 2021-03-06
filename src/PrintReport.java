
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
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
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





public class PrintReport extends javax.swing.JFrame {

   public static PrintReport news = new PrintReport();
   
   public PrintReport() {
        initComponents();
     
// methods to add items components for the comboboxes
        Bname();
        Sname();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox1.setBackground(new java.awt.Color(255, 204, 51));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Student" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(0, 153, 204));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jRadioButton1.setText("Student");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 153, 204));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jRadioButton2.setText("Book");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(255, 204, 51));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Book" }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Borrowing System");
        jLabel2.setToolTipText("");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\3badi\\Desktop\\course-icon.png")); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filter: ");
        jLabel5.setToolTipText("");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("User type: Librarian");
        jLabel6.setToolTipText("");

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(139, 139, 139)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(272, 272, 272))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel6)
                    .addContainerGap(504, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel6)
                    .addContainerGap(614, Short.MAX_VALUE)))
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
           
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
       
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String student,book,student_id = "";

        // database connection 
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
        String Username = "project";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password);
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
         

        Statement st = null;
        Statement st1 = null;


        try {
            st = conn.createStatement();
            st1 = conn.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        ResultSet rs = null;
        ResultSet rs1 = null;

        student= jComboBox1.getSelectedItem().toString();
        book= jComboBox2.getSelectedItem().toString(); 

       if (student.contains("Choose")==false){
        
          // retrieve selected student id from the database
         try {
            rs1 = st1.executeQuery("select STUDENT_ID,FIRST_NAME,LAST_NAME from STUDENT" );
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            while (rs1.next()) {
                String SID = rs1.getString(1).toString();
                String FN = rs1.getString(2).toString();
                String LN = rs1.getString(3).toString();
                

                if(student.equals(FN+" "+LN)){
                      student_id= SID;        
            }

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        // retrieve the report information based on the selected student id
        try {
            rs = st.executeQuery("select Student.First_name,Student.Last_name,Borrowing.Start_date,Borrowing.End_date,Book.title from(( Borrowing inner join Student on Borrowing.student_id = Student.student_id)inner join Book on Borrowing.book_id = Book.book_id )where Student.STUDENT_ID =  "+"'"+student_id+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
             FileOutputStream outputStream = new FileOutputStream("Borrowing.xls");
                             File ff = new File("Borrowing.xls");  
 
        
        Workbook wb = new HSSFWorkbook();
        Font f = wb.createFont();
        f.setColor(IndexedColors.WHITE.index);
        f.setBold(true);
        Sheet sh = wb.createSheet("Borrowing");
        
        Cell c = sh.createRow(0).createCell(0);
        Cell c1 = sh.createRow(0).createCell(1);
        Cell c2 = sh.createRow(0).createCell(2);
        Cell c3 = sh.createRow(0).createCell(3);
        Cell c4 = sh.createRow(0).createCell(4);
        CellStyle cs= wb.createCellStyle();
        
        cs.setFillForegroundColor(IndexedColors.GOLD.index);
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cs.setFont(f);
        c.setCellStyle(cs);
        c.setCellValue("First Name:");
        c1.setCellStyle(cs);
        c1.setCellValue("Last Name:");
        c2.setCellStyle(cs);
        c2.setCellValue("Start Date:");
        c3.setCellStyle(cs);
        c3.setCellValue("End Date:");
        c4.setCellStyle(cs);
        c4.setCellValue("Title:");
        
            int x=1,y=0;
        
            while (rs.next()) {
           

                String Fname = rs.getString(1).toString();
                String Lname = rs.getString(2).toString();
                Date Sdate=rs.getDate(3);
                Date Edate=rs.getDate(4);
                String Title = rs.getString(5).toString();

                     Row r= sh.createRow(x);
              
              r.createCell(y).setCellValue(Fname);
              y++;

              r.createCell(y).setCellValue(Lname);
              y++;

              r.createCell(y).setCellValue(Sdate.toString());
              y++;
              
              r.createCell(y).setCellValue(Edate.toString());
              y++;

              r.createCell(y).setCellValue(Title);
              y=0;
              
              x++;
  
                  
                
                          }
              wb.write(outputStream);
         outputStream.close();
         Desktop d = Desktop.getDesktop();
         d.open(ff);        
            
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "please close the file to update ");
        } catch (IOException ex) {
        Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
    }

}
           else if(book.contains("Choose")==false){
  
             // retrieve the report information based on the selected book title
              try {
            rs = st.executeQuery("select Student.First_name,Student.Last_name,Borrowing.Start_date,Borrowing.End_date,Book.title from(( Borrowing inner join Student on Borrowing.student_id = Student.student_id)inner join Book on Borrowing.book_id = Book.book_id )where Title =  "+"'"+book+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
              try {
            
              FileOutputStream outputStream = new FileOutputStream("Borrowing.xls");
              File ff = new File("Borrowing.xls");  
 
        
        Workbook wb = new HSSFWorkbook();
        Font f = wb.createFont();
        f.setColor(IndexedColors.WHITE.index);
        f.setBold(true);
        Sheet sh = wb.createSheet("Borrowing");
        
        Cell c = sh.createRow(0).createCell(0);
        Cell c1 = sh.createRow(0).createCell(1);
        Cell c2 = sh.createRow(0).createCell(2);
        Cell c3 = sh.createRow(0).createCell(3);
        Cell c4 = sh.createRow(0).createCell(4);
        CellStyle cs= wb.createCellStyle();
        
        cs.setFillForegroundColor(IndexedColors.GOLD.index);
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cs.setFont(f);
        c.setCellStyle(cs);
        c.setCellValue("First Name:");
        c1.setCellStyle(cs);
        c1.setCellValue("Last Name:");
        c2.setCellStyle(cs);
        c2.setCellValue("Start Date:");
        c3.setCellStyle(cs);
        c3.setCellValue("End Date:");
        c4.setCellStyle(cs);
        c4.setCellValue("Title:");
        int x=1,y=0;
            
            while (rs.next()) {
                String Fname = rs.getString(1).toString();
                String Lname = rs.getString(2).toString();
                Date Sdate=rs.getDate(3);
                Date Edate=rs.getDate(4);
                String Title = rs.getString(5).toString();



                
                
                     Row r= sh.createRow(x);
              
              r.createCell(y).setCellValue(Fname);
              y++;

              r.createCell(y).setCellValue(Lname);
              y++;

              r.createCell(y).setCellValue(Sdate.toString());
              y++;
              
              r.createCell(y).setCellValue(Edate.toString());
              y++;

              r.createCell(y).setCellValue(Title);
              y=0;
              
              x++;
  
                  
                
    }
         wb.write(outputStream);
         outputStream.close();
         Desktop d = Desktop.getDesktop();
         d.open(ff);        
         
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "please close the file to update ");
        } catch (IOException ex) {
        Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
    }

}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

     jComboBox1.setVisible(true);
     jComboBox2.setVisible(false);
     jComboBox2.setSelectedIndex(0);
     jComboBox1.enable();
     
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    jComboBox2.setVisible(true);
    jComboBox1.setVisible(false);
    jComboBox1.setSelectedIndex(0);
    jComboBox2.enable();

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LibrarianFunctions.news.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
 
 
       public  void Sname(){
  
        // database connection 
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
        String Username = "project";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password);
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 
        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  
       // retrieve student name from the database and add it to the combobox
      try {
            rs = st.executeQuery("select FIRST_NAME,LAST_NAME from STUDENT " );
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                String fname = rs.getString(1).toString();
                String lname = rs.getString(2).toString();
                 
             jComboBox1.addItem(fname+" "+lname);
       
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    
        public  void Bname(){
       
        // database connection 
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
        String Username = "project";
        String password = "tiger";
        try {
            conn = DriverManager.getConnection(url, Username, password);
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  
       // retrieve book title from the database and add it to the combobox
 
      try {
            rs = st.executeQuery("select TITLE from BOOK " );
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                String Bname = rs.getString(1).toString();

                 
             jComboBox2.addItem(Bname);
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintReport.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    
    
    
    
    
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException {

       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                news.setVisible(true);
            
                 

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
