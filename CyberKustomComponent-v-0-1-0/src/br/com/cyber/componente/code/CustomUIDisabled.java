package br.com.cyber.componente.code;
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
 * @web http://www.jc-mouse.net/
 * @author Mouse
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class CustomUIDisabled extends BasicComboBoxUI{
    
    private Color red = new Color(216,216,216);
    
    public static ComboBoxUI createUI(JComponent c) {
        return new CustomUIDisabled();
    }
    
    @Override
    protected ComboPopup createPopup() {
        BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
        basicComboPopup.setBorder(BorderFactory.createLineBorder(new Color(220,220,220), 1));
        return basicComboPopup;
    }
    
    @Override 
    protected JButton createArrowButton() {     
        
        BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                red, //Color de fondo
                new Color(150,150,150),//sombra [150,150,150]
                new Color(150,150,150),//darkShadow
                null //highlight
                ); 
        
        basicArrowButton.setBorder(BorderFactory.createLineBorder(red, 6));
        basicArrowButton.setContentAreaFilled(false);   
        return basicArrowButton;
    }        

    //Se puede usar un JButton para usar un icono personalizado en lugar del arrow
    /*
    @Override 
    protected JButton createArrowButton() {                 
        JButton button = new JButton();        
        //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
        button.setText("");
        button.setBorder(BorderFactory.createLineBorder(red,2));
        button.setContentAreaFilled(false);
        button.setIcon( new ImageIcon(getClass().getResource("/org/bolivia/res/estrella.png")) );
        return button;
    } 
    */
    
    @Override
    public void paintCurrentValueBackground(Graphics g,
                               Rectangle bounds,
                               boolean hasFocus)
    {
        g.setColor(red);      
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
      
    //Pinta los items
    @Override
    protected ListCellRenderer createRenderer()
    {
        return new DefaultListCellRenderer() {      
            
        @Override
        public Component getListCellRendererComponent(JList list,Object value,int index,
            boolean isSelected,boolean cellHasFocus) {
      
            super.getListCellRendererComponent(list,value,index,isSelected,cellHasFocus);
            list.setSelectionBackground(red);
            setFont(new Font("Century Gothic", Font.PLAIN, 14));
            if (isSelected)
            {
                setBackground(new Color(242,241,240));
                setForeground(new Color(70,70,70));
            }
            else
            {
                setBackground(Color.WHITE );            
                setForeground(new Color(70,70,70));
            }
            if (index!=-1) {    
                setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            }
                return this;
            }
        };
    }
}
