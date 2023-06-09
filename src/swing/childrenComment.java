/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import Tien.ui.EditPlaylist;
import dao.CommentDAO;
import dao.CommentInteractionDAO;
import dao.ReportCommentDAO;
import entity.Comment;
import entity.ReportComment;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import swave.Login;
import utils.MsgBox;

/**
 *
 * @author NGUYEN VAN SI
 */
public class childrenComment extends javax.swing.JPanel {

    /**
     * Creates new form childrenComment
     */
    public Comment comment;
    private CommentDAO cDao = new CommentDAO();
    private boolean edit = false;
    private boolean delete = false;
    private boolean report = false;
    public CommentPane pane;
    private ReportCommentDAO rpDao = new ReportCommentDAO();
    private CommentInteractionDAO ciDao = new CommentInteractionDAO();

    public childrenComment() {
        initComponents();
    }

    public void checkRole() {
        if (Login.user.getUserID() == comment.getUserID()) {
            lblEdit.setVisible(true);
            lblRemove.setVisible(true);
        } else {
            lblEdit.setVisible(false);
            lblRemove.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEdit = new javax.swing.JLabel();
        lblRemove = new javax.swing.JLabel();
        lblReport = new javax.swing.JLabel();

        setBackground(new java.awt.Color(62, 2, 71));
        setPreferredSize(new java.awt.Dimension(93, 97));

        jPanel1.setBackground(new java.awt.Color(62, 2, 71));
        jPanel1.setPreferredSize(new java.awt.Dimension(93, 90));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        lblEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblEdit.setText("   Chỉnh sửa");
        lblEdit.setPreferredSize(new java.awt.Dimension(93, 30));
        lblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditMouseExited(evt);
            }
        });
        jPanel1.add(lblEdit);

        lblRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRemove.setForeground(new java.awt.Color(255, 255, 255));
        lblRemove.setText("   Xóa");
        lblRemove.setPreferredSize(new java.awt.Dimension(93, 30));
        lblRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRemoveMouseExited(evt);
            }
        });
        jPanel1.add(lblRemove);

        lblReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblReport.setForeground(new java.awt.Color(255, 255, 255));
        lblReport.setText("   Báo cáo");
        lblReport.setPreferredSize(new java.awt.Dimension(93, 30));
        lblReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblReportMousePressed(evt);
            }
        });
        jPanel1.add(lblReport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseEntered
        lblEdit.setForeground(new Color(255, 102, 255));
        lblRemove.setForeground(Color.white);
        lblReport.setForeground(Color.white);
    }//GEN-LAST:event_lblEditMouseEntered

    private void lblRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseEntered
        lblRemove.setForeground(new Color(255, 102, 255));
        lblEdit.setForeground(Color.white);
        lblReport.setForeground(Color.white);
    }//GEN-LAST:event_lblRemoveMouseEntered

    private void lblReportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReportMousePressed

    private void lblReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportMouseEntered
        lblReport.setForeground(new Color(255, 102, 255));
        lblEdit.setForeground(Color.white);
        lblRemove.setForeground(Color.white);
    }//GEN-LAST:event_lblReportMouseEntered

    private void lblRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseClicked
        cDao.delete(comment.getCommentID());
        pane.loadDataComment();
    }//GEN-LAST:event_lblRemoveMouseClicked

    private void lblReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportMouseClicked
        try {
            ReportComment item = new ReportComment();
            item.setCommentID(comment.getCommentID());
            item.setUserID(Login.user.getUserID());
            rpDao.insert(item);
            MsgBox.alert(this, "Bạn đã cáo cáo bình luận");
        } catch (Exception e) {
            MsgBox.alert(this, "Bạn đã báo cáo bình luận này rồi");
        }
    }//GEN-LAST:event_lblReportMouseClicked

    private void lblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseClicked
        EditPlaylist editPane = new EditPlaylist(pane.main, false);
        editPane.setLocationRelativeTo(null);
        editPane.setVisible(true);
        editPane.getBtnOK().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Comment item = new Comment();
                    item.setCommentID(comment.getCommentID());
                    item.setContent(editPane.getTxtNamePlaylist().getText());
                    item.setUserID(Login.user.getUserID());
                    cDao.update(item);
                    MsgBox.alert(pane, "Chỉnh sửa bình luận thành công");
                    pane.loadDataComment();
                    editPane.dispose();
                } catch (Exception el) {
                    MsgBox.alert(pane, "Lỗi thao tác !");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }//GEN-LAST:event_lblEditMouseClicked

    private void lblEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseExited
        lblEdit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblEditMouseExited

    private void lblRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseExited
        lblRemove.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_lblRemoveMouseExited

    private void lblReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportMouseExited
        lblReport.setForeground(Color.WHITE); 
    }//GEN-LAST:event_lblReportMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblReport;
    // End of variables declaration//GEN-END:variables
}
