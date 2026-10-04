/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Main driver showcasing C++ OOP execution for Online Shopping System.
 */

#include <iostream>
#include "User.hpp"
#include "Admin.hpp"
#include "Seller.hpp"
#include "Buyer.hpp"
#include "Profile.hpp"
#include "Category.hpp"
#include "Product.hpp"
#include "Cart.hpp"
#include "Order.hpp"
#include "Payment.hpp"
#include "Shipment.hpp"
#include "Review.hpp"

int main()
{
    std::cout << "=================================================" << std::endl;
    std::cout << "     Online Shopping System - C++ OOP Demo       " << std::endl;
    std::cout << "=================================================" << std::endl;

    // 1. User & Inheritance (Admin, Seller, Buyer)
    std::cout << "\n--- 1. Testing Auth & Inheritance ---" << std::endl;
    Admin admin(101, "admin@shop.com", "hash_admin_123", "SuperAdmin");
    Seller seller(102, "seller@techstore.com", "hash_seller_456", "Tech Store", "VERIFIED", 5.0);
    Buyer buyer(103, "buyer@gmail.com", "hash_buyer_789", 150);

    admin.login();
    admin.manageUsers();
    admin.createCategory();

    seller.login();
    seller.addProduct();
    seller.viewSales();

    buyer.login();
    buyer.browseProducts();

    // 2. Profile
    std::cout << "\n--- 2. Testing Profile ---" << std::endl;
    Profile profile(1, "Ravi", "Chauhan", "9876543210", "Panaji, Goa, India");
    profile.updateProfile();

    // 3. Catalog (Category & Product)
    std::cout << "\n--- 3. Testing Category & Product ---" << std::endl;
    Category electronics(201, "Electronics", "Gadgets and Devices");
    electronics.getProducts();

    Product laptop(301, "Gaming Laptop", "16GB RAM, RTX 4060", 85000.0, 10);
    std::cout << "Product Available: " << (laptop.isAvailable() ? "true" : "false") << std::endl;
    laptop.updatePrice(82000.0);

    // 4. Cart
    std::cout << "\n--- 4. Testing Cart ---" << std::endl;
    Cart cart(401, "2026-08-16");
    buyer.addToCart();
    cart.calculateTotal();

    // 5. Order
    std::cout << "\n--- 5. Testing Order ---" << std::endl;
    buyer.checkout();
    Order order(501, 1, 82000.0);
    std::cout << "Order Subtotal: " << order.getItemSubtotal() << std::endl;

    // 6. Payment
    std::cout << "\n--- 6. Testing Payment ---" << std::endl;
    Payment payment(601, 82000.0, "Credit Card", "PENDING", "TXN_998877");
    payment.processPayment();

    // 7. Shipment
    std::cout << "\n--- 7. Testing Shipment ---" << std::endl;
    Shipment shipment(701, "TRK_GOA_001", "BlueDart", "DISPATCHED", "2026-08-16");
    shipment.updateTracking();
    shipment.getDeliveryEstimate();

    // 8. Review
    std::cout << "\n--- 8. Testing Review ---" << std::endl;
    buyer.writeReview();
    Review review(801, 5, "Excellent performance and build quality!", "2026-08-16");
    review.editReview();

    // 9. Session Termination
    std::cout << "\n--- 9. Session Termination ---" << std::endl;
    buyer.logout();
    seller.logout();
    admin.logout();

    std::cout << "\n=================================================" << std::endl;
    std::cout << "        Demo Finished Successfully!              " << std::endl;
    std::cout << "=================================================" << std::endl;

    return 0;
}