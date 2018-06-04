/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente;

import br.com.cyber.kutil.URLBrowser;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class KLabel extends JLabel {

    private String link;
    private Image image;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
    public KLabel() {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (link != null && link != "") {
                    setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                }
            }
        });
        
        MouseListener mouselistener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { 
                
                if (link != null && link != "") {
                    URLBrowser.openURL(getLink());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
    
        this.addMouseListener(mouselistener);
    }
}
