/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Main driver class demonstrating OOP concepts in C# (.NET).
 */

using System;
using OnlineShopping.Auth;
using OnlineShopping.User;
using OnlineShopping.Catalog;
using OnlineShopping.Cart;
using OnlineShopping.Order;
using OnlineShopping.Payment;
using OnlineShopping.Logistics;
using OnlineShopping.Engagement;

namespace OnlineShopping
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("=================================================");
            Console.WriteLine("    Online Shopping System - C# (.NET) Demo      ");
            Console.WriteLine("=================================================");

            // 1. User & Inheritance (Admin, Seller, Buyer)
            Console.WriteLine("\n--- 1. Testing Auth & Inheritance ---");
            Admin admin = new Admin(101, "admin@shop.com", "hash_admin_123", "SuperAdmin");
            Seller seller = new Seller(102, "seller@techstore.com", "hash_seller_456", "Tech Store", "VERIFIED", 5.0);
            Buyer buyer = new Buyer(103, "buyer@gmail.com", "hash_buyer_789", 150);

            admin.Login();
            admin.ManageUsers();
            admin.CreateCategory();

            seller.Login();
            seller.AddProduct();
            seller.ViewSales();

            buyer.Login();
            buyer.BrowseProducts();

            // 2. Profile
            Console.WriteLine("\n--- 2. Testing Profile ---");
            Profile profile = new Profile(1, "Ravi", "Chauhan", "9876543210", "Panaji, Goa, India");
            profile.UpdateProfile();

            // 3. Catalog (Category & Product)
            Console.WriteLine("\n--- 3. Testing Category & Product ---");
            Category electronics = new Category(201, "Electronics", "Gadgets and Devices");
            electronics.GetProducts();

            Product laptop = new Product(301, "Gaming Laptop", "16GB RAM, RTX 4060", 85000.0, 10);
            Console.WriteLine($"Product Available: {laptop.IsAvailable()}");
            laptop.UpdatePrice(82000.0);

            // 4. Cart
            Console.WriteLine("\n--- 4. Testing Cart ---");
            Cart.Cart cart = new Cart.Cart(401, DateTime.Now);
            buyer.AddToCart();
            cart.CalculateTotal();

            // 5. Order
            Console.WriteLine("\n--- 5. Testing Order ---");
            buyer.Checkout();
            Order.Order order = new Order.Order(501, 1, 82000.0);
            Console.WriteLine($"Order Subtotal: {order.GetItemSubtotal()}");

            // 6. Payment
            Console.WriteLine("\n--- 6. Testing Payment ---");
            Payment.Payment payment = new Payment.Payment(601, 82000.0, "Credit Card", "PENDING", "TXN_998877");
            payment.ProcessPayment();

            // 7. Shipment
            Console.WriteLine("\n--- 7. Testing Shipment ---");
            Shipment shipment = new Shipment(701, "TRK_GOA_001", "BlueDart", "DISPATCHED", DateTime.Now);
            shipment.UpdateTracking();
            shipment.GetDeliveryEstimate();

            // 8. Review
            Console.WriteLine("\n--- 8. Testing Review ---");
            buyer.WriteReview();
            Review review = new Review(801, 5, "Excellent performance and build quality!", DateTime.Now);
            review.EditReview();

            // 9. Logout
            Console.WriteLine("\n--- 9. Session Termination ---");
            buyer.Logout();
            seller.Logout();
            admin.Logout();

            Console.WriteLine("\n=================================================");
            Console.WriteLine("        Demo Finished Successfully!              ");
            Console.WriteLine("=================================================");
        }
    }
}