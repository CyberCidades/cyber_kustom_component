/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.kutil;

import java.util.logging.Logger;

/**
 * 
 * @author Daniel M. Kuhn  <www.cybercidades.com.br>
 * 
 * @fontes https://stackoverflow.com/questions/228477/how-do-i-programmatically-determine-operating-system-in-java
 * 
 */
public class OS {

    private static final Logger LOG = Logger.getLogger(OS.class.getName());

    private static String OS = null;
    
    public static String getUserName() {
        String user = System.getProperty("user.name");
        return user;
    }
    
    public static String getOsName() {
        OS = System.getProperty("os.name");
        return OS;
    }
    
    public static boolean isWindows() {
        if (getOsName().equals("Windows")) {
            return true;
        }
        return false;
    }
    
    public static boolean isLinux() {
        if (getOsName().equals("Linux")) {
            return true;
        }
        return false;
    }
}