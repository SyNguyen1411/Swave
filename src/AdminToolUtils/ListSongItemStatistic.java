/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminToolUtils;

import entity.Song;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.borderImage;

/**
 *
 * @author Admin
 */
public class ListSongItemStatistic extends javax.swing.JPanel {

    /**
     * Creates new form ListSongItemAddSongPanel
     */ 

    
    public ListSongItemStatistic() {
        initComponents();
        init();
    }
    
    public ListSongItemStatistic(Object[] song) throws UnsupportedAudioFileException, IOException{
        initComponents();
        init();
        Song songTemp = new Song();
        System.out.println(song[2]);
        songTemp.setAVT((String) song[2]);
        lblPic.setIcon(songTemp.toIcon());
        lblSongName.setText((String) song[1]);
        lblStatistic.setText(String.valueOf(song[3]));
    }

    public borderImage getBorderImage1() {
        return lblPic;
    }

    public void setBorderImage1(borderImage borderImage1) {
        this.lblPic = borderImage1;
    }

   

    public JLabel getLblPosition() {
        return lblPosition;
    }

    public void setLblPosition(JLabel lblPosition) {
        this.lblPosition = lblPosition;
    }

    public JLabel getLblSongName() {
        return lblSongName;
    }

    public void setLblSongName(JLabel lblSongName) {
        this.lblSongName = lblSongName;
    }

    public JLabel getLblStatistic() {
        return lblStatistic;
    }

    public void setLblStatistic(JLabel lblStatistic) {
        this.lblStatistic = lblStatistic;
    }


    public JPanel getPnlSongInfo() {
        return pnlSongInfo;
    }

    public void setPnlSongInfo(JPanel pnlSongInfo) {
        this.pnlSongInfo = pnlSongInfo;
    }
    
    
    
    private void init(){
        setOpaque(false);
        pnlSongInfo.setOpaque(false);

        
        this.setBackground(new Color(0,0,0,1));
        pnlSongInfo.setBackground(new Color(0,0,0,1));

        

        lblPosition.setFont(new Font("Inter",Font.PLAIN,22));
        lblSongName.setFont(new Font("Inter",Font.PLAIN,22));
        lblStatistic.setFont(new Font("Inter",Font.PLAIN,22));
        

        lblPosition.setForeground(Color.white);
        lblSongName.setForeground(Color.white);
        lblStatistic.setForeground(Color.white);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPosition = new javax.swing.JLabel();
        pnlSongInfo = new javax.swing.JPanel();
        lblPic = new model.borderImage();
        lblSongName = new javax.swing.JLabel();
        lblStatistic = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 51, 255));
        setMaximumSize(new java.awt.Dimension(1073, 70));
        setMinimumSize(new java.awt.Dimension(1073, 70));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1073, 70));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPosition.setText("1");
        lblPosition.setMaximumSize(new java.awt.Dimension(97, 51));
        lblPosition.setMinimumSize(new java.awt.Dimension(97, 51));
        lblPosition.setName(""); // NOI18N
        lblPosition.setPreferredSize(new java.awt.Dimension(97, 51));
        add(lblPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlSongInfo.setMaximumSize(new java.awt.Dimension(315, 50));
        pnlSongInfo.setMinimumSize(new java.awt.Dimension(315, 50));
        pnlSongInfo.setPreferredSize(new java.awt.Dimension(315, 50));
        pnlSongInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPic.setMaximumSize(new java.awt.Dimension(50, 50));
        lblPic.setMinimumSize(new java.awt.Dimension(50, 50));
        lblPic.setSizeImage(new int[] {50, 50});

        javax.swing.GroupLayout lblPicLayout = new javax.swing.GroupLayout(lblPic);
        lblPic.setLayout(lblPicLayout);
        lblPicLayout.setHorizontalGroup(
            lblPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        lblPicLayout.setVerticalGroup(
            lblPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlSongInfo.add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblSongName.setText("Midnight");
        lblSongName.setMaximumSize(new java.awt.Dimension(300, 100));
        lblSongName.setName(""); // NOI18N
        pnlSongInfo.add(lblSongName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, -1, -1));

        add(pnlSongInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lblStatistic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatistic.setText("Taylor Swift");
        lblStatistic.setMaximumSize(new java.awt.Dimension(194, 51));
        lblStatistic.setMinimumSize(new java.awt.Dimension(194, 51));
        lblStatistic.setPreferredSize(new java.awt.Dimension(194, 51));
        add(lblStatistic, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.borderImage lblPic;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSongName;
    private javax.swing.JLabel lblStatistic;
    private javax.swing.JPanel pnlSongInfo;
    // End of variables declaration//GEN-END:variables
}
