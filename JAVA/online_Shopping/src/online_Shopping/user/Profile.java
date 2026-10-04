/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Profile class holding personal and contact details of the user.
 */

package online_Shopping.user;

public class Profile {
    // Encapsulation: Private data members
    private int profileId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    // Default Constructor
    public Profile() {
    }

    // Parameterized Constructor
    public Profile(int profileId, String firstName, String lastName, String phoneNumber, String address) {
        this.profileId = profileId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getters and Setters
    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Methods from Class Diagram
    public void updateProfile() {
        System.out.println("Profile ID " + this.profileId + " updated successfully.");
    }
}