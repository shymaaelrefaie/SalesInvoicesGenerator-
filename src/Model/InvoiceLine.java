/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author shaymaa.elrefaie
 */


public class InvoiceLine {
    
    
    private String Item;
    private double Price;
    private int Count;
    private InvoiceHeader InvoiceHeader;
    
     public InvoiceLine(String Item, double Price, int Count, InvoiceHeader Header) {
        this.Item = Item;
        this.Price = Price;
        this.Count = Count;
        this.InvoiceHeader = Header;
    }
    
     
      public InvoiceHeader getHeader() {
        return InvoiceHeader;
    }

    public void setHeader(InvoiceHeader header) {
        this.InvoiceHeader = header;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        this.Item = item;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        this.Count = count;
    }
    
    public double getLineTotal() {
        return Price * Count;
    }

    @Override
    public String toString() {
        return InvoiceHeader.getNum() + "," + Item + "," + Price + "," + Count;
    }
    
}
