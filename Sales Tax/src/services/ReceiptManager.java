package services;

import models.Receipt;
import models.ReceiptItem;

import java.util.ArrayList;
import java.util.List;

public class ReceiptManager {
    private static volatile ReceiptManager instance = null;
    private final List<ReceiptItem> items = new ArrayList<>();

    private ReceiptManager() {};

    public static ReceiptManager getInstance() {
        if (instance == null) {
            synchronized(ReceiptManager.class) {
                if (instance == null) {
                    instance = new ReceiptManager();
                }
            }
        }

        return instance;
    }

    public void addItem(ReceiptItem item) {
        items.add(item);
    }

    public void printReceipt() {
        Receipt receipt = new Receipt(items);
        receipt.generateReceipt();
    }
}
