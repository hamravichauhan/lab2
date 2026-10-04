/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Buyer subclass inheriting from User for customer browsing & checkout.
 */

#ifndef BUYER_HPP
#define BUYER_HPP

#include "User.hpp"

class Buyer : public User
{
private:
    int loyaltyPoints;

public:
    Buyer() : User(), loyaltyPoints(0) {}

    Buyer(int userId, const std::string &email, const std::string &passwordHash, int loyaltyPoints)
        : User(userId, email, passwordHash), loyaltyPoints(loyaltyPoints) {}

    int getLoyaltyPoints() const { return loyaltyPoints; }
    void setLoyaltyPoints(int points) { loyaltyPoints = points; }

    void browseProducts()
    {
        std::cout << "Buyer " << userId << " is browsing products." << std::endl;
    }

    void addToCart()
    {
        std::cout << "Product added to cart for Buyer " << userId << "." << std::endl;
    }

    void checkout()
    {
        std::cout << "Buyer " << userId << " proceeding to checkout." << std::endl;
    }

    void writeReview()
    {
        std::cout << "Buyer " << userId << " writing a review." << std::endl;
    }
};

#endif