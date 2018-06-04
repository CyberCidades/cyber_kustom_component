/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.kutil;

/**
 * 
 * <www.cybercidades.com.br>
 * 
 * @author Daniel M. Kuhn
 */

import java.text.Normalizer;

public class StringUtil {

    /**
     * Remove toda a acentuação da string substituindo por caracteres simples sem acento.
     */
    public static String unaccent(String src) {
        return Normalizer
        .normalize(src, Normalizer.Form.NFD)
        .replaceAll("[^\\p{ASCII}]", "");
    }
}