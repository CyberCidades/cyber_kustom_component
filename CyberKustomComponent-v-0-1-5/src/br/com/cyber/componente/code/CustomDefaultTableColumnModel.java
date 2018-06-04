/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.componente.code;

import javax.swing.table.DefaultTableColumnModel;

/**
 *
 * @author @author Daniel M. Kuhn <www.cybercidades.com.br>
 */

// https://stackoverflow.com/questions/10274864/removing-jtable-grid-cell-border-completely
public class CustomDefaultTableColumnModel extends DefaultTableColumnModel{

    @Override
    public void setColumnMargin(int newMargin) {

        //Always set ColumnMargin to zero.
        //Because after the column data binding its internally set one as ColumnMargin.
        //That course to paint white color grid.
        //To stop we override the setColumnMargin and pass zero to ColumnMargin.
        super.setColumnMargin(1);
    }
}