/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Fonts: https://stackoverflow.com/questions/8305460/java-swing-jtextfield-inset
 */

package br.com.cyber.componente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

/**
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */

public class KPasswordField extends JPasswordField {

    public boolean k_alert_change_text = false;
    
    public boolean auto_space_proccess = true;
    
    public boolean k_obrigatory = false;
    
    public Integer maxlength = 100;

    String k_placeholder_text = "";
    
    public boolean k_enter_imitate_tab = false;
    
    Color k_placeholder_text_color = new Color(175, 175, 175);
    
    Color k_bord_color_change_text = new Color(249,182,81);
    Color k_back_color_change_text = new Color(254,246,189);
    
    Color k_back_color = Color.white;
    Color k_bord_color = new Color(175,175,175);
    
    Color k_back_focus_gained = new Color(163, 237, 159);
    Color k_back_focus_lost   = Color.white;
    
    Color k_bord_focus_gained = new Color (110,186,106);
    Color k_bord_focus_lost   = new Color(175,175,175);
    
    Color k_bord_error = new Color(238,120,120);
    Color k_back_error = new Color(253,198,198);
      
    public boolean isAuto_space_proccess() {
        return auto_space_proccess;
    }

    public void setAuto_space_proccess(boolean auto_space_proccess) {
        this.auto_space_proccess = auto_space_proccess;
    }

    public boolean getK_obrigatory() {
        return k_obrigatory;
    }
    
    public void setK_obrigatory(boolean k_obrigatory) {
        this.k_obrigatory = k_obrigatory;

        if (k_obrigatory == true) 
        {
            setBackground(k_back_error);
        
            final Border empty = new EmptyBorder(0, 6, 0, 6);
        
            setMargin(new Insets(30, 30, 30, 30));
            
            Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_error), empty);
            setBorder(border);
        }
    }

    public String getK_placeholder_text() {
        return k_placeholder_text;
    }

    public void setK_placeholder_text(String k_placeholder_text) {
        this.k_placeholder_text = k_placeholder_text;
    }

    public Color getK_placeholder_text_color() {
        return k_placeholder_text_color;
    }

    public void setK_placeholder_text_color(Color k_placeholder_text_color) {
        this.k_placeholder_text_color = k_placeholder_text_color;
    }
    
    public void setK_alert_change_text(boolean k_alert_change_text) {
        this.k_alert_change_text = k_alert_change_text;
    }

    public Color getK_alert_color_change_text() {
        return k_bord_color_change_text;
    }

    public void setK_alert_color_change_text(Color k_alert_color_change_text) {
        this.k_bord_color_change_text = k_alert_color_change_text;
    }

    public Color getK_bord_color_change_text() {
        return k_bord_color_change_text;
    }

    public void setK_bord_color_change_text(Color k_bord_color_change_text) {
        this.k_bord_color_change_text = k_bord_color_change_text;
    }

    public Color getK_back_color_change_text() {
        return k_back_color_change_text;
    }

    public void setK_back_color_change_text(Color k_back_color_change_text) {
        this.k_back_color_change_text = k_back_color_change_text;
    }
    
    public Color getK_back_color() {
        return k_back_color;
    }

    public void setK_back_color(Color k_back_color) {
        this.k_back_color = k_back_color;
        setBackground(k_back_color);
    }

    public Color getK_bord_color() {
        return k_bord_color;
    }

    public void setK_bord_color(Color k_bord_color) {
        this.k_bord_color = k_bord_color;
  
        final Border empty = new EmptyBorder(0, 6, 0, 6);
        setMargin(new Insets(30, 30, 30, 30));
        Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_color), empty);
        setBorder(border);
    }

    public Color getK_back_focus_gained() {
        return k_back_focus_gained;
    }

    public void setK_back_focus_gained(Color k_back_focus_gained) {
        this.k_back_focus_gained = k_back_focus_gained;
    }

    public Color getK_back_focus_lost() {
        return k_back_focus_lost;
    }

    public void setK_back_focus_lost(Color k_back_focus_lost) {
        this.k_back_focus_lost = k_back_focus_lost;
    }

    public Color getK_bord_focus_gained() {
        return k_bord_focus_gained;
    }

    public void setK_bord_focus_gained(Color k_bord_focus_gained) {
        this.k_bord_focus_gained = k_bord_focus_gained;
    }

    public Color getK_bord_focus_lost() {
        return k_bord_focus_lost;
    }

    public void setK_bord_focus_lost(Color k_bord_focus_lost) {
        this.k_bord_focus_lost = k_bord_focus_lost;
    }

    public Color getK_bord_error() {
        return k_bord_error;
    }

    public void setK_bord_error(Color k_bord_error) {
        this.k_bord_error = k_bord_error;
    }

    public Color getK_back_error() {
        return k_back_error;
    }

    public void setK_back_error(Color k_back_error) {
        this.k_back_error = k_back_error;
    }
    
    public Integer getMaxlength() {
        return maxlength;
    }

    public void setMaxlength(Integer maxlength) {
        this.maxlength = maxlength;
    }
    
    public boolean isK_enter_imitate_tab() {
        return k_enter_imitate_tab;
    }

    public void setK_enter_imitate_tab(boolean k_enter_imitate_tab) {
        this.k_enter_imitate_tab = k_enter_imitate_tab;
    }
    
    public static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    
    private Boolean text_changed = false;
       
    public KPasswordField() {
        
        setBackground(k_back_color);
        
        setBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_color));
        setPreferredSize(new Dimension(100, 35));
        
        final Border empty = new EmptyBorder(0, 6, 0, 6);
        
        setMargin(new Insets(30, 30, 30, 30));
        Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_color), empty);
        setBorder(border);
        
        FocusListener focuslistener = new FocusListener() {
            
            @Override
            public void focusGained(FocusEvent fe) {
                setBackground(k_back_focus_gained);
                Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_focus_gained), empty);
                setBorder(border);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (!k_alert_change_text == true || (k_alert_change_text == true && !text_changed == true)) {
                    
                    setBackground(k_back_focus_lost);
                    Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_focus_lost), empty);
                    
                    setBorder(border);
                }
                
                if (k_alert_change_text == true && text_changed == true) {
                    setBackground(k_back_color_change_text);
                    Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_color_change_text), empty);

                    setBorder(border);
                }
                
                if (k_obrigatory == true) {
                    
                    String dados = getText();
                    
                    if (dados.isEmpty()) {
                        setBackground(k_back_error);
                        Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_error), empty);
                        setBorder(border);
                    }
                }
                
                if (auto_space_proccess == true) {
                    String text = getText();
                    text = text.trim();
                    text = text.replaceAll("\\s+"," ");
        
                    setText(text);
                }
            }
        };
        
        
        this.addFocusListener(focuslistener);
        
        KeyListener keylistener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) { }

            @Override
            public void keyPressed(KeyEvent ke) 
            {
                if (isK_enter_imitate_tab() && ke.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
                    manager.focusNextComponent();
                }
                
                if (k_alert_change_text == true) {
                    text_changed = true;
                    setBackground(k_back_color_change_text);
                    Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_color_change_text), empty);
                    
                    setBorder(border);
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) { }
        };
        this.addKeyListener(keylistener);
    }
    
    @Override
    protected void paintComponent(Graphics pG) {
        super.paintComponent(pG);

        if (k_placeholder_text.length() == 0 || getText().length() > 0) {
            return;
        }

        final Graphics2D g = (Graphics2D) pG;
        g.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        
        if (k_placeholder_text_color != null) {
            g.setColor(k_placeholder_text_color);
        } else {
            g.setColor(getDisabledTextColor());
        }

        //https://stackoverflow.com/a/1055865
        // Center text horizontally and vertically
        int y = (this.getHeight() - pG.getFontMetrics().getHeight()) / 2  + pG.getFontMetrics().getAscent();
        // y = altura textfield - altura da fonte / 2 

        g.drawString(k_placeholder_text, getInsets().left, y);
    }
}
