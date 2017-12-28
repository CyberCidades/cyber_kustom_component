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
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */

public class KTextField extends JTextField {

    public boolean _k_alert_change_text = false;
    
    public boolean _k_auto_space_proccess = true;
    
    public boolean _k_obrigatory = false;
    
    public boolean k_uppercase = false;
    
    public boolean k_block_white_space = false;  
    
    String _k_placeholder_text = "";
    
    Color _k_placeholder_text_color = new Color(175, 175, 175);
    Color _k_bord_color_change_text = new Color(249,182,81);
    Color _k_back_color_change_text = new Color(254,246,189);
    
    Color _k_back_color = Color.white;
    Color _k_bord_color = new Color(175,175,175);
    
    Color _k_back_focus_gained = new Color(163, 237, 159);
    Color _k_back_focus_lost   = Color.white;
    
    Color _k_bord_focus_gained = new Color (110,186,106);
    Color _k_bord_focus_lost   = new Color(175,175,175);
    
    Color _k_bord_error = new Color(238,120,120);
    Color _k_back_error = new Color(253,198,198);
    
    
    public boolean isAuto_space_proccess() {
        return _k_auto_space_proccess;
    }

    public void setAuto_space_proccess(boolean k_auto_space_proccess) {
        this._k_auto_space_proccess = k_auto_space_proccess;
    }

    public boolean getK_obrigatory() {
        return _k_obrigatory;
    }

    public void setK_obrigatory(boolean k_obrigatory) {
        this._k_obrigatory = k_obrigatory;

        if (k_obrigatory == true && getText().isEmpty()) 
        {
            setBackground(_k_back_error);
        
            final Border empty = new EmptyBorder(0, 6, 0, 6);
        
            setMargin(new Insets(30, 30, 30, 30));
            
            Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, _k_bord_error), empty);
            setBorder(border);
        }
    }

    public boolean K_uppercase() {
        return k_uppercase;
    }

    public void setK_uppercase(boolean k_uppercase) {
        System.out.println("k block white space: "+k_block_white_space);
        DocumentFilter filter = new SimpleSpaceDocumentFilter(k_uppercase, k_block_white_space);
        ((AbstractDocument) getDocument()).setDocumentFilter(filter);
    }

    public boolean K_block_white_space() {
        return k_block_white_space;
    }

    public void setK_block_white_space(boolean k_block_white_space) {
        System.out.println("k block white space: "+k_block_white_space);
        DocumentFilter filter = new SimpleSpaceDocumentFilter(k_uppercase, k_block_white_space);
        ((AbstractDocument) getDocument()).setDocumentFilter(filter);
    }
  
    public String getK_placeholder_text() {
        return _k_placeholder_text;
    }

    public void setK_placeholder_text(String k_placeholder_text) {
        this._k_placeholder_text = k_placeholder_text;
    }

    public Color getK_placeholder_text_color() {
        return _k_placeholder_text_color;
    }

    public void setK_placeholder_text_color(Color k_placeholder_text_color) {
        this._k_placeholder_text_color = k_placeholder_text_color;
    }
    
    public void setK_alert_change_text(boolean k_alert_change_text) {
        this._k_alert_change_text = k_alert_change_text;
    }

    public Color getK_alert_color_change_text() {
        return _k_bord_color_change_text;
    }

    public void setK_alert_color_change_text(Color k_alert_color_change_text) {
        this._k_bord_color_change_text = k_alert_color_change_text;
    }

    public Color getK_bord_color_change_text() {
        return _k_bord_color_change_text;
    }

    public void setK_bord_color_change_text(Color k_bord_color_change_text) {
        this._k_bord_color_change_text = k_bord_color_change_text;
    }

    public Color getK_back_color_change_text() {
        return _k_back_color_change_text;
    }

    public void setK_back_color_change_text(Color k_back_color_change_text) {
        this._k_back_color_change_text = k_back_color_change_text;
    }
    
    public Color getK_back_color() {
        return _k_back_color;
    }

    public void setK_back_color(Color k_back_color) {
        this._k_back_color = k_back_color;
        setBackground(k_back_color);
    }

    public Color getK_bord_color() {
        return _k_bord_color;
    }

    public void setK_bord_color(Color k_bord_color) {
        this._k_bord_color = k_bord_color;
  
        final Border empty = new EmptyBorder(0, 6, 0, 6);
        setMargin(new Insets(30, 30, 30, 30));
        Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, k_bord_color), empty);
        setBorder(border);
    }

    public Color getK_back_focus_gained() {
        return _k_back_focus_gained;
    }

    public void setK_back_focus_gained(Color k_back_focus_gained) {
        this._k_back_focus_gained = k_back_focus_gained;
    }

    public Color getK_back_focus_lost() {
        return _k_back_focus_lost;
    }

    public void setK_back_focus_lost(Color k_back_focus_lost) {
        this._k_back_focus_lost = k_back_focus_lost;
    }

    public Color getK_bord_focus_gained() {
        return _k_bord_focus_gained;
    }

    public void setK_bord_focus_gained(Color k_bord_focus_gained) {
        this._k_bord_focus_gained = k_bord_focus_gained;
    }

    public Color getK_bord_focus_lost() {
        return _k_bord_focus_lost;
    }

    public void setK_bord_focus_lost(Color k_bord_focus_lost) {
        this._k_bord_focus_lost = k_bord_focus_lost;
    }

    public Color getK_bord_error() {
        return _k_bord_error;
    }

    public void setK_bord_error(Color k_bord_error) {
        this._k_bord_error = k_bord_error;
    }

    public Color getK_back_error() {
        return _k_back_error;
    }

    public void setK_back_error(Color k_back_error) {
        this._k_back_error = k_back_error;
    }
    
    public static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private Boolean text_changed = false;
       
    public KTextField() {
        
        setBackground(_k_back_color);
        
        setBorder(BorderFactory.createEtchedBorder(1, Color.white, _k_bord_color));
        setPreferredSize(new Dimension(100, 35));
        
        final Border empty = new EmptyBorder(0, 6, 0, 6);
        
        setMargin(new Insets(30, 30, 30, 30));
        Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, _k_bord_color), empty);
        setBorder(border);
       
        
        FocusListener focuslistener = new FocusListener() {
            
            @Override
            public void focusGained(FocusEvent fe) {
                setBackground(_k_back_focus_gained);
                Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, _k_bord_focus_gained), empty);
                setBorder(border);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (!_k_alert_change_text == true || (_k_alert_change_text == true && !text_changed == true)) {
                    setBackground(_k_back_focus_lost);
                    Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, _k_bord_focus_lost), empty);
                    
                    setBorder(border);
                }
                
                if (_k_alert_change_text == true && text_changed == true) {
                    setBackground(_k_back_color_change_text);
                    Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, _k_bord_color_change_text), empty);

                    setBorder(border);
                }
                
                if (_k_obrigatory == true) {
                    String dados = getText();
                    
                    if (dados.isEmpty()) {
                        setBackground(_k_back_error);
                        Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, _k_bord_error), empty);
                        setBorder(border);
                    }
                }
                System.out.println("o k auto space é: "+_k_auto_space_proccess);
                if (_k_auto_space_proccess == true) {
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
                if (ke.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
                    manager.focusNextComponent();
                }
                
                if (_k_alert_change_text == true) {
                    text_changed = true;
                    setBackground(_k_back_color_change_text);
                    Border border = new CompoundBorder(BorderFactory.createEtchedBorder(1, Color.white, _k_bord_color_change_text), empty);
                    
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

        if (_k_placeholder_text.length() == 0 || getText().length() > 0) {
            return;
        }

        final Graphics2D g = (Graphics2D) pG;
        g.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        
        if (_k_placeholder_text_color != null) {
            g.setColor(_k_placeholder_text_color);
        } else {
            g.setColor(getDisabledTextColor());
        }

        //https://stackoverflow.com/a/1055865
        // Center text horizontally and vertically
        int y = (this.getHeight() - pG.getFontMetrics().getHeight()) / 2  + pG.getFontMetrics().getAscent();
        // y = altura textfield - altura da fonte / 2 

        g.drawString(_k_placeholder_text, getInsets().left, y);
    }
}

// https://stackoverflow.com/questions/11571779/java-force-jtextfield-to-be-uppercase-only
class UppercaseDocumentFilter extends DocumentFilter {
    
    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset,
            String text, AttributeSet attr) throws BadLocationException {

        fb.insertString(offset, text.toUpperCase(), attr);
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length,
        String text, AttributeSet attrs) throws BadLocationException {

        fb.replace(offset, length, text.toUpperCase(), attrs);
    }
    
//    @Override
//    public void replace(FilterBypass fb, int i, int i1, String string, AttributeSet as) throws BadLocationException {
//        //we want standard behavior if we are not placing space at start of JTextField
//        //or if we are placing text at start of JTextField but first character is not whitespace
//        if ( i!=0 || ( i==0 && !Character.isWhitespace(string.charAt(0)) ) ){
//            super.replace(fb, i, i1, string, as);
//        }else{
//            System.out.println("no spaces allowed");
//        }
//    }
}

// https://stackoverflow.com/questions/11571779/java-force-jtextfield-to-be-uppercase-only
class SimpleSpaceDocumentFilter extends DocumentFilter {

    public boolean uppercase;
    
    public boolean blockwhitespace;

    public SimpleSpaceDocumentFilter(boolean uppercase, boolean blockwhitespace) {
        this.uppercase = uppercase;
        this.blockwhitespace = blockwhitespace;
    }

    
    public boolean isUppercase() {
        return uppercase;
    }

    public void setUppercase(boolean uppercase) {
        this.uppercase = uppercase;
    }

    public boolean isBlockwhitespace() {
        return blockwhitespace;
    }

    public void setBlockwhitespace(boolean blockwhitespace) {
        this.blockwhitespace = blockwhitespace;
    }
    
    
    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset,
            String text, AttributeSet attr) throws BadLocationException {

        if (uppercase) {
            text = text.toUpperCase();
        }
        
        fb.insertString(offset, text, attr);
    }
    
    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length,
        String text, AttributeSet attrs) throws BadLocationException {

        if (uppercase) {
            text = text.toUpperCase();
        }
        
        if (blockwhitespace) {
            if (!Character.isWhitespace(text.charAt(0))) {
                System.out.println("ou sou eu");
                fb.replace(offset, length, text, attrs);
            }
        } else {
            fb.replace(offset, length, text, attrs);
        }
    }
}