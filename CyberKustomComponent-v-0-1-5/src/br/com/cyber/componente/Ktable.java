
package br.com.cyber.componente;

import br.com.cyber.componente.code.CustomDefaultTableColumnModel;
import br.com.cyber.componente.code.DefaultHeaderRenderer;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

/**
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class Ktable extends JTable  {

    DefaultHeaderRenderer df1 = new DefaultHeaderRenderer(new Color(51,67,80), new Color(77,202,121));
            
    DefaultHeaderRenderer df2 = new DefaultHeaderRenderer(Color.DARK_GRAY, Color.WHITE);

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
        getTableHeader().setDefaultRenderer(new DefaultHeaderRenderer(headercolor, Color.white));
    }
    
    public Ktable() {
        getTableHeader().setReorderingAllowed(false);
//        getTableHeader().setDefaultRenderer(new DefaultHeaderRenderer());
        setColumnModel(new CustomDefaultTableColumnModel());
        setFont(new Font("Century Gothic", Font.PLAIN, 14)); 
        setRowHeight(22);

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // para pintar o canto superior direito da header da jtable
                // https://stackoverflow.com/a/22547423
                // https://stackoverflow.com/a/22041538
                JScrollPane enclosingScrollPane = (JScrollPane) getParent().getParent();
    
                JPanel right = new JPanel();
                right.setBorder(BorderFactory.createEmptyBorder());
                right.setBackground(headercolor);
                enclosingScrollPane.setCorner(ScrollPaneConstants.UPPER_RIGHT_CORNER, right);
            }
        });
        
        /*
            Altera o cabeçalho da Jtable ao receber o foco
        */    

        FocusListener focusListener = new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent fe) {
                getTableHeader().setDefaultRenderer(df1);
            }

            @Override
            public void focusLost(FocusEvent fe) {
               getTableHeader().setDefaultRenderer(df2);
            }
        };
        this.addFocusListener(focusListener);
    }
}
