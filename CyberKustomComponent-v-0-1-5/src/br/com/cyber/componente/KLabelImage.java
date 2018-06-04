/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cyber.componente;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @font https://stackoverflow.com/a/28226779
 */
public class KLabelImage extends JLabel{
    
    private Image image;

    public KLabelImage(String text){
        super(text);
    }

    @Override
    public void setIcon(Icon icon) {
        super.setIcon(icon);
        if (icon instanceof ImageIcon)
        {
            image = ((ImageIcon) icon).getImage();
        }
    }

    @Override
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
    }
}
