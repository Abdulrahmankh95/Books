
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 

public class ManageAccessRight extends javax.swing.JFrame {
   
    public static ManageAccessRight  Owin =  new ManageAccessRight();

    public ManageAccessRight() {
        initComponents();
   
       // add student name and gates to the combobox
        sname();
        gname();
    }
    
    
      public  void sname(){
   
      // database connection 
        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
  
        // retrieve the student name to add it to the combobox 
      try {
            rs = st.executeQuery("select FIRST_NAME,LAST_NAME from student" );
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                String fname = rs.getString(1).toString();
                String lname = rs.getString(2).toString();
                 
             jComboBox1.addItem(fname+" "+lname);
      
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
      
      
      public  void gname(){
   
      // database connection 
        Connection conn = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        Statement st1 = null;
        try {
            st1 = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs1 = null;
  
    // retrieve the college name to add it to the combobox 
      try {
            rs1 = st1.executeQuery("select COLLEGE_NAME from gates" );
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs1.next()) {
                String gname = rs1.getString(1).toString();

                 
             jComboBox2.addItem(gname);
      
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox2.setBackground(new java.awt.Color(255, 204, 51));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Gate Number" }));

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Add Access Right");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Remove Access Right");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 204, 51));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Student" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 102, 153));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("User type: Admin");
        jLabel12.setToolTipText("");

        jLabel9.setBackground(new java.awt.Color(0, 153, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Parking System");
        jLabel9.setToolTipText("");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\3badi\\Desktop\\sos-electronics-parking-gate.png")); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(422, 422, 422)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(186, 186, 186))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(25, 25, 25)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(45, 45, 45))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     // database connection 
        Connection conn = null;
        String OGN = null;
        String NGN = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        

            Statement st = null;
            Statement st1 = null;
            Statement st2 = null;


        try {
            st = conn.createStatement();
            st1 = conn.createStatement();
            st2 = conn.createStatement();


        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        

 
   
        
        String s = jComboBox1.getSelectedItem().toString();
        
        int i=s.indexOf(" ");
       
        
       if(!s.contains("Choose") && !jComboBox2.getSelectedItem().toString().contains("Choose") ){
         
        try {
            rs1 = st1.executeQuery("select GATE_NUM from gates where COLLEGE_NAME='"+jComboBox2.getSelectedItem()+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        } 
        try {
            while (rs1.next()) {
                 NGN = " "+rs1.getString(1).toString();

            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
  
         try {
            rs2 = st2.executeQuery("select GATE_NUM from student where FIRST_NAME='"+s.substring(0, i)+"' and Last_Name='"+s.substring(i+1)+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs2.next()) {
                 OGN =rs2.getString(1).toString();
        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        if(!OGN.contains(NGN)){
       String GN = OGN+NGN;
      try {
            rs = st.executeQuery("update student set GATE_NUM='"+GN+"' where FIRST_NAME='"+s.substring(0, i)+"'and Last_Name='"+s.substring(i+1)+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          JOptionPane.showMessageDialog(null, "Access Added ");

        
          
        }else{
                   JOptionPane.showMessageDialog(null, "Access is already exist");

        }
       }else{
                  JOptionPane.showMessageDialog(null, "Choose somthing");
  
       }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        Connection conn = null;
        String OGN = null;
        String NGN = null;

        String DriverName = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        

            Statement st = null;
            Statement st1 = null;
            Statement st2 = null;


        try {
            st = conn.createStatement();
            st1 = conn.createStatement();
            st2 = conn.createStatement();


        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        

 
   
        
        String s = jComboBox1.getSelectedItem().toString();
        int i=s.indexOf(" ");
        
        
        if(!s.contains("Choose") && !jComboBox2.getSelectedItem().toString().contains("Choose") ){
         
        try {
            rs1 = st1.executeQuery("select GATE_NUM from gates where COLLEGE_NAME='"+jComboBox2.getSelectedItem()+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs1.next()) {
                 NGN = " "+rs1.getString(1).toString();
  
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
         try {
            rs2 = st2.executeQuery("select GATE_NUM from student where FIRST_NAME='"+s.substring(0, i)+"'and Last_Name='"+s.substring(i+1)+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs2.next()) {
                 OGN = rs2.getString(1).toString();
                                 
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          if(OGN.contains(NGN)){
      
         try {
            rs = st.executeQuery("update student set GATE_NUM='"+OGN.replaceAll(NGN, "")+"' where FIRST_NAME='"+s.substring(0, i)+"'and Last_Name='"+s.substring(i+1)+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(ManageAccessRight.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        JOptionPane.showMessageDialog(null, "Access Romoved ");

     }
  
        }else
             JOptionPane.showMessageDialog(null, "Choose Somthing ");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Psystem.Owin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAccessRight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
