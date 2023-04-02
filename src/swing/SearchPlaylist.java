
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
 * @author NGUYEN VAN SI
 */
public class SearchPlaylist extends javax.swing.JPanel {

    public static ArrayList<PlayList> list = new ArrayList<>();
    
    /**
     * Creates new form PlayList
     */
    public SearchPlaylist() {
        initComponents();
        jscPlaylist.getViewport().setBackground(new Color(255, 255, 255, 0));
        for (int i = 0; i < 10; i++) {
            list.add(new PlayList(1, "abc", 2, true, "playlist.png"));
        }
    }

    public void addPlayList(PlayList data) {
        PlaylistItem item = new PlaylistItem();
        item.setData(data);
        pnlPlaylist.add(item);
        if (((pnlPlaylist.getComponentCount() - 1) != 0) && ((pnlPlaylist.getComponentCount() - 1) % 4 == 0)) {
            pnlPlaylist.setPreferredSize(new Dimension(1100, pnlPlaylist.getHeight() + 330));
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
    
    //Thêm PlayList và pnl Của Tôi
    public void addList(PlayList playlist) {
        this.addPlayList(playlist);
        revalidate();
    }

    //Load danh sách playlist của tôi
    public void loadPlaylist() {
        for (PlayList playList : list) {
            addList(playList);
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

        jscPlaylist = new javax.swing.JScrollPane();
        pnlPlaylist = new javax.swing.JPanel();
        scrollBar1 = new components.ScrollBar();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1273, 510));

        jscPlaylist.setBackground(new java.awt.Color(255, 255, 255));
        jscPlaylist.setBorder(null);
        jscPlaylist.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jscPlaylist.setHorizontalScrollBar(null);
        jscPlaylist.setVerticalScrollBar(scrollBar1);

        pnlPlaylist.setBackground(new java.awt.Color(255, 255, 255));
        pnlPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlPlaylist.setOpaque(false);
        pnlPlaylist.setPreferredSize(new java.awt.Dimension(1100, 330));
        pnlPlaylist.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 30));
        jscPlaylist.setViewportView(pnlPlaylist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jscPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jscPlaylist;
    private javax.swing.JPanel pnlPlaylist;
    private components.ScrollBar scrollBar1;
    // End of variables declaration//GEN-END:variables
}
