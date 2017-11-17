/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente;

import br.com.cyber.componente.code.DefaultHeaderRenderer;
import br.com.cyber.componente.code.CustomDefaultTableColumnModel;
import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JTable;

/**
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class Ktable extends JTable  {

    private Integer amargin;
    private Color headercolor;
    

    public Integer getAmargin() {
        return amargin;
    }

    public void setAmargin(Integer a_margin) {
        this.amargin = a_margin;
    }

    public Color getHeadercolor() {
        return headercolor;
    }

    public void setHeadercolor(Color headercolor) {
        this.headercolor = headercolor;
        System.out.println(headercolor);
        
        getTableHeader().setDefaultRenderer(new DefaultHeaderRenderer(headercolor, Color.white));
    }
    
    public Ktable() {
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultHeaderRenderer());
        setColumnModel(new CustomDefaultTableColumnModel());
        setFont(new Font("Century Gothic", Font.PLAIN, 14)); 
        setRowHeight(22);
        setFocusable(false);
        
        /*
            Altera o cabeçalho da Jtable ao receber o foco
        */    

//     FocusListener focusListener = new FocusAdapter() {
//
//            @Override
//            public void focusGained(FocusEvent fe) {
//                getTableHeader().setDefaultRenderer(new DefaultHeaderRenderer(new Color(51,67,80), new Color(77,202,121)));
//                
//                updateUI();
//            }
//            
//            @Override
//            public void focusLost(FocusEvent fe) {
//                getTableHeader().setDefaultRenderer(new DefaultHeaderRenderer(Color.DARK_GRAY, Color.WHITE));
////              
//////                http://www.guj.com.br/t/jtable-refresh-repaint-rows/230361/2
//               updateUI();
//            }
//        };
//        this.addFocusListener(focusListener);
    }
    
    
    @Override
    public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend)
    {
        AWTEvent currentEvent = EventQueue.getCurrentEvent();
        if (currentEvent instanceof KeyEvent)
        {
            KeyEvent keyEvent = (KeyEvent) currentEvent;
        }
        
        super.changeSelection(rowIndex, getColumnCount()-1, toggle, extend);
    }
}
