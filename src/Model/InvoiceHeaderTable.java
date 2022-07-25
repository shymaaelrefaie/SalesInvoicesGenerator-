/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import View.InvoiceJFrame;

/**
 *
 * @author shaymaa.elrefaie
 */
public class InvoiceHeaderTable extends AbstractTableModel{
    
     private ArrayList<InvoiceHeader> InvoicesArray;
    private String[] Invoicescolumns = {"Invoice Num", "Invoice Date", "Customer Name", "Invoice Total"};
    
    public InvoiceHeaderTable(ArrayList<InvoiceHeader> InvoicesArray) {
        this.InvoicesArray = InvoicesArray;
    }
    
    @Override
    public int getRowCount() {
        return InvoicesArray.size();
    }

    @Override
    public int getColumnCount() {
        return Invoicescolumns.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return Invoicescolumns[column];
    }
    
     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader inv = InvoicesArray.get(rowIndex);
        switch (columnIndex) {
            case 0: return inv.getNum();
            case 1: return InvoiceJFrame.dateFormat.format(inv.getInvoiceDate());
            case 2: return inv.getCustomer();
            case 3: return inv.getInvoiceTotal();
        }
        return "";
    }

    

    
}
