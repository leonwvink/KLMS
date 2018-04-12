package com.capgemini.Model;

import java.sql.Time;
import java.util.Date;

public class Billing {

   private String invoiceID;
   private double grandTotal;
   private boolean billPaid;

    public Billing() {
    }


    public Billing(String invoiceID, double grandTotal, boolean billPaid) {
        this.invoiceID = invoiceID;
        this.grandTotal = grandTotal;
        this.billPaid = billPaid;
    }

    public void billNotPaid(){
        billPaid = false;

    }

    public void addServiceTax(){
        grandTotal = (grandTotal * 10 / 100) + 50;
    }

    public void discountedBill(){
        grandTotal = grandTotal - (grandTotal *15/100);


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
