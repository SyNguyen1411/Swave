package swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import entity.PlayList;
import java.awt.Color;
import model.borderImage;
import swave.Login;
import swave.MainFrame;

/**
 *
 * @author NGUYEN VAN SI
 */
public class PlaylistItem extends javax.swing.JPanel {

    /**
     * Creates new form PlaylistItem
     */
    private MainFrame main;
    public PlayList data;

    public PlaylistItem() {
        initComponents();
        
    }

    public void loadData(PlayList data) {
        this.data = data;
        lblAVT.setIcon(this.data.toIcon());
        lblPlaylistName.setText(this.data.getPlaylistName());
        lblPlaylistAuthor.setText("By " + this.data.getUserID());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlaylistName = new javax.swing.JLabel();
        lblPlaylistAuthor = new javax.swing.JLabel();
        lblAVT = new model.borderImage();

        setBackground(new java.awt.Color(97, 97, 97));
        setPreferredSize(new java.awt.Dimension(256, 300));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPlaylistName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPlaylistName.setForeground(new java.awt.Color(253, 178, 255));
        lblPlaylistName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaylistName.setText("Playlist name");
        lblPlaylistName.setPreferredSize(new java.awt.Dimension(151, 29));
        add(lblPlaylistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, -1));

        lblPlaylistAuthor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlaylistAuthor.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaylistAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaylistAuthor.setText("By Author");
        lblPlaylistAuthor.setPreferredSize(new java.awt.Dimension(200, 29));
        add(lblPlaylistAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 180, -1));
        add(lblAVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 220, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(69,33,70));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        main.getC().show(main.getPnlChange(), "cardSongOfPlaylist");
        System.out.println("te");
    }//GEN-LAST:event_formMouseClicked

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(97, 97, 97));
    }//GEN-LAST:event_formMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    public PlayList getData() {
        return data;
    }

    public void setData(PlayList data) {
        this.data = data;
    }

    public borderImage getLblAVT() {
        return lblAVT;
    }

    public void setLblAVT(borderImage lblAVT) {
        this.lblAVT = lblAVT;
    }

    public JLabel getLblPlaylistAuthor() {
        return lblPlaylistAuthor;
    }

    public void setLblPlaylistAuthor(JLabel lblPlaylistAuthor) {
        this.lblPlaylistAuthor = lblPlaylistAuthor;
    }

    public JLabel getLblPlaylistName() {
        return lblPlaylistName;
    }

    public void setLblPlaylistName(JLabel lblPlaylistName) {
        this.lblPlaylistName = lblPlaylistName;
    }

    public MainFrame getMain() {
        return main;
    }

    public void setMain(MainFrame main) {
        this.main = main;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.borderImage lblAVT;
    private javax.swing.JLabel lblPlaylistAuthor;
    private javax.swing.JLabel lblPlaylistName;
    // End of variables declaration//GEN-END:variables
}
