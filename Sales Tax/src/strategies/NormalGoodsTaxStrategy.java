package strategies;

import models.ReceiptItem;

public class NormalGoodsTaxStrategy implements TaxCalculatorStrategy {
    public double calculateTax(ReceiptItem item) {
        double taxPercent = 0.1;
        return item.getPrice() * (1 + taxPercent);
    }
}
