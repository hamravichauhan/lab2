"""
Name: Ravi Chauhan
Roll No: 37
Context: Main script running instances of all classes to demonstrate
object creation, inheritance, encapsulation, and method execution.
"""

from datetime import datetime
from auth import Admin, Buyer, Seller, User
from cart import Cart
from catalog import Category, Product
from engagement import Review
from logistics import Shipment
from order import Order
from payment import Payment
from user import Profile


def main():
  print("=" * 50)
  print("   Online Shopping System - Python OOP Demo      ")
  print("=" * 50)

  # 1. User & Inheritance (Admin, Seller, Buyer)
  print("\n--- 1. Testing Auth & Inheritance ---")
  admin = Admin(101, "admin@shop.com", "hash_admin_123", "SuperAdmin")
  seller = Seller(
      102,
      "seller@techstore.com",
      "hash_seller_456",
      "Tech Store",
      "VERIFIED",
      5.0,
  )
  buyer = Buyer(103, "buyer@gmail.com", "hash_buyer_789", 150)

  admin.login()
  admin.manage_users()
  admin.create_category()

  seller.login()
  seller.add_product()
  seller.view_sales()

  buyer.login()
  buyer.browse_products()

  # 2. Profile
  print("\n--- 2. Testing Profile ---")
  profile = Profile(
      1, "Ravi", "Chauhan", "9876543210", "Panaji, Goa, India"
  )
  profile.update_profile()

  # 3. Catalog (Category & Product)
  print("\n--- 3. Testing Category & Product ---")
  electronics = Category(201, "Electronics", "Gadgets and Devices")
  electronics.get_products()

  laptop = Product(
      301, "Gaming Laptop", "16GB RAM, RTX 4060", 85000.0, 10
  )
  print(f"Product Available: {laptop.is_available()}")
  laptop.update_price(82000.0)

  # 4. Cart
  print("\n--- 4. Testing Cart ---")
  cart = Cart(401, datetime.now())
  buyer.add_to_cart()
  cart.calculate_total()

  # 5. Order
  print("\n--- 5. Testing Order ---")
  buyer.checkout()
  order = Order(501, 1, 82000.0)
  print(f"Order Subtotal: {order.get_item_subtotal()}")

  # 6. Payment
  print("\n--- 6. Testing Payment ---")
  payment = Payment(
      601, 82000.0, "Credit Card", "PENDING", "TXN_998877"
  )
  payment.process_payment()

  # 7. Shipment
  print("\n--- 7. Testing Shipment ---")
  shipment = Shipment(
      701, "TRK_GOA_001", "BlueDart", "DISPATCHED", datetime.now()
  )
  shipment.update_tracking()
  shipment.get_delivery_estimate()

  # 8. Review
  print("\n--- 8. Testing Review ---")
  buyer.write_review()
  review = Review(
      801,
      5,
      "Excellent performance and build quality!",
      datetime.now(),
  )
  review.edit_review()

  # 9. Logout
  print("\n--- 9. Session Termination ---")
  buyer.logout()
  seller.logout()
  admin.logout()

  print("\n" + "=" * 50)
  print("        Demo Finished Successfully!               ")
  print("=" * 50)


if __name__ == "__main__":
  main()