/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente.code;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class MinhaRender extends DefaultTableCellRenderer 
{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column)
    {

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if( table != null ) 
        {
            if ( isSelected ) {
               setFont(new Font("Century Gothic", Font.PLAIN, 15));

                table.getTableHeader().setBackground(new Color(239, 198, 46));
                table.getTableHeader().setForeground(Color.white);
            }
            else {
                
                table.getTableHeader().setBackground(new Color(239, 198, 46));
                table.getTableHeader().setForeground(Color.white);
            }
        }
        return null;
    }
}

