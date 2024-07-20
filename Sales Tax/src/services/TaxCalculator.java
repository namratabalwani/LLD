package services;

import models.CATEGORY;
import models.ReceiptItem;
import strategies.FreeGoodsTaxStrategy;
import strategies.ImportGoodsTaxStrategy;
import strategies.NormalGoodsTaxStrategy;
import strategies.TaxCalculatorStrategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaxCalculator {
    TaxCalculatorStrategy taxStrategy;

    public TaxCalculator() {}

    public double getTaxForItems(List<ReceiptItem> receiptItems) {
        Set<CATEGORY> freeTaxItems = new HashSet<>(List.of(CATEGORY.FOOD, CATEGORY.MEDICAL, CATEGORY.BOOK));
        double total = 0;
        for (ReceiptItem receiptItem : receiptItems) {
            if (freeTaxItems.contains(receiptItem.getCategory())) {
                taxStrategy = new FreeGoodsTaxStrategy();
            } else if (receiptItem.isImported()) {
                taxStrategy = new ImportGoodsTaxStrategy();
            } else {
                taxStrategy = new NormalGoodsTaxStrategy();
            }
            double tax = taxStrategy.calculateTax(receiptItem);
            receiptItem.setTax(tax);
            total += tax;
        }
        return total;
    }
}
