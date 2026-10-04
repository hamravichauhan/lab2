/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Cart class tracking user cart ID and updated timestamps.
 */

package online_Shopping.cart;

import java.util.Date;

public class Cart {
    private int cartId;
    private Date updatedAt;

    public Cart() {
        this.updatedAt = new Date();
    }

    public Cart(int cartId, Date updatedAt) {
        this.cartId = cartId;
        this.updatedAt = updatedAt;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public double calculateTotal() {
        System.out.println("Calculating total for cart ID: " + this.cartId);
        return 0.0;
    }

    public void clearCart() {
        System.out.println("Cart cleared.");
    }
}