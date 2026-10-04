/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: User base class implementing encapsulation and authentication methods.
 */

#ifndef USER_HPP
#define USER_HPP

#include <iostream>
#include <string>

class User
{
protected:
    int userId;
    std::string email;
    std::string passwordHash;

public:
    // Default Constructor
    User() : userId(0), email(""), passwordHash("") {}

    // Parameterized Constructor
    User(int userId, const std::string &email, const std::string &passwordHash)
        : userId(userId), email(email), passwordHash(passwordHash) {}

    // Virtual Destructor for safe polymorphic cleanup
    virtual ~User() {}

    // Getters and Setters
    int getUserId() const { return userId; }
    void setUserId(int id) { userId = id; }

    std::string getEmail() const { return email; }
    void setEmail(const std::string &mail) { email = mail; }

    std::string getPasswordHash() const { return passwordHash; }
    void setPasswordHash(const std::string &hash) { passwordHash = hash; }

    // Member Methods
    virtual bool login()
    {
        std::cout << "Checking login for user: " << email << std::endl;
        return !email.empty() && !passwordHash.empty();
    }

    virtual void logout()
    {
        std::cout << "User " << userId << " logged out successfully." << std::endl;
    }

    virtual bool resetPassword()
    {
        std::cout << "Password reset link sent to: " << email << std::endl;
        return true;
    }
};

#endif