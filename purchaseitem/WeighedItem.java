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
class WeighedItem extends PurchaseItem {

    private double weight;

    public WeighedItem(String name, double weight, double unitPrice) {

        super(name, unitPrice);
        this.weight = weight;

    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;

    }

    @Override
    public String toString() {
        return getName() + "@ " + getPrice() + " " + getWeight() + " kg " + getPrice() * getWeight() + "$";
    }
}
