package Vu.ui;

import dao.AccountDAO;
import dao.UserDAO;
import entity.Account;
import entity.User;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import swave.DialogLoad;
import utils.CheckForm;
import utils.MsgBox;

/**
 *
 * @author Admin
 */
public class ForgotPass extends java.awt.Frame {

    public ForgotPass mainForgotpass;

    public ForgotPass(java.awt.Frame parent, boolean modal) {
//        super(parent, false);
        initComponents();
        setLocationRelativeTo(null);
        init();
        txtTextPane.setBackground(new Color(0, 0, 0, 0));
        lblEnterAbout.setBackground(new Color(0, 0, 0, 0));
//        simpleTitleBar1.init(this);
    }

    private void init() {
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/img/Asset 5@4x 2.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTextPane = new javax.swing.JTextPane();
        lblAnother = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblAbout = new javax.swing.JLabel();
        txtUsername = new AdminToolUtils.TextField();
        txtCode = new AdminToolUtils.TextField();
        txtNewPass = new AdminToolUtils.TextField();
        btnChangePass = new AdminToolUtils.ButtonPass();
        btnCode = new AdminToolUtils.ButtonPass();
        btnLogIn = new AdminToolUtils.ButtonPass();
        lblEnterAbout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        simpleTitleBar1 = new swing.javaswingdev.SimpleTitleBar();

        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1530, 810));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1530, 810));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setOpaque(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Quên mật khẩu");

        jScrollPane2.setBorder(null);

        txtTextPane.setBackground(new java.awt.Color(0, 0, 0));
        txtTextPane.setBorder(null);
        txtTextPane.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTextPane.setForeground(new java.awt.Color(136, 136, 136));
        txtTextPane.setText("Nhập địa chỉ email bạn đã sử dụng để\nđăng ký SWave. Chúng tôi sẽ gửi cho bạn\nmột liên kết để đặt lại mật khẩu của bạn.");
        txtTextPane.setAutoscrolls(false);
        txtTextPane.setSelectedTextColor(new java.awt.Color(136, 136, 136));
        txtTextPane.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtTextPane);

        lblAnother.setForeground(new java.awt.Color(95, 95, 95));
        lblAnother.setText("hoặc tiếp tục với");

        lblAbout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAbout.setForeground(new java.awt.Color(82, 82, 82));
        lblAbout.setText("Điều khoản sử dụng?");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        txtCode.setPlaceHolder("Mã xác nhận");
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeKeyPressed(evt);
            }
        });

        txtNewPass.setPlaceHolder("Nhập mật khẩu mới");
        txtNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPassActionPerformed(evt);
            }
        });
        txtNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNewPassKeyPressed(evt);
            }
        });

        btnChangePass.setForeground(new java.awt.Color(0, 0, 0));
        btnChangePass.setText("Đặt lại mật khẩu");
        btnChangePass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        btnCode.setBackground(new java.awt.Color(109, 0, 136));
        btnCode.setText("Gửi mã");
        btnCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodeActionPerformed(evt);
            }
        });

        btnLogIn.setBackground(new java.awt.Color(34, 34, 34));
        btnLogIn.setText("Đăng nhập");
        btnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogInMouseClicked(evt);
            }
        });
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        lblEnterAbout.setBackground(new java.awt.Color(0, 0, 0));
        lblEnterAbout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEnterAbout.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterAbout.setText("Truy cập");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lblAbout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEnterAbout))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCode, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addGap(18, 18, 18)
                                .addComponent(lblAnother)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAnother)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbout)
                    .addComponent(lblEnterAbout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 146, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 820));
        jPanel1.add(simpleTitleBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnLogInMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPassActionPerformed

    private void btnCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodeActionPerformed
        DialogLoad sending = new DialogLoad(this, false, "Đang gửi mail...");
        sending.setVisible(true);
        Thread getCode = new Thread(new Runnable() {
            @Override
            public void run() {
                getCode();
                sending.setVisible(false);
            }
        });
        getCode.start();
    }//GEN-LAST:event_btnCodeActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        if (CheckForm.checkNullText(txtUsername)
                && CheckForm.checkNullText(txtCode)
                && CheckForm.checkNullText(txtNewPass)) {
            if (CheckForm.checkEmail(txtUsername)) {
                if (txtCode.getText().equals(String.valueOf(randomcode))) {
                    changepass();
                    MsgBox.alert(this, "Đặt lại mật khẩu thành công !");
                } else {
                    MsgBox.alert(this, "Mã xác nhận không đúng. Vui lòng nhập lại");
                }
            }
        }
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogInActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCode.requestFocus();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNewPass.requestFocus();
        }
    }//GEN-LAST:event_txtCodeKeyPressed

    private void txtNewPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUsername.requestFocus();
        }
    }//GEN-LAST:event_txtNewPassKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ForgotPass dialog = new ForgotPass(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private AdminToolUtils.ButtonPass btnChangePass;
    private AdminToolUtils.ButtonPass btnCode;
    private AdminToolUtils.ButtonPass btnLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblAnother;
    private javax.swing.JLabel lblEnterAbout;
    private javax.swing.JLabel lblTitle;
    private swing.javaswingdev.SimpleTitleBar simpleTitleBar1;
    private AdminToolUtils.TextField txtCode;
    private AdminToolUtils.TextField txtNewPass;
    private javax.swing.JTextPane txtTextPane;
    private AdminToolUtils.TextField txtUsername;
    // End of variables declaration//GEN-END:variables

    AccountDAO aDao = new AccountDAO();
    UserDAO uDao = new UserDAO();
    int randomcode;

//          private String getEmailOfAccount(String key) {
//                    String email = "";
//                    User entity = uDao.selectById(key);
//                    email = entity.getEmail();        
//                    return email;
//          }
    private String getUsername(String key) {
        String username = "";
        User entity = uDao.selectByEmail(key);
        username = entity.getAccount();
        return username;
    }

    private void updateAccount(Account entity) {
        aDao.update(entity);
    }

    private int getNumberCode() {
        return (int) (Math.random() * (999999 - 100000 + 1) + 100000);
    }

    private void getCode() {
        String email = txtUsername.getText();
        final String from = "nguyenvansitqt2k3@gmail.com";
        final String passMail = "rrvxuebtpbqmnvxp";
//                    User user = uDao.selectById(email);

//                   if (acc == null) {
//                             MsgBox.alert(this, "Tài khoản email không đúng");
//                   } else {
//                             String mailOfAcc = getEmailOfAccount(email);
//                             if (mailOfAcc.equals(email)) {
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", 587);

        Session session = Session.getInstance(p,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, passMail);
            }
        });
        try {
            randomcode = getNumberCode();
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));

            message.setSubject("Đặt lại mật khẩu tài khoản SWAVE");

            message.setText("Xin chào,\n"
                    + "Chúng tôi đã nhận được yêu cầu đặt lại mật khẩu SWAVE của bạn. Xin dùng mã này để đặt lại mật khẩu cho tài khoản SWAVE\n"
                    + "Đây là mã của bạn:\n"
                    + randomcode
                    + "\nBạn nên thay đổi lại mật khẩu cho mình để bảo đảm an toàn cho tài khoản.\n"
                    + "Xin cảm ơn");
            Transport.send(message);
            MsgBox.alert(this, "Chúng tôi đã gửi mã đến email của bạn");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
//                    }
//          }

    private void changepass() {
        String newpass = txtNewPass.getText();
        String email = txtUsername.getText();
        String username = getUsername(email);
        User user = uDao.selectById(username);
        if (user == null) {
            MsgBox.alert(this, "Tài khoản không tồn tại");
        } else {
            Account acc = aDao.selectById(username);
            acc.setPassword(newpass);
            updateAccount(acc);
        }
    }
}
