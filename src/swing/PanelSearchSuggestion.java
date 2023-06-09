/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import component.EventItem;
import dao.SearchDAO;
import entity.Search;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author RAVEN
 */
public class PanelSearchSuggestion extends javax.swing.JPanel {

    private EventItem event;
    private SearchDAO sdao = new SearchDAO();
    private List<Search> slist = new ArrayList<>();

    public void addEventClick(EventItem event) {
        this.event = event;
    }

    public PanelSearchSuggestion() {
        initComponents();
        setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
    }

    public void setData(List<Search> data) {
        this.removeAll();
        for (Search d : data) {
            ItemSearchSuggestion item = new ItemSearchSuggestion(d);
            //  add event
            item.addEvent(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    //  when click
                    event.itemClick(d);
                }
            });
            this.add(item, "wrap");
            //  wrap mean add to new row after this add
            //  this for miglayout option
        }
        repaint();
        revalidate();
        //  Refresh Component
    }

    public int getItemSize() {
        return getComponentCount();
    }
    
    public List<Search> dataSearch(String search) {
        int limitData = 10;
        slist = sdao.selectAll(search);
        List<Search> list = new ArrayList<>();
        
        for (Search s : slist) {
            list.add(s);
            if (list.size() == limitData) {
                break;
            }
        }
        return list;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
