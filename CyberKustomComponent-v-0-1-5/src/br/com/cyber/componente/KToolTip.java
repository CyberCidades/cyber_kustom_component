/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente;

import java.util.List;
import javax.swing.JComponent;
import javax.swing.ToolTipManager;

/**
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 */
public class KToolTip {
    
    public static void createKToolTip(List<String> itens, List<JComponent> componentes) {
        
        String content = "";
        
        for (String item : itens) 
        {
            content += " <p> "
                    + " <a style='font-family: \"Century Gothic\"; "
                    + "  font-size: 12px; "
                    + "  font-style: normal; "
                    + "  font-variant: normal; " 
                    + "  font-weight: 400; " 
                    + "  line-height: 26.4px;'>"+item+"</a>"
                    + " </p>"
                    + " </br>";
        }
        
        ToolTipManager.sharedInstance().setDismissDelay(10000);
        ToolTipManager.sharedInstance().setInitialDelay(1);
        
        for (JComponent comp : componentes) {
            comp.setToolTipText("<html><div style='margin:-3 -3 -3 -3; padding: 8 12 8 12; background:white;'>"+content+" </div></html>");
        }
    }
    
    public static void createKToolTip(String item, JComponent component) {
        
        String content = "";
       
        content += " <p>"
                + " <a style='font-family: \"Century Gothic\"; "
                + "  font-size: 12px; "
                + "  font-style: normal; "
                + "  font-variant: normal; " 
                + "  font-weight: 400; " 
                + "  line-height: 26.4px;'>"+item+"</a>"
                + " </p>"
                + " </br>";
      
        ToolTipManager.sharedInstance().setDismissDelay(10000);
        ToolTipManager.sharedInstance().setInitialDelay(1);
       
        component.setToolTipText("<html><div style='margin:-3 -3 -3 -3; padding: 8 12 8 12; background:white;'>"+content+" </div></html>");
    }
}
