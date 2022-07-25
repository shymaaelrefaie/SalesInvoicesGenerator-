/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.event.ListSelectionListener;
import View.InvoiceJFrame;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;

import Model.InvoiceHeader;
import Model.InvoiceLine;
import Model.InvoiceLineTable;

/**
 *
 * @author shaymaa.elrefaie
 */
public class TableSelectionListener implements ListSelectionListener{
    
    private InvoiceJFrame Invoiceframe;

    public TableSelectionListener(InvoiceJFrame frame) {
        this.Invoiceframe = frame;
    }
    
     @Override
    public void valueChanged(ListSelectionEvent e) {
        
        int selectedInvoiceIndex = Invoiceframe.getInvHTbl().getSelectedRow();
        System.out.println("Invoice selected: " + selectedInvoiceIndex);
        if (selectedInvoiceIndex != -1) {
            InvoiceHeader selectedInv = Invoiceframe.getInvoicesArray().get(selectedInvoiceIndex);
            ArrayList<InvoiceLine> lines = selectedInv.getLines();
            InvoiceLineTable lineTable = new InvoiceLineTable(lines);
            Invoiceframe.setLinesArray(lines);
            Invoiceframe.getInvLTbl().setModel(lineTable);
            Invoiceframe.getCustNameLbl().setText(selectedInv.getCustomer());
            Invoiceframe.getInvNumLbl().setText("" + selectedInv.getNum());
            Invoiceframe.getInvTotalIbl().setText("" + selectedInv.getInvoiceTotal());
            Invoiceframe.getInvDateLbl().setText(InvoiceJFrame.dateFormat.format(selectedInv.getInvoiceDate()));
        
    }
    }

    
}
