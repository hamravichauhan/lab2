/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Seller class inheriting from User with seller-specific attributes and methods.
 */

package online_Shopping.auth;

public class Seller extends User {
    // Encapsulated fields for Seller
    private String storeName;
    private String kycStatus;
    private double commissionRate;

    // Constructors
    public Seller() {
        super();
    }

    public Seller(int userId, String email, String passwordHash, String storeName, String kycStatus, double commissionRate) {
        super(userId, email, passwordHash);
        this.storeName = storeName;
        this.kycStatus = kycStatus;
        this.commissionRate = commissionRate;
    }

    // Getters and Setters
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    // Seller business methods
    public void addProduct() {
        System.out.println("Product added by seller: " + this.storeName);
    }

    public void updateStock() {
        System.out.println("Stock updated by seller.");
    }

    public void viewSales() {
        System.out.println("Sales report generated for store: " + this.storeName);
    }
}