/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;
import DBLayer.ConnectionProvider;
import java.rmi.registry.Registry;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Saidh-PC
 */
public class AdminRegister extends javax.swing.JFrame {

    /**
     * Creates new form AdminRegister
     */
    public AdminRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        Repassword = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Firstname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 216, 220, 20));

        jPasswordField1.setBorder(null);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 220, -1));

        Repassword.setBorder(null);
        Repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 220, -1));

        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 210, -1));

        jTextField5.setBorder(null);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 210, -1));

        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 210, -1));

        Firstname.setBorder(null);
        getContentPane().add(Firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 210, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Register");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 90, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminRegistration.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdminLogin em1 = new AdminLogin();
       em1.show();
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String Fname=Firstname.getText();
        String Lname=jTextField2.getText();
        String Email=jTextField3.getText();
        String Phone=jTextField5.getText();
        String username = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getText());
        String Renpassword = String.valueOf(Repassword.getText());   
        
    
            

        
        if(Fname.equals(""))
    {
        JOptionPane.showMessageDialog(null, "Add First Name");
    }
    else if(Lname.equals(""))
    {
        JOptionPane.showMessageDialog(null, "Add Last Name");
    }
    
    else if(Email.equals(""))
    {
        JOptionPane.showMessageDialog(null, "Add Email");
    }
    else if(Phone.equals(""))
    {
        JOptionPane.showMessageDialog(null, "Add Contact Number");
    }
    else if(username.equals(""))
    {
        JOptionPane.showMessageDialog(null, "Add User Name");
    }
    else if(password.equals(""))
    {
        JOptionPane.showMessageDialog(null, "Add Password");
    }
    else
    {
        if(!password.equals(Renpassword)){
        
         new ErrorPopup_1().setVisible(true);
         setVisible(false);
        
        }
        else{
        try{
    
        
    Connection con1 = ConnectionProvider.getConn();
    Statement stm = con1.createStatement();
    
    stm.executeUpdate("insert into aregistration values('"+Fname+"','"+Lname+"','"+Email+"','"+Phone+"','"+username+"','"+password+"')");
    
   
   
    
    setVisible(false);
    
    new ContinuePopup_1().setVisible(true);
     setVisible(false);
    
    
}
catch(Exception e){
    
    
    new ErrorPopup_1().setVisible(true);
}
    }
    }
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Firstname;
    private javax.swing.JPasswordField Repassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
