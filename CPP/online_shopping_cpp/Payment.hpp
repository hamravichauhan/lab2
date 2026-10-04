/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Payment entity handling transaction states and settlements.
 */

#ifndef PAYMENT_HPP
#define PAYMENT_HPP

#include <iostream>
#include <string>

class Payment
{
private:
    int paymentId;
    double amount;
    std::string paymentMethod;
    std::string paymentStatus;
    std::string transactionRef;

public:
    Payment() : paymentId(0), amount(0.0), paymentMethod(""), paymentStatus("PENDING"), transactionRef("") {}

    Payment(int paymentId, double amount, const std::string &paymentMethod,
            const std::string &paymentStatus, const std::string &transactionRef)
        : paymentId(paymentId), amount(amount), paymentMethod(paymentMethod),
          paymentStatus(paymentStatus), transactionRef(transactionRef) {}

    int getPaymentId() const { return paymentId; }
    void setPaymentId(int id) { paymentId = id; }

    double getAmount() const { return amount; }
    void setAmount(double amt) { amount = amt; }

    std::string getPaymentMethod() const { return paymentMethod; }
    void setPaymentMethod(const std::string &method) { paymentMethod = method; }

    std::string getPaymentStatus() const { return paymentStatus; }
    void setPaymentStatus(const std::string &status) { paymentStatus = status; }

    std::string getTransactionRef() const { return transactionRef; }
    void setTransactionRef(const std::string &ref) { transactionRef = ref; }

    void processPayment()
    {
        paymentStatus = "SUCCESS";
        std::cout << "Payment of " << amount << " processed with reference " << transactionRef << "." << std::endl;
    }
};

#endif