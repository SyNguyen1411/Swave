/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import components.ScrollBar;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import entity.PlayList;

/**
 *
 * @author CAMERA VIET PHAT
 */
public class PlaylistOfSearchAll extends javax.swing.JPanel {

    public static ArrayList<PlayList> list = new ArrayList<>();
    
    /**
     * Creates new form PlaylistOfSearchAll
     */
    public PlaylistOfSearchAll() {
        initComponents();
        setBackground(Color.BLACK);
        lblTitle.setForeground(Color.WHITE);
        jscPlaylist.getViewport().setBackground(new Color(255, 255, 255, 0));
    }

    public void addPlayList(PlayList data) {
        PlaylistItem item = new PlaylistItem(data);
        pnlPlaylist.add(item);
        if (pnlPlaylist.getComponentCount() == 5){
            pnlPlaylist.setPreferredSize(new Dimension(1320, 330));
        }
        if (((pnlPlaylist.getComponentCount() - 1) != 0) && ((pnlPlaylist.getComponentCount() - 1 > 4))) {
            pnlPlaylist.setPreferredSize(new Dimension(pnlPlaylist.getWidth() + 256, 330));
            validate();
        }
        repaint();
        pnlPlaylist.revalidate();
    }

    public JScrollPane getJscPlaylist() {
        return jscPlaylist;
    }

    public void setJscPlaylist(JScrollPane jscPlaylist) {
        this.jscPlaylist = jscPlaylist;
    }

    public JPanel getPnlPlaylist() {
        return pnlPlaylist;
    }

    public void setPnlPlaylist(JPanel pnlPlaylist) {
        this.pnlPlaylist = pnlPlaylist;
    }

    public ScrollBar getScrollBar1() {
        return scrollBar1;
    }

    public void setScrollBar1(ScrollBar scrollBar1) {
        this.scrollBar1 = scrollBar1;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jscPlaylist = new javax.swing.JScrollPane();
        pnlPlaylist = new javax.swing.JPanel();
        scrollBar1 = new components.ScrollBar();
        lblTitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1239, 390));

        jscPlaylist.setBackground(new java.awt.Color(255, 255, 255));
        jscPlaylist.setBorder(null);
        jscPlaylist.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jscPlaylist.setHorizontalScrollBar(scrollBar1);
        jscPlaylist.setPreferredSize(new java.awt.Dimension(1239, 330));

        pnlPlaylist.setBackground(new java.awt.Color(255, 255, 255));
        pnlPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlPlaylist.setOpaque(false);
        pnlPlaylist.setPreferredSize(new java.awt.Dimension(1239, 330));
        pnlPlaylist.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 30));
        jscPlaylist.setViewportView(pnlPlaylist);

        scrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblTitle.setText("Playlist");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(0, 0, 0)
                .addComponent(jscPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jscPlaylist;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlPlaylist;
    private components.ScrollBar scrollBar1;
    // End of variables declaration//GEN-END:variables
}