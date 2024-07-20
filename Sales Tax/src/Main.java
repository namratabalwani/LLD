import models.CATEGORY;
import models.ReceiptItem;
import services.ReceiptManager;

public class Main {
    public static void main(String[] args) {
        ReceiptItem item1 = new ReceiptItem(1, "Biscuits", 5, CATEGORY.FOOD, false);
        ReceiptItem item2 = new ReceiptItem(2, "Shirt", 15, CATEGORY.OTHER, true);
        ReceiptItem item3 = new ReceiptItem(3, "Gel", 25, CATEGORY.MEDICAL, true);
        ReceiptItem item4 = new ReceiptItem(4, "Cupboard", 45, CATEGORY.OTHER, false);
        ReceiptItem item5 = new ReceiptItem(5, "Novel", 8, CATEGORY.BOOK, false);

        ReceiptManager manager = ReceiptManager.getInstance();
        manager.addItem(item1);
        manager.addItem(item2);
        manager.addItem(item3);
        manager.addItem(item4);
        manager.addItem(item5);

        manager.printReceipt();

    }
}