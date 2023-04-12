/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import Tien.ui.EditPlaylist;
import entity.PlayList;
import entity.Song;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import model.borderImage;
import swave.MainFrame;

/**
 *
 * @author NGUYEN VAN SI
 */
public class SongOfPlaylistPane extends javax.swing.JPanel {

    /**
     * Creates new form SongOfPlaylistPane
     */
    public List<Song> listSOngOfPlayList = new ArrayList<>();
    private PlayList playlistFocus;
    public MainFrame main;

    public SongOfPlaylistPane() {
        initComponents();
    }

    //Thêm PlayList và pnl Của Tôi
    public void addList(Song song) throws UnsupportedAudioFileException, IOException, URISyntaxException {
        pnlSonglist.addSong(song, listSOngOfPlayList);
        revalidate();
        repaint();
    }

    //Thêm PlayList và pnl Của Tôi
    public void fillData() throws UnsupportedAudioFileException, IOException, URISyntaxException {
        lblAVT.setIcon(playlistFocus.toIcon());
        lblNamePlaylist.setText(playlistFocus.getPlaylistName());

        pnlSonglist.getPnlSongList().removeAll();
        for (Song song : listSOngOfPlayList) {
            pnlSonglist.addSong(song, listSOngOfPlayList);
        }
        
        revalidate();
        repaint();
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public borderImage getLblAVT() {
        return lblAVT;
    }

    public void setLblAVT(borderImage lblAVT) {
        this.lblAVT = lblAVT;
    }

    public JLabel getLblEdit() {
        return lblEdit;
    }

    public void setLblEdit(JLabel lblEdit) {
        this.lblEdit = lblEdit;
    }

    public JLabel getLblNamePlaylist() {
        return lblNamePlaylist;
    }

    public void setLblNamePlaylist(JLabel lblNamePlaylist) {
        this.lblNamePlaylist = lblNamePlaylist;
    }

    public JLabel getLblSumTime() {
        return lblSumTime;
    }

    public void setLblSumTime(JLabel lblSumTime) {
        this.lblSumTime = lblSumTime;
    }

    public JLabel getLblTile() {
        return lblTile;
    }

    public void setLblTile(JLabel lblTile) {
        this.lblTile = lblTile;
    }

    public JLabel getLblTimPlaylist() {
        return lblTimPlaylist;
    }

    public void setLblTimPlaylist(JLabel lblTimPlaylist) {
        this.lblTimPlaylist = lblTimPlaylist;
    }

    public JPanel getPnlHeader() {
        return pnlHeader;
    }

    public void setPnlHeader(JPanel pnlHeader) {
        this.pnlHeader = pnlHeader;
    }

    public JPanel getPnlInforPlaylist() {
        return pnlInforPlaylist;
    }

    public void setPnlInforPlaylist(JPanel pnlInforPlaylist) {
        this.pnlInforPlaylist = pnlInforPlaylist;
    }

    public JPanel getPnlSongOfPlaylist() {
        return pnlSongOfPlaylist;
    }

    public void setPnlSongOfPlaylist(JPanel pnlSongOfPlaylist) {
        this.pnlSongOfPlaylist = pnlSongOfPlaylist;
    }

    public SongList getPnlSonglist() {
        return pnlSonglist;
    }

    public void setPnlSonglist(SongList pnlSonglist) {
        this.pnlSonglist = pnlSonglist;
    }

    public JPanel getPnlTitleTable() {
        return pnlTitleTable;
    }

    public void setPnlTitleTable(JPanel pnlTitleTable) {
        this.pnlTitleTable = pnlTitleTable;
    }

    public List<Song> getListSOngOfPlayList() {
        return listSOngOfPlayList;
    }

    public void setListSOngOfPlayList(ArrayList<Song> listSOngOfPlayList) {
        this.listSOngOfPlayList = listSOngOfPlayList;
    }

    public PlayList getPlaylistFocus() {
        return playlistFocus;
    }

    public void setPlaylistFocus(PlayList playlistFocus) {
        this.playlistFocus = playlistFocus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        pnlInforPlaylist = new javax.swing.JPanel();
        lblEdit = new javax.swing.JLabel();
        lblTile = new javax.swing.JLabel();
        lblNamePlaylist = new javax.swing.JLabel();
        lblSumTime = new javax.swing.JLabel();
        lblTimPlaylist = new javax.swing.JLabel();
        lblAVT = new model.borderImage();
        pnlSongOfPlaylist = new javax.swing.JPanel();
        pnlTitleTable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlSonglist = new swing.SongList();

        setBackground(new java.awt.Color(0, 51, 51));
        setMinimumSize(new java.awt.Dimension(1230, 560));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1283, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(84, 84, 90));
        pnlHeader.setPreferredSize(new java.awt.Dimension(1283, 233));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInforPlaylist.setOpaque(false);
        pnlInforPlaylist.setPreferredSize(new java.awt.Dimension(522, 217));
        pnlInforPlaylist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EditIcon.png"))); // NOI18N
        lblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditMouseClicked(evt);
            }
        });
        pnlInforPlaylist.add(lblEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        lblTile.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTile.setForeground(new java.awt.Color(143, 65, 148));
        lblTile.setText("Playlist");
        pnlInforPlaylist.add(lblTile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblNamePlaylist.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblNamePlaylist.setForeground(new java.awt.Color(253, 178, 255));
        lblNamePlaylist.setText("LOFI CHILL 2023");
        lblNamePlaylist.setPreferredSize(new java.awt.Dimension(514, 55));
        pnlInforPlaylist.add(lblNamePlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        lblSumTime.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        lblSumTime.setForeground(new java.awt.Color(255, 255, 255));
        lblSumTime.setText("about 1hr 5 min");
        pnlInforPlaylist.add(lblSumTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 181, -1, -1));

        pnlHeader.add(pnlInforPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 13, -1, -1));

        lblTimPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TymPlaylist_select.png"))); // NOI18N
        pnlHeader.add(lblTimPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 94, 71, 71));

        lblAVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/playlist.png"))); // NOI18N
        lblAVT.setPreferredSize(new java.awt.Dimension(220, 220));
        pnlHeader.add(lblAVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlSongOfPlaylist.setOpaque(false);
        pnlSongOfPlaylist.setPreferredSize(new java.awt.Dimension(1073, 400));
        pnlSongOfPlaylist.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        pnlTitleTable.setOpaque(false);
        pnlTitleTable.setPreferredSize(new java.awt.Dimension(1073, 59));
        pnlTitleTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên bài hát");
        jLabel1.setPreferredSize(new java.awt.Dimension(501, 51));
        pnlTitleTable.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 4, 480, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time");
        jLabel2.setPreferredSize(new java.awt.Dimension(162, 51));
        pnlTitleTable.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 4, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("#");
        jLabel3.setPreferredSize(new java.awt.Dimension(112, 51));
        pnlTitleTable.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 4, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("##");
        jLabel4.setPreferredSize(new java.awt.Dimension(194, 51));
        pnlTitleTable.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 4, 180, -1));

        pnlSongOfPlaylist.add(pnlTitleTable);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(1073, 3));
        pnlSongOfPlaylist.add(jSeparator1);
        pnlSongOfPlaylist.add(pnlSonglist);

        add(pnlSongOfPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 1100, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseClicked
        new EditPlaylist(main, true).setVisible(true);
    }//GEN-LAST:event_lblEditMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private model.borderImage lblAVT;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblNamePlaylist;
    private javax.swing.JLabel lblSumTime;
    private javax.swing.JLabel lblTile;
    private javax.swing.JLabel lblTimPlaylist;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlInforPlaylist;
    private javax.swing.JPanel pnlSongOfPlaylist;
    private swing.SongList pnlSonglist;
    private javax.swing.JPanel pnlTitleTable;
    // End of variables declaration//GEN-END:variables
}
