/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.kutil;

import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JFileChooser;

/**
 * 
 * <www.cybercidades.com.br>
 * 
 * @author Daniel M. Kuhn 
 * @author Serigne
 * 
 */
public class KFileChooser {
    
    public static File[] getFiles() {
        try {
            JFileChooser abrir = new JFileChooser();
            abrir.setFileSelectionMode(JFileChooser.FILES_ONLY);
            abrir.setMultiSelectionEnabled(true);

            int retorno = abrir.showOpenDialog(null);

            if (retorno == JFileChooser.APPROVE_OPTION) {
                return abrir.getSelectedFiles();
            }
        } catch(HeadlessException e) {
            System.out.println("erro " + e.getMessage());
            return null;
        }
        return null;
    }
}
