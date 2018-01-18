/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.KeyboardFocusManager;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class KTextFieldLogin extends JTextField {

    String _k_placeholder_text = "";
    
    Color _k_placeholder_text_color = new Color(175, 175, 175);
    
    public boolean k_block_white_space = false;  


    public String getK_placeholder_text() {
        return _k_placeholder_text;
    }

    public void setK_placeholder_text(String _k_placeholder_text) {
        this._k_placeholder_text = _k_placeholder_text;
    }

    public Color getK_placeholder_text_color() {
        return _k_placeholder_text_color;
    }

    public void setK_placeholder_text_color(Color _k_placeholder_text_color) {
        this._k_placeholder_text_color = _k_placeholder_text_color;
    }
    
    public boolean K_block_white_space() {
        return k_block_white_space;
    }

    public void setK_block_white_space(boolean k_block_white_space) {
        // SimpleSpaceDocumentFilter.blockwhitespace = k_block_white_space;
        
 
        this.k_block_white_space = k_block_white_space;
        
        DocumentFilter filter = new br.com.cyber.componente.DocumentFilters(false, k_block_white_space);
        ((AbstractDocument) getDocument()).setDocumentFilter(filter);
    }
    
    public KTextFieldLogin() {
    }
    
    @Override
    protected void paintComponent(Graphics pG) {
        super.paintComponent(pG);

        if (_k_placeholder_text.length() == 0 || getText().length() > 0) {
            return;
        }
        
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
            }

            @Override
            public void keyReleased(KeyEvent ke) { }
        };
        this.addKeyListener(keylistener);

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
    
    // https://stackoverflow.com/questions/11571779/java-force-jtextfield-to-be-uppercase-only
class SimpleSpaceDocumentFilter extends DocumentFilter {

    public boolean uppercase = false;
    
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
                fb.replace(offset, length, text, attrs);
            }
        } else {
            fb.replace(offset, length, text, attrs);
        }
    }
}

}

