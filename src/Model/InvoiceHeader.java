/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shaymaa.elrefaie
 */
public class InvoiceHeader {
    
     private int number;
    private String customer;
    private Date invoiceDate;
    private ArrayList<InvoiceLine> lines;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    public InvoiceHeader() {
    }

    public InvoiceHeader(int number, String customer, Date invDate) {
        this.number = number;
        this.customer = customer;
        this.invoiceDate = invDate;
    }
    
     public int getNum() {
        return number;
    }
     
     public void setNum(int number) {
        this.number = number;
    }
     
     public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }
     
    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
     
    public double getInvoiceTotal() {
        double total = 0.0;
        
        for (int i = 0; i < getLines().size(); i++) {
            total += getLines().get(i).getLineTotal();
        }
        
        return total;
    }

    @Override
    public String toString() {
        return number + "," + df.format(invoiceDate) + "," + customer;
    } 
     
      public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
      public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
     

    

    
}
