/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Order class representing order line items and pricing calculations.
 */

package online_Shopping.order;

public class Order {
    private int orderItemId;
    private int quantity;
    private double purchasePrice;

    public Order() {
    }

    public Order(int orderItemId, int quantity, double purchasePrice) {
        this.orderItemId = orderItemId;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getItemSubtotal() {
        return this.quantity * this.purchasePrice;
    }
}