/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swave;

import entity.Account;
import entity.User;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import utils.Auth;
import utils.MsgBox;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author ADMIN
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public Login mainLogin;
    
    public Signup(Login mainLogin) {
        this.mainLogin = mainLogin;
        initComponents();
        this.setLocationRelativeTo(null);
        simpleTitleBar1.init(this);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgroud = new javax.swing.JPanel();
        pnlSignup = new javax.swing.JPanel();
        btnSignupSWAVE = new component.Button();
        btnSignupgg = new component.Button();
        btnLogin = new component.Button();
        txtFullname = new model.input();
        lblUsername = new javax.swing.JLabel();
        txtPassword = new model.input();
        lblPassword = new javax.swing.JLabel();
        txtCheckPass = new model.input();
        lblCheckPass = new javax.swing.JLabel();
        txtUsername = new model.input();
        lblFullname = new javax.swing.JLabel();
        txtEmail = new model.input();
        lblEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSignup = new javax.swing.JLabel();
        lblPlaceholder7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblAcesss = new javax.swing.JLabel();
        lblBackgroud = new javax.swing.JLabel();
        simpleTitleBar1 = new swing.javaswingdev.SimpleTitleBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1532, 810));
        setMinimumSize(new java.awt.Dimension(1532, 810));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackgroud.setBackground(new java.awt.Color(0, 0, 0));
        pnlBackgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSignup.setOpaque(false);
        pnlSignup.setPreferredSize(new java.awt.Dimension(340, 477));
        pnlSignup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignupSWAVE.setForeground(new java.awt.Color(0, 0, 0));
        btnSignupSWAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconswave.png"))); // NOI18N
        btnSignupSWAVE.setText("Đăng ký");
        btnSignupSWAVE.setColor1(new java.awt.Color(255, 255, 255));
        btnSignupSWAVE.setColor2(new java.awt.Color(255, 255, 255));
        btnSignupSWAVE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignupSWAVE.setPreferredSize(new java.awt.Dimension(317, 45));
        btnSignupSWAVE.setSizeSpeed(8.0F);
        btnSignupSWAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupSWAVEActionPerformed(evt);
            }
        });
        pnlSignup.add(btnSignupSWAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 400, -1));

        btnSignupgg.setBackground(new java.awt.Color(0, 0, 0));
        btnSignupgg.setForeground(new java.awt.Color(0, 0, 0));
        btnSignupgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gg.png"))); // NOI18N
        btnSignupgg.setText("Đăng ký bằng Google");
        btnSignupgg.setColor1(new java.awt.Color(255, 255, 255));
        btnSignupgg.setColor2(new java.awt.Color(255, 255, 255));
        btnSignupgg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignupgg.setPreferredSize(new java.awt.Dimension(317, 45));
        btnSignupgg.setSizeSpeed(8.0F);
        btnSignupgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupggActionPerformed(evt);
            }
        });
        pnlSignup.add(btnSignupgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 400, -1));

        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Đăng nhập");
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setPreferredSize(new java.awt.Dimension(317, 45));
        btnLogin.setSizeSpeed(8.0F);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlSignup.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 400, -1));

        txtFullname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFullnameCaretUpdate(evt);
            }
        });
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });
        pnlSignup.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 360, 45));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(88, 88, 88));
        lblUsername.setText("Tên tài khoản");
        pnlSignup.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 210, 40));

        txtPassword.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPasswordCaretUpdate(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnlSignup.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 360, 45));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(88, 88, 88));
        lblPassword.setText("Mật khẩu");
        pnlSignup.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 210, 40));

        txtCheckPass.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCheckPassCaretUpdate(evt);
            }
        });
        txtCheckPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckPassActionPerformed(evt);
            }
        });
        pnlSignup.add(txtCheckPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 360, 45));

        lblCheckPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCheckPass.setForeground(new java.awt.Color(88, 88, 88));
        lblCheckPass.setText("Xác nhận mật khẩu");
        pnlSignup.add(lblCheckPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 210, 40));

        txtUsername.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUsernameCaretUpdate(evt);
            }
        });
        txtUsername.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtUsernameAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        pnlSignup.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 360, 45));

        lblFullname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFullname.setForeground(new java.awt.Color(88, 88, 88));
        lblFullname.setText("Họ và Tên");
        pnlSignup.add(lblFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 210, 40));

        txtEmail.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtEmailCaretUpdate(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        pnlSignup.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 360, 45));

        lblEmail.setBackground(new java.awt.Color(102, 102, 102));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(88, 88, 88));
        lblEmail.setText("Email");
        pnlSignup.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/txtPassword.png"))); // NOI18N
        pnlSignup.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/txtPassword.png"))); // NOI18N
        pnlSignup.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/txtPassword.png"))); // NOI18N
        pnlSignup.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/txtPassword.png"))); // NOI18N
        pnlSignup.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/txtPassword.png"))); // NOI18N
        pnlSignup.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        lblSignup.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSignup.setForeground(new java.awt.Color(255, 255, 255));
        lblSignup.setText("Đăng ký");
        pnlSignup.add(lblSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lblPlaceholder7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlaceholder7.setForeground(new java.awt.Color(88, 88, 88));
        lblPlaceholder7.setText("Tên tài khoản");
        pnlSignup.add(lblPlaceholder7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 210, 40));

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(317, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 82, 82));
        jLabel9.setText("Điều khoản sử dụng?");
        jPanel2.add(jLabel9);

        lblAcesss.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAcesss.setForeground(new java.awt.Color(255, 255, 255));
        lblAcesss.setText("Truy cập");
        lblAcesss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAcesssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAcesssMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAcesssMouseExited(evt);
            }
        });
        jPanel2.add(lblAcesss);

        pnlSignup.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 700, -1, -1));

        pnlBackgroud.add(pnlSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 490, 740));

        lblBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Background-Sigup.png"))); // NOI18N
        pnlBackgroud.add(lblBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 810));
        pnlBackgroud.add(simpleTitleBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, -1));

        getContentPane().add(pnlBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1532, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFullnameCaretUpdate
        if (!txtFullname.getText().equals("")) {
            lblFullname.setText("");
        } else {
            lblFullname.setText("Họ và tên");
        }
    }//GEN-LAST:event_txtFullnameCaretUpdate

    private void btnSignupggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupggActionPerformed
        
    }//GEN-LAST:event_btnSignupggActionPerformed

    private void btnSignupSWAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupSWAVEActionPerformed
        
        String account = txtUsername.getText();
        String password = txtPassword.getText();
        String checkpass = txtCheckPass.getText();
        String fullName = txtFullname.getText();
        String email = txtEmail.getText();
        if (account.isEmpty() || password.isEmpty() || checkpass.isEmpty() || fullName.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
        } else if (!password.equals(checkpass)) {
        JOptionPane.showMessageDialog(this, "Mật khẩu không khớp!");
        } else {
        JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
        this.mainLogin = mainLogin;
        initComponents(); 
        this.setVisible(true); 
        dispose(); 
        
}
        
        
        
    }//GEN-LAST:event_btnSignupSWAVEActionPerformed

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        String fullName = txtFullname.getText();
        // validate name
        if (!fullName.matches("[a-zA-Z]+")) {
            // name is invalid
            JOptionPane.showMessageDialog(null, "Invalid name. Please enter letters only.", "Error", JOptionPane.ERROR_MESSAGE);
            txtFullname.requestFocus();
        }
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtCheckPassCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCheckPassCaretUpdate
        if (!txtCheckPass.getText().equals("")) {
            lblCheckPass.setText("");
        } else {
        lblCheckPass.setText("Xác nhận mật khẩu");
        }
    }//GEN-LAST:event_txtCheckPassCaretUpdate

    private void txtCheckPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckPassActionPerformed
  
        String checkpass= txtCheckPass.getText();
        String password = txtPassword.getText();
        if (!password.equals(checkpass)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu chính xác.");
        } else {
            JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác.");
               }
            
    }//GEN-LAST:event_txtCheckPassActionPerformed

    private void txtUsernameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUsernameCaretUpdate
        if (!txtUsername.getText().equals("")) {
            lblUsername.setText("");
        } else {
        lblUsername.setText("Tên tài khoản");
        }
    }//GEN-LAST:event_txtUsernameCaretUpdate

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        String username = txtUsername.getText();
        if (username.length() < 6) {
            JOptionPane.showMessageDialog(null, "Tên tài khoản phải có ít nhất 6 ký tự");
        }
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtEmailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtEmailCaretUpdate
        if (!txtEmail.getText().equals("")) {
            lblEmail.setText("");
        } else {
        lblEmail.setText("Email");
        }
    }//GEN-LAST:event_txtEmailCaretUpdate

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        String email = txtEmail.getText();
        if (!email.matches("\\\\b[\\\\w.%-]+@[-.\\\\w]+\\\\.[A-Za-z]{2,4}\\\\b")) {
        JOptionPane.showMessageDialog(null, "Email không hợp lệ");
        }
        /*// call API to check email
        boolean emailExists = checkEmailExists(email);

        // handle result from API
        if (emailExists) {
            JOptionPane.showMessageDialog(null, "Email already exists. Please enter a different email.", "Error", JOptionPane.ERROR_MESSAGE);
            txtEmail.requestFocus();
        } else {
            // email does not exist, do something
        }
    }*/
    }//GEN-LAST:event_txtEmailActionPerformed

    private void lblAcesssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcesssMouseEntered
        lblAcesss.setForeground(new Color(233, 131, 255));
    }//GEN-LAST:event_lblAcesssMouseEntered

    private void lblAcesssMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcesssMouseExited
        lblAcesss.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblAcesssMouseExited

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        String password = txtPassword.getText();
        if (password.length() < 6) {
            JOptionPane.showMessageDialog(null, "password  phải có ít nhất 6 ký tự");
        }
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPasswordCaretUpdate
        if (!txtPassword.getText().equals("")) {
            lblPassword.setText("");
        } else {
        lblPassword.setText("Mật khẩu");
        }
    }//GEN-LAST:event_txtPasswordCaretUpdate

    private void txtUsernameAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtUsernameAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameAncestorMoved

    private void lblAcesssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcesssMouseClicked
        
    }//GEN-LAST:event_lblAcesssMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        mainLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button btnLogin;
    private component.Button btnSignupSWAVE;
    private component.Button btnSignupgg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAcesss;
    private javax.swing.JLabel lblBackgroud;
    private javax.swing.JLabel lblCheckPass;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPlaceholder7;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlBackgroud;
    private javax.swing.JPanel pnlSignup;
    private swing.javaswingdev.SimpleTitleBar simpleTitleBar1;
    private model.input txtCheckPass;
    private model.input txtEmail;
    private model.input txtFullname;
    private model.input txtPassword;
    private model.input txtUsername;
    // End of variables declaration//GEN-END:variables
}
