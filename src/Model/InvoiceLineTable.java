/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author shaymaa.elrefaie
 */
public class InvoiceLineTable extends AbstractTableModel {
    
    private ArrayList<InvoiceLine> linesArraylist;
    private String[] columnsnames = {"Item Name", "Price", "Count", "Total"};

    public InvoiceLineTable(ArrayList<InvoiceLine> linesArraylist) {
        this.linesArraylist = linesArraylist;
    }

    @Override
    public int getRowCount() {
        return linesArraylist == null ? 0 : linesArraylist.size();
    }

    @Override
    public int getColumnCount() {
        return columnsnames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (linesArraylist == null) {
            return "";
        } else {
            InvoiceLine invline = linesArraylist.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return invline.getItem();
                case 1:
                    return invline.getPrice();
                case 2:
                    return invline.getCount();
                case 3:
                    return invline.getLineTotal();
                default:
                    return "";
            }
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnsnames[column];
    }
    
}
