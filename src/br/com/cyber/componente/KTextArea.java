/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente;

import java.awt.Color;
import java.awt.Cursor;
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
        setCursor(new Cursor(Cursor.HAND_CURSOR));
//        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      //  setCursor(Cursor.getDefaultCursor());  //https://stackoverflow.com/questions/9073687/wait-cursor-and-disable-java-application

        setFocusable(true);
        setOpaque(true);
        setLineWrap(true);
        setWrapStyleWord(true);
        setMargin(new Insets(1, 1, 1, 1));
 
        getHighlighter().removeAllHighlights();
        setHighlighter(null);

        FocusListener focusListener = new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent fe) {
                setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
            }

            @Override
            public void focusLost(FocusEvent fe) {
//                setBackground(back);
                setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
            }
        };
        this.addFocusListener(focusListener);
    }
}
