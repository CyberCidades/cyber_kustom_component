/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;

/**
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class KTextArea extends JTextArea { 

    public KTextArea() {
        setPreferredSize(new Dimension(100, 34));
        setFont(new Font("Century Gothic", Font.PLAIN, 16)); 
        setFocusable(true);
        setOpaque(true);
        setLineWrap(true);
        setWrapStyleWord(true);
        setMargin(new Insets(1, 1, 1, 1));

        FocusListener focusListener = new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent fe) {
                setBackground(new Color(163,237,159));
                setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
            }

            @Override
            public void focusLost(FocusEvent fe) {
                setBackground(Color.WHITE);
                setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
            }
        };
        this.addFocusListener(focusListener);
    }
}
