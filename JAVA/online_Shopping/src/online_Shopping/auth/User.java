/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: User base class implementing encapsulation with private data members 
 * and public getters/setters. Subclasses Admin, Seller, and Buyer inherit from this.
 */

package online_Shopping.auth;

/**
 * Base User entity representing an authenticated account within the system.
 * Serves as the superclass for specific personas such as Admin, Seller, and Buyer.
 *
 * @author Ravi Chauhan (Roll No: 37)
 * @version 1.1
 */
public class User {
    // Encapsulation: Private data members
    private int userId;
    private String email;
    private String passwordHash;

    /**
     * Default constructor initializing an empty User instance.
     */
    public User() {
    }

    /**
     * Parameterized constructor to initialize a User with full credentials.
     *
     * @param userId       unique identifier for the user account
     * @param email        user's email address
     * @param passwordHash hashed secret credential for authentication
     */
    public User(int userId, String email, String passwordHash) {
        this.userId = userId;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    // ==========================================
    // GETTERS & SETTERS (Encapsulation)
    // ==========================================

    /**
     * Gets the unique user ID.
     *
     * @return the integer user ID
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the unique user ID.
     *
     * @param userId the integer user ID to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets the user's email address.
     *
     * @return the email string
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email address with basic validation.
     *
     * @param email the email string to set
     */
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email.trim();
        } else {
            System.err.println("Warning: Invalid email format provided for User ID: " + this.userId);
            this.email = email;
        }
    }

    /**
     * Gets the stored password hash.
     *
     * @return the password hash string
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Sets the stored password hash.
     *
     * @param passwordHash the hashed password string
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    // ==========================================
    // MEMBER METHODS & BEHAVIORS
    // ==========================================

    /**
     * Simulates authentication verification for the current user.
     *
     * @return true if credentials are valid, false otherwise
     */
    public boolean login() {
        if (this.email == null || this.passwordHash == null) {
            System.out.println("Login failed: Missing email or password credentials.");
            return false;
        }
        System.out.println("Checking login for user: " + this.email);
        return true;
    }

    /**
     * Verifies an incoming raw password against the stored credential.
     *
     * @param inputPassword plain text password entered by user
     * @return true if matched, false otherwise
     */
    public boolean verifyPassword(String inputPassword) {
        return inputPassword != null && inputPassword.equals(this.passwordHash);
    }

    /**
     * Terminates the active user session.
     */
    public void logout() {
        System.out.println("User [ID: " + this.userId + ", Email: " + this.email + "] logged out successfully.");
    }

    /**
     * Triggers a recovery link dispatch to the registered email.
     *
     * @return true if dispatch was initiated, false if email is absent
     */
    public boolean resetPassword() {
        if (this.email == null || this.email.isEmpty()) {
            System.out.println("Password reset aborted: No email on file.");
            return false;
        }
        System.out.println("Password reset link sent to: " + this.email);
        return true;
    }

    /**
     * Returns a safe string representation of the User without leaking credentials.
     *
     * @return summary string of the User instance
     */
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                '}';
    }
}