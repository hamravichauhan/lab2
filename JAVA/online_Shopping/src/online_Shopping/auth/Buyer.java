/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Buyer class inheriting from User handling customer actions.
 */

package online_Shopping.auth;

public class Buyer extends User {
    // Private member
    private int loyaltyPoints;

    // Constructors
    public Buyer() {
        super();
    }

    public Buyer(int userId, String email, String passwordHash, int loyaltyPoints) {
        super(userId, email, passwordHash);
        this.loyaltyPoints = loyaltyPoints;
    }

    // Getter and Setter
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    // Buyer actions
    public void browseProducts() {
        System.out.println("Buyer browsing products list.");
    }

    public void addToCart() {
        System.out.println("Item added to cart.");
    }

    public void checkout() {
        System.out.println("Buyer proceeding to checkout.");
    }

    public void writeReview() {
        System.out.println("Buyer writing a review.");
    }
}