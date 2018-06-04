package br.com.cyber.componente;
import br.com.cyber.componente.code.CustomUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.plaf.FontUIResource;

/**
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */

public class KComboBox extends JComboBox {

    private boolean toggle = true;
    
    private Color a_bord_color = new Color(175,175,175);
    
    public static Color a_popup_bord_color = new Color(175,175,175);
    
    public static Color a_arrow_color = new Color(150,150,150);
    
    public static Color a_arrow_back_color = Color.WHITE;
    
    public static Color a_arrow_color_focus = new Color(150,150,150);
    
    public static Color a_arrow_back_color_focus = Color.WHITE;

    public static Color a_list_back_color = Color.WHITE;
    
    public static Color a_item_set_back = Color.WHITE;
    
    public static Color a_item_set_text_color = Color.BLACK;
    
    public static Color a_item_list_selected_back_color = new Color(242,241,240);
    
    public static Color a_item_list_selected_text_color = new Color(70,70,70);
    
    public static Color a_list_unselected_text_color = new Color(70,70,70);

    public static ThemeOption theme = ThemeOption.DEFAULT;
    
    public enum ThemeOption {
        DEFAULT(1), 
        NIGHT(2);

        private final int value;
        
        ThemeOption(int valorOpcao){
            value = valorOpcao;
        }
        
        public int getValue(){
            return value;
        }
    }

    public ThemeOption getTheme() {
        return theme;
    }
    
    public void setTheme(ThemeOption theme) {
        this.theme = theme;  
    }

    public Color getA_bord_color() {
        return a_bord_color;
    }
            
    public void setA_bord_color(Color a_bord_color) {
        this.a_bord_color = a_bord_color;
        setBorder(BorderFactory.createLineBorder(a_bord_color, 1));
    }
    
    public Color getA_popup_bord_color() {
        return a_popup_bord_color;
    }
    
    public void setA_popup_bord_color(Color a_popup_bord_color) {
        this.a_popup_bord_color = a_popup_bord_color;
        setUI(CustomUI.createUI(this, 
            this.a_popup_bord_color, 
            a_arrow_color, 
            a_arrow_back_color,
            a_list_back_color,
            a_item_set_back,
            a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            a_list_unselected_text_color));   
    }
            
    public Color getA_arrow_color() {
        return a_arrow_color;
    }

    public void setA_arrow_color(Color a_arrow_color) {
        this.a_arrow_color = a_arrow_color;
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            this.a_arrow_color, 
            a_arrow_back_color,
            a_list_back_color,
            a_item_set_back,
            a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            a_list_unselected_text_color));   
    }

    public Color getA_arrow_back_color() {
        return a_arrow_back_color;
    }
            
    public void setA_arrow_back_color(Color a_arrow_back_color) {
        this.a_arrow_back_color = a_arrow_back_color;
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            a_arrow_color, 
            this.a_arrow_back_color,
            a_list_back_color,
            a_item_set_back,
            a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            a_list_unselected_text_color));   
    }

    public Color getA_arrow_color_focus() {
        return a_arrow_color_focus;
    }

    public void setA_arrow_color_focus(Color a_arrow_color_focus) {
        this.a_arrow_color_focus = a_arrow_color_focus;
    }

    public Color getA_arrow_back_color_focus() {
        return a_arrow_back_color_focus;
    }

    public void setA_arrow_back_color_focus(Color a_arrow_back_color_focus) {
        this.a_arrow_back_color_focus = a_arrow_back_color_focus;
    }

    public Color getA_list_back_color() {
        return a_list_back_color;
    }

    public void setA_list_back_color(Color a_list_back_color) {
        this.a_list_back_color = a_list_back_color;
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            a_arrow_color, 
            a_arrow_back_color,
            this.a_list_back_color,
            a_item_set_back,
            a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            a_list_unselected_text_color));   
    }

    public Color getA_item_set_back() {
        return a_item_set_back;
    }

    public void setA_item_set_back(Color a_item_set_back) {
        this.a_item_set_back = a_item_set_back;
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            a_arrow_color, 
            a_arrow_back_color,
            a_list_back_color,
            this.a_item_set_back,
            a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            a_list_unselected_text_color));   
    }

    public Color getA_item_set_text_color() {
        return a_item_set_text_color;
    }

    public void setA_item_set_text_color(Color a_item_set_text_color) {
        this.a_item_set_text_color = a_item_set_text_color;
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            a_arrow_color, 
            a_arrow_back_color,
            a_list_back_color,
            a_item_set_back,
            a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            a_list_unselected_text_color));
        
        setBackground(a_item_set_text_color);
    }

    public Color getA_item_list_selected_back_color() {
        return a_item_list_selected_back_color;
    }

    public void setA_item_list_selected_back_color(Color a_item_list_selected_back_color) {
        this.a_item_list_selected_back_color = a_item_list_selected_back_color;
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            a_arrow_color, 
            a_arrow_back_color,
            a_list_back_color,
            a_item_set_back,
            this.a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            a_list_unselected_text_color));   
    }

    public Color getA_item_list_selected_text_color() {
        return a_item_list_selected_text_color;
    }

    public void setA_item_list_selected_text_color(Color a_item_list_selected_text_color) {
        this.a_item_list_selected_text_color = a_item_list_selected_text_color;
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            a_arrow_color, 
            a_arrow_back_color,
            a_list_back_color,
            a_item_set_back,
            a_item_list_selected_back_color,
            this.a_item_list_selected_text_color,
            a_list_unselected_text_color));   
    }

    public Color getA_list_unselected_text_color() {
        return a_list_unselected_text_color;
    }

    public void setA_list_unselected_text_color(Color a_list_unselected_text_color) {
        this.a_list_unselected_text_color = a_list_unselected_text_color;
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            a_arrow_color, 
            a_arrow_back_color,
            a_list_back_color,
            a_item_set_back,
            a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            this.a_list_unselected_text_color));   
    }
    
    public KComboBox()
    {
        Dimension dimension = new Dimension(200,34);
        setPreferredSize(dimension);
        
        getEditor().getEditorComponent().setBackground(Color.YELLOW);
        
        setFont(new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        
        setModel(new DefaultComboBoxModel(
                        new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBorder(BorderFactory.createLineBorder(a_bord_color, 1));
        setUI(CustomUI.createUI(this, 
            a_popup_bord_color, 
            a_arrow_color, 
            a_arrow_back_color,
            a_list_back_color,
            a_item_set_back,
            a_item_list_selected_back_color,
            a_item_list_selected_text_color,
            a_list_unselected_text_color));                
        setVisible(true);
        
        setBackground(a_item_set_back);
        setForeground(a_item_set_text_color);

        FocusListener focusListener = new FocusAdapter() {
            
            @Override
            public void focusGained(FocusEvent fe) {

                showPopup(); 
            }
            
            @Override
            public void focusLost(FocusEvent fe) { }
        };
        this.addFocusListener(focusListener);
        
        
//        /*
//            Reconhecer key no combobox
//        
//            https://stackoverflow.com/questions/14056301/java-editable-jcombobox-keylistener-event-for-enter-key
//        */
//        getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
//
//            @Override
//            public void keyReleased(KeyEvent event) {
////                if (event.getKeyChar() == KeyEvent.VK_ENTER) {
////                    if (((JTextComponent) ((JComboBox) ((Component) event
////                            .getSource()).getParent()).getEditor()
////                            .getEditorComponent()).getText().isEmpty())
//                        System.out.println("please dont make me blank");
//                        
//                        showPopup();
////                }
//            }
//        });
    }
  
    
    @Override
    public void setEnabled(boolean toggle) {
        this.toggle = toggle;
        if (toggle == false) {

            setUI(CustomUI.createUI(this,
                a_popup_bord_color, 
                a_arrow_color, 
                a_arrow_back_color,
                a_list_back_color,
                a_item_set_back,
                a_item_list_selected_back_color,
                a_item_list_selected_text_color,
                a_list_unselected_text_color)); 
        } else {

            setUI(CustomUI.createUI(this,
                a_popup_bord_color, 
                a_arrow_color, 
                a_arrow_back_color,
                a_list_back_color,
                a_item_set_back,
                a_item_list_selected_back_color,
                a_item_list_selected_text_color,
                a_list_unselected_text_color));       
        }
    }
    
    @Override
    public boolean isEnabled() {
        return toggle;
    }
}