package models;

import services.TaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private final List<ReceiptItem> items;
    private double totalPrice;
    private double totalTax;
    private double grandTotal;
    private TaxCalculator taxCalculator;

    public Receipt(List<ReceiptItem> items) {
        this.items = new ArrayList<>(items);
        this.taxCalculator = new TaxCalculator();
        this.totalPrice = getTotalPrice();
        this.totalTax = getTotalTax();
        this.grandTotal = this.totalPrice + this.totalTax;
    }

    public void generateReceipt() {
        System.out.println("Welcome to the Mega Store!  Here is your Receipt");
        for (ReceiptItem item: this.items) {
            System.out.println("Item: " + item.getName() +"     Price: " + item.getPrice());
        }
        System.out.println("Total Price : " + this.totalPrice);
        System.out.println("Total Tax : " + this.totalPrice);
        System.out.println("Grand Total : " + this.grandTotal);
    }


    private double getTotalTax() {
        return this.taxCalculator.getTaxForItems(this.items);
    }

    private double getTotalPrice() {
        double totalPrice = 0.0;
        for (ReceiptItem recieptItem : items) {
            totalPrice += recieptItem.getPrice();
        }
        return totalPrice;
    }}
