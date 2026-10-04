/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Profile entity holding user demographic and contact details.
 */

#ifndef PROFILE_HPP
#define PROFILE_HPP

#include <iostream>
#include <string>

class Profile
{
private:
    int profileId;
    std::string firstName;
    std::string lastName;
    std::string phoneNumber;
    std::string address;

public:
    Profile() : profileId(0), firstName(""), lastName(""), phoneNumber(""), address("") {}

    Profile(int profileId, const std::string &firstName, const std::string &lastName,
            const std::string &phoneNumber, const std::string &address)
        : profileId(profileId), firstName(firstName), lastName(lastName),
          phoneNumber(phoneNumber), address(address) {}

    int getProfileId() const { return profileId; }
    void setProfileId(int id) { profileId = id; }

    std::string getFirstName() const { return firstName; }
    void setFirstName(const std::string &fn) { firstName = fn; }

    std::string getLastName() const { return lastName; }
    void setLastName(const std::string &ln) { lastName = ln; }

    std::string getPhoneNumber() const { return phoneNumber; }
    void setPhoneNumber(const std::string &phone) { phoneNumber = phone; }

    std::string getAddress() const { return address; }
    void setAddress(const std::string &addr) { address = addr; }

    void updateProfile()
    {
        std::cout << "Profile ID " << profileId << " updated successfully." << std::endl;
    }
};

#endif