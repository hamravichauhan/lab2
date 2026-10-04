/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Product entity managing catalog specifications, pricing, and stock.
 */

#ifndef PRODUCT_HPP
#define PRODUCT_HPP

#include <iostream>
#include <string>

class Product
{
private:
    int productId;
    std::string name;
    std::string description;
    double price;
    int stockQuantity;

public:
    Product() : productId(0), name(""), description(""), price(0.0), stockQuantity(0) {}

    Product(int productId, const std::string &name, const std::string &description,
            double price, int stockQuantity)
        : productId(productId), name(name), description(description),
          price(price), stockQuantity(stockQuantity) {}

    int getProductId() const { return productId; }
    void setProductId(int id) { productId = id; }

    std::string getName() const { return name; }
    void setName(const std::string &prodName) { name = prodName; }

    std::string getDescription() const { return description; }
    void setDescription(const std::string &desc) { description = desc; }

    double getPrice() const { return price; }
    void setPrice(double p) { price = p; }

    int getStockQuantity() const { return stockQuantity; }
    void setStockQuantity(int qty) { stockQuantity = qty; }

    bool isAvailable() const
    {
        return stockQuantity > 0;
    }

    void updatePrice(double newPrice)
    {
        price = newPrice;
        std::cout << "Product " << productId << " price updated to: " << newPrice << std::endl;
    }
};

#endif