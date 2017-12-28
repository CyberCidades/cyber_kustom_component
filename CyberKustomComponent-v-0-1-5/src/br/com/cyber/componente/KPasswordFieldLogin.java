/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Fonts: https://stackoverflow.com/questions/8305460/java-swing-jtextfield-inset
 */

package br.com.cyber.componente;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPasswordField;


/**
 *
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class KPasswordFieldLogin extends JPasswordField {

    String _k_placeholder_text = "";
    
    Color _k_placeholder_text_color = new Color(175, 175, 175);
    

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
    
    public KPasswordFieldLogin() {
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