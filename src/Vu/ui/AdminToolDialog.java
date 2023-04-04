/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vu.ui;

import java.awt.CardLayout;

/**
 *
 * @author Admin
 */
public class AdminToolDialog extends javax.swing.JDialog {

    /**
     * Creates new form AdminToolDialog
     */
    private CardLayout c;
    public AdminToolDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        c = (CardLayout) pnlChange.getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChange = new javax.swing.JPanel();
        allCommentPane2 = new Vu.ui.AllCommentPane();
        censorSongPane2 = new Vu.ui.CensorSongPane();
        reportCommentPanel2 = new Vu.ui.ReportCommentPanel();
        statisticLikePanel2 = new Vu.ui.StatisticLikePanel();
        statisticViewPanel2 = new Vu.ui.StatisticViewPanel();
        uncensorSongPane2 = new Vu.ui.UncensorSongPane();
        userManagermentPanel1 = new Vu.ui.UserManagermentPanel();
        menuBar1 = new AdminToolUtils.MenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlChange.setBackground(new java.awt.Color(36, 36, 36));
        pnlChange.setPreferredSize(new java.awt.Dimension(1213, 807));
        pnlChange.setLayout(new java.awt.CardLayout());
        pnlChange.add(allCommentPane2, "card2");
        pnlChange.add(censorSongPane2, "card3");
        pnlChange.add(reportCommentPanel2, "card4");
        pnlChange.add(statisticLikePanel2, "card5");
        pnlChange.add(statisticViewPanel2, "card6");
        pnlChange.add(uncensorSongPane2, "card7");
        pnlChange.add(userManagermentPanel1, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menuBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlChange, javax.swing.GroupLayout.PREFERRED_SIZE, 1219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AdminToolDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminToolDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminToolDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminToolDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminToolDialog dialog = new AdminToolDialog(new javax.swing.JFrame(), true);
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
    private Vu.ui.AllCommentPane allCommentPane2;
    private Vu.ui.CensorSongPane censorSongPane2;
    private AdminToolUtils.MenuBar menuBar1;
    private javax.swing.JPanel pnlChange;
    private Vu.ui.ReportCommentPanel reportCommentPanel2;
    private Vu.ui.StatisticLikePanel statisticLikePanel2;
    private Vu.ui.StatisticViewPanel statisticViewPanel2;
    private Vu.ui.UncensorSongPane uncensorSongPane2;
    private Vu.ui.UserManagermentPanel userManagermentPanel1;
    // End of variables declaration//GEN-END:variables
}