public class InvoiceItem {

    // Private variables
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor
    InvoiceItem(String id,
                String desc,
                int qty,
                double unitPrice) {

        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter methods

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter methods

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate total

    public double getTotal() {

        return qty * unitPrice;
    }

    // toString method

    public String toString() {

        return String.format(
            "InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%.2f]",
            id,
            desc,
            qty,
            unitPrice
        );
    }
}