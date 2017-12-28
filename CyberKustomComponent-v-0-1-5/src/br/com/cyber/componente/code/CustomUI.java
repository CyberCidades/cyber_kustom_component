package br.com.cyber.componente.code;
import br.com.cyber.componente.KComboBox;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

/**
 * Created from
 * @web http://www.jc-mouse.net/
 * @author Mouse
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 * 
 */
public class CustomUI extends BasicComboBoxUI{
        
    private Color popup_border;
    
    private Color arrow_color;
    
    private Color arrow_back_color;
    
    private Color list_back_color;
    
    private Color item_set_back;
    
    private Color item_list_selected_back_color;
    
    private Color item_list_selected_text_color;
    
    private Color list_unselected_text_color;
    
    
    public static ComboBoxUI createUI(
            JComponent c, 
            Color popup_border, 
            Color arrow_color,
            Color arrow_back_color,
            Color list_back_color,
            Color item_set_back,
            Color item_list_selected_back_color,
            Color item_list_selected_text_color,
            Color list_unselected_text_color) 
    {
        return new CustomUI(
                popup_border, 
                arrow_color, 
                arrow_back_color,
                list_back_color,
                item_set_back,
                item_list_selected_back_color,
                item_list_selected_text_color,
                list_unselected_text_color);
    }

    public CustomUI(Color popup_border,
            Color arrow_color,
            Color arrow_back_color, 
            Color list_back_color,
            Color item_set_back,
            Color item_list_selected_back_color,
            Color item_list_selected_text_color,
            Color list_unselected_text_color) {
        this.popup_border = popup_border;
        this.arrow_color = arrow_color;
        this.arrow_back_color = arrow_back_color;
        this.list_back_color = list_back_color;
        this.item_set_back = item_set_back;
        this.item_list_selected_back_color = item_list_selected_back_color;
        this.item_list_selected_text_color = item_list_selected_text_color;
        this.list_unselected_text_color = list_unselected_text_color;
    }


    @Override
    protected ComboPopup createPopup() {
        BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
        basicComboPopup.setBorder(BorderFactory.createLineBorder(popup_border, 1));
        return basicComboPopup;
    }
    
    @Override 
    protected JButton createArrowButton() {     
        
        BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                arrow_back_color, //Color de fondo
                null,//sombra
                arrow_color,//darkShadow
                null //highlight
                ); 
        
        basicArrowButton.setBorder(BorderFactory.createLineBorder(arrow_back_color, 6));
        basicArrowButton.setContentAreaFilled(false);   
        return basicArrowButton;
    }        

    
    @Override
    public void paintCurrentValueBackground(Graphics g,
                                            Rectangle bounds,
                                            boolean hasFocus)
    {
        g.setColor(KComboBox.a_item_set_back);    
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
      
    //Pinta los items
    @Override
    protected ListCellRenderer createRenderer()
    {
        return new DefaultListCellRenderer() {      
            
        @Override
        public Component getListCellRendererComponent(JList list,Object value,int index,
            boolean isSelected,boolean cellHasFocus) 
            {
                super.getListCellRendererComponent(list,value,index,isSelected,cellHasFocus);
                list.setSelectionBackground(item_set_back);
                setFont(new Font("Century Gothic", Font.PLAIN, 14));
                if (isSelected)
                {
                    setBackground(KComboBox.a_item_list_selected_back_color);
                    setForeground(KComboBox.a_item_list_selected_text_color);
                }
                else
                {
                    setBackground(KComboBox.a_list_back_color);            
                    setForeground(KComboBox.a_list_unselected_text_color);
                }
                if (index!=-1) {    
                    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                }
                return this;
            }
        };
    }
}
