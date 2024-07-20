package models;

public class ReceiptItem {
    private int id;
    private String name;
    private double price;
    private double tax;
    private CATEGORY category;
    private boolean isImported;

    public ReceiptItem(int id, String name, double price, CATEGORY category, boolean isImported) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.isImported = isImported;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public CATEGORY getCategory() {
        return category;
    }

    public void setCategory(CATEGORY category) {
        this.category = category;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }
}
