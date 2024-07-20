package strategies;

import models.ReceiptItem;

public class FreeGoodsTaxStrategy implements TaxCalculatorStrategy {
    public double calculateTax(ReceiptItem item) {
        double taxPercent = 0;
        return item.getPrice() * (1 + taxPercent);
    }
}
