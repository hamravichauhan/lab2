/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Main driver class demonstrating OOP concepts (Inheritance, 
 * Encapsulation, Object Creation, and Method Invocation) for the Online Shopping System.
 */

package online_Shopping;

import java.util.Date;
import online_Shopping.auth.Admin;
import online_Shopping.auth.Buyer;
import online_Shopping.auth.Seller;
import online_Shopping.cart.Cart;
import online_Shopping.catalog.Category;
import online_Shopping.catalog.Product;
import online_Shopping.engagement.Review;
import online_Shopping.logistics.Shipment;
import online_Shopping.order.Order;
import online_Shopping.payment.Payment;
import online_Shopping.user.Profile;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  Online Shopping System - OOP Demo Execution    ");
        System.out.println("=================================================");

        // 1. User & Inheritance (Polymorphism / Subclasses)
        Admin admin = new Admin(101, "admin@shop.com", "hash_admin_123", "SuperAdmin");
        Seller seller = new Seller(102, "seller@techstore.com", "hash_seller_456", "Tech Store", "VERIFIED", 5.0);
        Buyer buyer = new Buyer(103, "buyer@gmail.com", "hash_buyer_789", 150);

        System.out.println("\n--- 1. Testing Auth & Inheritance ---");
        admin.login();
        admin.manageUsers();
        admin.createCategory();

        seller.login();
        seller.addProduct();
        seller.viewSales();

        buyer.login();
        buyer.browseProducts();

        // 2. Profile
        System.out.println("\n--- 2. Testing Profile ---");
        Profile profile = new Profile(1, "Ravi", "Chauhan", "9876543210", "Panaji, Goa, India");
        profile.updateProfile();

        // 3. Catalog (Category & Product)
        System.out.println("\n--- 3. Testing Category & Product ---");
        Category electronics = new Category(201, "Electronics", "Gadgets and Devices");
        electronics.getProducts();

        Product laptop = new Product(301, "Gaming Laptop", "16GB RAM, RTX 4060", 85000.0, 10);
        System.out.println("Product Available: " + laptop.isAvailable());
        laptop.updatePrice(82000.0);

        // 4. Cart
        System.out.println("\n--- 4. Testing Cart ---");
        Cart cart = new Cart(401, new Date());
        buyer.addToCart();
        cart.calculateTotal();

        // 5. Order
        System.out.println("\n--- 5. Testing Order ---");
        buyer.checkout();
        Order order = new Order(501, 1, 82000.0);
        System.out.println("Order Subtotal: " + order.getItemSubtotal());

        // 6. Payment
        System.out.println("\n--- 6. Testing Payment ---");
        Payment payment = new Payment(601, 82000.0, "Credit Card", "PENDING", "TXN_998877");
        payment.processPayment();

        // 7. Shipment
        System.out.println("\n--- 7. Testing Shipment ---");
        Shipment shipment = new Shipment(701, "TRK_GOA_001", "BlueDart", "DISPATCHED", new Date());
        shipment.updateTracking();
        shipment.getDeliveryEstimate();

        // 8. Review
        System.out.println("\n--- 8. Testing Review ---");
        buyer.writeReview();
        Review review = new Review(801, 5, "Excellent performance and build quality!", new Date());
        review.editReview();

        // 9. Logout
        System.out.println("\n--- 9. Session Termination ---");
        buyer.logout();
        seller.logout();
        admin.logout();

        System.out.println("\n=================================================");
        System.out.println("       Demo Finished Successfully!               ");
        System.out.println("=================================================");
    }
}