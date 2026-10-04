/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Seller subclass inheriting from User for store & merchandise management.
 */

#ifndef SELLER_HPP
#define SELLER_HPP

#include "User.hpp"

class Seller : public User
{
private:
    std::string storeName;
    std::string kycStatus;
    double commissionRate;

public:
    Seller() : User(), storeName(""), kycStatus(""), commissionRate(0.0) {}

    Seller(int userId, const std::string &email, const std::string &passwordHash,
           const std::string &storeName, const std::string &kycStatus, double commissionRate)
        : User(userId, email, passwordHash), storeName(storeName), kycStatus(kycStatus), commissionRate(commissionRate) {}

    std::string getStoreName() const { return storeName; }
    void setStoreName(const std::string &name) { storeName = name; }

    std::string getKycStatus() const { return kycStatus; }
    void setKycStatus(const std::string &status) { kycStatus = status; }

    double getCommissionRate() const { return commissionRate; }
    void setCommissionRate(double rate) { commissionRate = rate; }

    void addProduct()
    {
        std::cout << "Product added by seller: " << storeName << std::endl;
    }

    void updateStock()
    {
        std::cout << "Stock updated by seller for store: " << storeName << std::endl;
    }

    void viewSales()
    {
        std::cout << "Sales analytics generated for: " << storeName << std::endl;
    }
};

#endif