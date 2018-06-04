/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente;

import java.awt.Font;
import java.awt.Color;
import java.awt.Paint;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.RenderingHints;
import java.awt.FontMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author Giovani L. Erthal
 * 
 */
public class KPanel extends JPanel {
    
    private Color textColor;
    private Color finalColor;
    private Color initialColor;
    private String caption;

    public KPanel() {
        this.setOpaque(false);
        this.setFont(new Font("Arial", Font.BOLD, 11));
        this.textColor = new Color(255, 255, 255);
        this.finalColor = new Color(110, 110, 110);
        this.initialColor = new Color(153, 153, 153);
    }

    public void setInitialColor(Color color) {
        this.initialColor = color;
        invalidate();
    }

    public void setFinalColor(Color color) {
        this.finalColor = color;
        invalidate();
    }

    public Color getInitialColor() {
        return initialColor;
    }

    public Color getFinalColor() {
        return finalColor;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String text) {
        this.caption = text;
        invalidate();
    }

    public void SetTextColor(Color color) {
        this.textColor = color;
        invalidate();
    }

    public Color getTextColor() {
        return textColor;
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        GradientPaint paint = new GradientPaint(
                new Point2D.Float(getWidth() / 2, 0), initialColor,
                new Point2D.Float(getWidth() / 2, getHeight()), finalColor);

        Paint oldPaint = g2d.getPaint();

        g2d.setPaint(paint);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        if (this.getCaption() != null && this.getCaption().isEmpty() == false) {

            Rectangle2D r = g2d.getFontMetrics().getStringBounds(this.getCaption(), g2d);

            Rectangle rect = new Rectangle(0, 0, this.getWidth(), this.getHeight());
            FontMetrics metrics = g.getFontMetrics(this.getFont());

            int x = rect.x + (rect.width - metrics.stringWidth(this.getCaption())) / 2;
            int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();

            g2d.setColor(this.getTextColor());
            g2d.drawString(this.getCaption(), x, y);
        }

        g2d.setPaint(oldPaint);

        super.paintComponent(g);
    }
}
