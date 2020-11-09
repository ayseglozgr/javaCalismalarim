
package purchaseitem;


public abstract class PurchaseItem {

    private String name;
    private double unitPrice;

    public PurchaseItem(String n, double up) {
        name = n;
        setPrice(up);
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double up) {
        unitPrice = (up > 0) ? up : 0;
    }

    public double getPrice() {
        return unitPrice;
    }

    public abstract String toString();
}
