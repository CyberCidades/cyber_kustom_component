/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.kutil;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author ViniGodoy
 * @fonte http://www.guj.com.br/t/aplicacao-swing-link-htlm/42167/7
 */
public class URLBrowser {
    
    public static void openURL(String url) {
        Desktop desktop = null;
        
        //Primeiro verificamos se é possível a integração com o desktop   
    	if (!Desktop.isDesktopSupported())
            throw new IllegalStateException("Desktop resources not supported!"); 
        
        desktop = Desktop.getDesktop();   
        //Agora vemos se é possível disparar o browser default.   
        if (!desktop.isSupported(Desktop.Action.BROWSE))   
            throw new IllegalStateException("No default browser set!");   
        //Pega a URI de um componente de texto.   
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }   
        //Dispara o browser default, que pode ser o Explorer, Firefox ou outro.   
        try {
            desktop.browse(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
