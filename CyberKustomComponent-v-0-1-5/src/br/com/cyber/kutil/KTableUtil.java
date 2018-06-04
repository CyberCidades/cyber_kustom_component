/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.kutil;

import br.com.cyber.componente.Ktable;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Daniel M. Kuhn <www.cybercidades.com.br>
 * 
 */
public class KTableUtil {
    
//    /*
//    * @fontes https://stackoverflow.com/questions/6232355/deleting-all-the-rows-in-a-jtable
//    */
//    public static void removeAllRow(Ktable table) {
//        try {
//            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
//            dtm.setRowCount(0);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public static void removeRow(Ktable table, Integer index) {
//        try {
//            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
//
//            dtm.removeRow(index);
//            dtm.fireTableRowsDeleted(index, index);
//          
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public static void addRow(Ktable table) {
//        
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//
//        Vector row = new Vector();
//        
//        row.add("Enter data to column 1");
//        row.add("Enter data to column 2");
//        row.add("Enter data to column 3");
//        model.addRow(row);
//    }
//    
//    // http://www.java2s.com/Tutorial/Java/0240__Swing/InsertarowtoatablethroughDefaultTableModelatspecifiedrow.htm
//    
//    public static void reloadTable(Ktable table) {
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        
//        Object rowData[] = new Object[model.getColumnCount()];
//        
//        // Create the first row
//        model.insertRow(0, new Object[] { "r1", "r1", "r1", "r1" });
//        
//        model.addRow(rowData);
//        /* Implementar a atualização das linhas da tabela a partir de um array */
//    }
    
    /*
    * @fontes https://stackoverflow.com/questions/6232355/deleting-all-the-rows-in-a-jtable
    */
    public static void removeAllRow(Ktable table) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void removeRow(Ktable table, int index) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();

            dtm.removeRow(index);
            dtm.fireTableRowsDeleted(index, index);
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void addEndRow(Ktable table, Object[] row) {
        
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();

//        Vector row = new Vector();
//        
//        row.add("Enter data to column 1");
//        row.add("Enter data to column 2");
//        row.add("Enter data to column 3");
        dtm.addRow(row);
    }
    
    
    // http://www.java2s.com/Tutorial/Java/0240__Swing/InsertarowtoatablethroughDefaultTableModelatspecifiedrow.htm
    public static void addIndexRow(Ktable table, int index, Object[] row) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        
        Object rowData[] = new Object[dtm.getColumnCount()];
//        for (int i = 0; i < col.size(); i++) {
//            rowData[i] = col.get(i);
//        }
        
        // Create the first row
        dtm.insertRow(index, row);
       
       // dtm.addRow(rowData);
        
        /* Implementar a atualização das linhas da tabela a partir de um array */
    }
}
