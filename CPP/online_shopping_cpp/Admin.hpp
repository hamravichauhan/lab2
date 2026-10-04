/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Admin subclass inheriting from User to manage taxonomy and accounts.
 */

#ifndef ADMIN_HPP
#define ADMIN_HPP

#include "User.hpp"

class Admin : public User
{
private:
    std::string roleLevel;

public:
    Admin() : User(), roleLevel("") {}

    Admin(int userId, const std::string &email, const std::string &passwordHash, const std::string &roleLevel)
        : User(userId, email, passwordHash), roleLevel(roleLevel) {}

    std::string getRoleLevel() const { return roleLevel; }
    void setRoleLevel(const std::string &role) { roleLevel = role; }

    void createCategory()
    {
        std::cout << "Admin " << userId << " created a new category." << std::endl;
    }

    void updateCategory()
    {
        std::cout << "Admin " << userId << " updated a category." << std::endl;
    }

    void deleteCategory()
    {
        std::cout << "Admin " << userId << " deleted a category." << std::endl;
    }

    void manageUsers()
    {
        std::cout << "Admin " << userId << " managing system users." << std::endl;
    }
};

#endif