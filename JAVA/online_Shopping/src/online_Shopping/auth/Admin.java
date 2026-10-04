/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Admin class demonstrating Inheritance (IS-A relationship with User).
 */

package online_Shopping.auth;

public class Admin extends User {
    // Specific attribute for Admin
    private String roleLevel;

    // Constructors
    public Admin() {
        super();
    }

    public Admin(int userId, String email, String passwordHash, String roleLevel) {
        super(userId, email, passwordHash); // Calling parent class constructor
        this.roleLevel = roleLevel;
    }

    // Getter and Setter
    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }

    // Admin specific operations
    public void createCategory() {
        System.out.println("Admin created category.");
    }

    public void updateCategory() {
        System.out.println("Admin updated category.");
    }

    public void deleteCategory() {
        System.out.println("Admin deleted category.");
    }

    public void manageUsers() {
        System.out.println("Admin managing system users.");
    }
}