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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public final class KButton extends JButton{
    
    private Color corborda;
    
    public Color bk_focus_gained;
    
    private Color original_bk_color = null;
    
    private Color bk_focus_lost = null;
    
    public ThemeOption k_theme = ThemeOption.DEFAULT;
    
    private Color GREY = new Color(236,236,236);
    
    private Color DARK = new Color(29,29,29);
    
    public enum ThemeOption {    
        DEFAULT(1), 
        SUCCESS(2), 
        SUCCESS_ICON(3), 
        ERROR(4), 
        ERROR_ICON(5);

        private final int value;
        
        ThemeOption(int valorOpcao){
            value = valorOpcao;
        }
        
        public int getValue(){
            return value;
        }
    }

    public ThemeOption getTheme() {
        return k_theme;
    }

    public void setTheme(ThemeOption theme) {
        this.k_theme = theme;
        
        if (theme == ThemeOption.DEFAULT) {
            setBackground(GREY);
            setForeground(DARK);
        }
        
        if (theme == ThemeOption.SUCCESS) {
            setBackground(new Color(77,202,121));
            setForeground(Color.white);
            setIcon(null);
        }
        
        if (theme == ThemeOption.SUCCESS_ICON) {
            setBackground(GREY);
            setForeground(DARK);
            
            Icon icon = getIcon();
            
            if (icon != null) {
                setIcon(icon);
            } else {
                setIcon(new ImageIcon(getClass().getResource("/br/com/cyber/img/check-20.png")));
            }
        }
        
        if (theme == ThemeOption.ERROR) {
            setBackground(new Color(251,111,102));
            setForeground(Color.white);
            setIcon(null);
        }
        
        if (theme == ThemeOption.ERROR_ICON) {
            setBackground(GREY);
            setForeground(DARK);
            
            Icon icon = getIcon();
            
            if (icon != null) {
                setIcon(icon);
            } else {
                setIcon(new ImageIcon(getClass().getResource("/br/com/cyber/img/caution-20.png")));
            }
        }
    }
    
    public Color getCorborda() {
        return corborda;
    }
    
    int ultima;

    public void setCorborda(Color corborda) {
        if(corborda == null) {
            setBorder(BorderFactory.createLineBorder(corborda, 0));
        }
        setBorder(BorderFactory.createLineBorder(corborda, 1));
        this.corborda = corborda;
    }
    
    public Color getBk_focus_gained() {
        return bk_focus_gained;
    }

    public void setBk_focus_gained(Color bk_focus_gained) {
        this.bk_focus_gained = bk_focus_gained;
    }
    
    public Color getOriginal_bk_color() {
        return original_bk_color;
    }

    public void setOriginal_bk_color(Color original_bk_color) {
        this.original_bk_color = original_bk_color;
    }

    public Color getBk_focus_lost() {
        return bk_focus_lost;
    }

    public void setBk_focus_lost(Color bk_focus_lost) {
        this.bk_focus_lost = bk_focus_lost;
    }

    public KButton() {  
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                if (getBk_focus_gained() == null) {
                    setBk_focus_gained(getBackground());
                }

                if (getBk_focus_lost() == null) {
                    setBk_focus_lost(getBackground());
                }
            }
        });
        
        setPreferredSize(new Dimension(100, 34));
        setFont(new Font("Century Gothic", Font.PLAIN, 16)); 
        setCursor(new Cursor(Cursor.HAND_CURSOR));
      // setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      // setCursor(Cursor.getDefaultCursor());  //https://stackoverflow.com/questions/9073687/wait-cursor-and-disable-java-application
        setContentAreaFilled(false);
        setFocusable(true);
        setOpaque(true);
 
        KeyListener keylistener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) 
            {
                setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
            }
        };
        this.addKeyListener(keylistener);
     
        FocusListener focusListener = new FocusAdapter() {
        /*    variavel back pode ser usada pra controlar a cor do foco para o botão,
                    a ideia é fazer o get e set com o atributo cor_focus para adicionar
                            a cor na paleta */
//            Color back = null;
            @Override
            public void focusGained(FocusEvent fe) {
                setBorder(BorderFactory.createLineBorder(corborda, 1));
//                System.out.println("entrou no focus "+getName()+" com cor: "+bk_focus_gained);
//                setOriginal_bk_color(getBackground());
                setBackground(getBk_focus_gained());
            }

            @Override
            public void focusLost(FocusEvent fe) {
                setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
//                if (getBk_focus_lost() != null) {
                    setBackground(getBk_focus_lost());
//                }
            }
        };
        this.addFocusListener(focusListener);
       
        MouseListener mouseListener = new MouseAdapter()
        {
            @Override
            public void mouseEntered( MouseEvent e ) {}

            @Override
            public void mouseExited( MouseEvent e ) {}

            @Override
            public void mouseClicked( MouseEvent e ) {}

            @Override
            public void mousePressed( MouseEvent e ) {}

            @Override
            public void mouseReleased( MouseEvent e ) {
                setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
            }
        };
        this.addMouseListener( mouseListener );
    }  
}