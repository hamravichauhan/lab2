/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Order class representing line item details and subtotal computation.
 */

#ifndef ORDER_HPP
#define ORDER_HPP

#include <iostream>

class Order
{
private:
    int orderItemId;
    int quantity;
    double purchasePrice;

public:
    Order() : orderItemId(0), quantity(0), purchasePrice(0.0) {}

    Order(int orderItemId, int quantity, double purchasePrice)
        : orderItemId(orderItemId), quantity(quantity), purchasePrice(purchasePrice) {}

    int getOrderItemId() const { return orderItemId; }
    void setOrderItemId(int id) { orderItemId = id; }

    int getQuantity() const { return quantity; }
    void setQuantity(int qty) { quantity = qty; }

    double getPurchasePrice() const { return purchasePrice; }
    void setPurchasePrice(double price) { purchasePrice = price; }

    double getItemSubtotal() const
    {
        return quantity * purchasePrice;
    }
};

#endif