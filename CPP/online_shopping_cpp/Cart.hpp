/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Cart entity handling active items and calculation operations.
 */

#ifndef CART_HPP
#define CART_HPP

#include <iostream>
#include <string>

class Cart
{
private:
    int cartId;
    std::string updatedAt;

public:
    Cart() : cartId(0), updatedAt("2026-08-16") {}

    Cart(int cartId, const std::string &updatedAt)
        : cartId(cartId), updatedAt(updatedAt) {}

    int getCartId() const { return cartId; }
    void setCartId(int id) { cartId = id; }

    std::string getUpdatedAt() const { return updatedAt; }
    void setUpdatedAt(const std::string &date) { updatedAt = date; }

    double calculateTotal()
    {
        std::cout << "Calculating total for cart ID: " << cartId << std::endl;
        return 0.0;
    }

    void clearCart()
    {
        std::cout << "Cart ID " << cartId << " has been cleared." << std::endl;
    }
};

#endif