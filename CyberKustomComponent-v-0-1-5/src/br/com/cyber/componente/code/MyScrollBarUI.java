/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente.code;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dani
 * 
 * @fontes http://techqa.info/programming/question/8208508/Custom-design-JScollPane-Java-Swing
 *         https://stackoverflow.com/questions/8208508/custom-design-jscollpane-java-swing
 *         https://stackoverflow.com/questions/21790288/custom-jtable-scrollbar
 * 
 */

public class MyScrollBarUI extends BasicScrollBarUI implements MouseListener{

    Color background = new Color(199, 208, 216);
    
    protected static void initUI() {
        JFrame frame = new JFrame("Test scrollbar UI");
        JTable table = new JTable(new DefaultTableModel(30, 5));
        JScrollPane scrollPane = new JScrollPane(table);
        
        JPanel panel = new JPanel();
        
        panel.setBackground(Color.gray);
        panel.setOpaque(true);
      
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        
        frame.add(scrollPane);
        frame.pack();
        frame.setSize(frame.getWidth()-20, frame.getHeight()-50); // Forces the vertical scroll bar to show up
        frame.setVisible(true);
    }
    
    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {        
        g.translate(thumbBounds.x, thumbBounds.y);
        g.setColor(new Color(156, 166, 175));
        g.drawRect(0, 0, thumbBounds.width-1 , thumbBounds.height-1);
                        
        g.setColor(new Color(199, 208, 216));
        g.fillRect(1, 1, 300,thumbBounds.height-2);
        
        g.translate( -thumbBounds.x, -thumbBounds.y);
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {        
        g.translate(trackBounds.x, trackBounds.y);
        g.translate( -trackBounds.x, -trackBounds.y);
    }

    public static ComponentUI createUI(JComponent c) {
        return new MyScrollBarUI();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        background = new Color(2, 2, 2); 
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}