/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.kutil;

import java.sql.Timestamp;

/**
 * 
 * <www.cybercidades.com.br>
 * 
 * @author Daniel M. Kuhn
 * @author Serigne
 */
public class KTimestamp {
    
    public Timestamp getTimestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }
}
