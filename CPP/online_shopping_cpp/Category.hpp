/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Category entity managing product groupings.
 */

#ifndef CATEGORY_HPP
#define CATEGORY_HPP

#include <iostream>
#include <string>

class Category
{
private:
    int categoryId;
    std::string name;
    std::string description;

public:
    Category() : categoryId(0), name(""), description("") {}

    Category(int categoryId, const std::string &name, const std::string &description)
        : categoryId(categoryId), name(name), description(description) {}

    int getCategoryId() const { return categoryId; }
    void setCategoryId(int id) { categoryId = id; }

    std::string getName() const { return name; }
    void setName(const std::string &catName) { name = catName; }

    std::string getDescription() const { return description; }
    void setDescription(const std::string &desc) { description = desc; }

    void getProducts()
    {
        std::cout << "Fetching all products for category: " << name << std::endl;
    }
};

#endif