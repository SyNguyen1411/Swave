
package Tien.ui;

import dao.PlaylistDAO;
import entity.PlayList;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class CreatPlaylist extends javax.swing.JDialog {

    /**
     * Creates new form AddPlaylist
     */
    public CreatPlaylist(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setBackground(new Color(255, 255, 255, 0));
        //test github;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        loadingPane1 = new panelMain.LoadingPane();
        lblTitle = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();
        btnCancel = new component.Button();
        lblCount = new javax.swing.JLabel();
        btnOK = new component.Button();
        txtNamePlaylist = new AdminToolUtils.TextFieldPlaylist();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(67, 67, 67));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Tạo Playlist");
        lblTitle.setPreferredSize(new java.awt.Dimension(165, 36));

        lblNote.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblNote.setForeground(new java.awt.Color(255, 255, 255));
        lblNote.setText("Tên playlist tối đa 100 kí tự");
        lblNote.setPreferredSize(new java.awt.Dimension(252, 24));

        btnCancel.setForeground(new java.awt.Color(204, 0, 204));
        btnCancel.setText("HỦY");
        btnCancel.setColor1(new java.awt.Color(255, 255, 255));
        btnCancel.setColor2(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setPreferredSize(new java.awt.Dimension(104, 45));
        btnCancel.setRadious(new int[] {50, 50});
        btnCancel.setSizeSpeed(12.0F);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblCount.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblCount.setForeground(new java.awt.Color(255, 255, 255));
        lblCount.setText("0/100");
        lblCount.setToolTipText("0/100");
        lblCount.setPreferredSize(new java.awt.Dimension(54, 24));

        btnOK.setText("TẠO");
        btnOK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOK.setPreferredSize(new java.awt.Dimension(104, 45));
        btnOK.setRadious(new int[] {50, 50});
        btnOK.setSizeSpeed(12.0F);
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });

        txtNamePlaylist.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNamePlaylist.setPlaceHolder("    Nhập tên playlist");

        javax.swing.GroupLayout loadingPane1Layout = new javax.swing.GroupLayout(loadingPane1);
        loadingPane1.setLayout(loadingPane1Layout);
        loadingPane1Layout.setHorizontalGroup(
            loadingPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingPane1Layout.createSequentialGroup()
                .addGroup(loadingPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loadingPane1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(lblNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loadingPane1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loadingPane1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loadingPane1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(loadingPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        loadingPane1Layout.setVerticalGroup(
            loadingPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingPane1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtNamePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(loadingPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(loadingPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKMouseClicked

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
            java.util.logging.Logger.getLogger(CreatPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreatPlaylist dialog = new CreatPlaylist(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button btnCancel;
    private component.Button btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblTitle;
    private panelMain.LoadingPane loadingPane1;
    private AdminToolUtils.TextFieldPlaylist txtNamePlaylist;
    // End of variables declaration//GEN-END:variables
    
    PlaylistDAO plDao = new PlaylistDAO();
    
    private PlayList getData(){
            PlayList pl = new PlayList();
            pl.setIcon("/AdminToolUtils/playlist.jpg");
//            pl.set
            return pl;
    }   
    
    private void insert(){
           
    }


}
