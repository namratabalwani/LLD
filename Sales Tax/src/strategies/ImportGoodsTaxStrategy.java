package strategies;

import models.ReceiptItem;

public class ImportGoodsTaxStrategy implements TaxCalculatorStrategy {
    public double calculateTax(ReceiptItem item) {
        double taxPercent = 0.15;
        return item.getPrice() * (1 + taxPercent);
    }
}
