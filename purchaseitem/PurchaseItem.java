/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchaseitem;

/**
 *
 * @author Aysegul
 */
public class PurchaseItem {

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

   
    @Override
    public String toString() {
        return getName() + "@ " + getPrice();
    }
}

