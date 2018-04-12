package com.capgemini.Model;


public class Billing {

    private String invoiceID;
    private double grandTotal;
    private boolean billPaid;

    public Billing(String invoiceID, double grandTotal, boolean billPaid) {
        this.invoiceID = invoiceID;
        this.grandTotal = grandTotal;
        this.billPaid = billPaid;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    private void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public boolean isBillPaid() {
        return billPaid;
    }

    public void setBillPaid(boolean billPaid) {
        this.billPaid = billPaid;
    }
}
