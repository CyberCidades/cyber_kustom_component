/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente.code;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 * 
 * @fontes http://www.codejava.net/java-se/swing/jtable-column-header-custom-renderer-examples
 */
public class DefaultHeaderRenderer extends JLabel implements TableCellRenderer {
    
    public DefaultHeaderRenderer() {
        setFont(new Font("Century Gothic", Font.PLAIN, 15));
        setOpaque(true);   
        setForeground(Color.WHITE);
        setBackground(Color.DARK_GRAY);
        setSize(new Dimension(120, 10));
        setPreferredSize(new Dimension(0, 30));
        
        Border border = getBorder();
        Border margin = new EmptyBorder(5,5,5,5);
        setBorder(new CompoundBorder(border, margin));
    }
    
    public DefaultHeaderRenderer(Color cor, Color forcor) {
        setFont(new Font("Century Gothic", Font.PLAIN, 15));
        setOpaque(true);
        setForeground(forcor);
        
        if (cor == null) {
            setBackground(cor);
        }else {
            setBackground(cor);
        }
        setSize(new Dimension(120, 10));
        setPreferredSize(new Dimension(0, 30));
        
        Border border = getBorder();
        Border margin = new EmptyBorder(5,5,5,5);
        setBorder(new CompoundBorder(border, margin));
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value.toString());
            
        return this;
    }
}
