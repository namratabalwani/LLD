package strategies;

import models.ReceiptItem;

public interface TaxCalculatorStrategy {
    public double calculateTax(ReceiptItem item);
}
