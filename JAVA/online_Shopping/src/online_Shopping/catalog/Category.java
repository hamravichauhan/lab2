/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Category class for organizing products into groups in the catalog.
 */

package online_Shopping.catalog;

public class Category {
    // Encapsulation: Private data members
    private int categoryId;
    private String name;
    private String description;

    // Default Constructor
    public Category() {
    }

    // Parameterized Constructor
    public Category(int categoryId, String name, String description) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Methods from Class Diagram
    public void getProducts() {
        System.out.println("Fetching all products for category: " + this.name);
    }
}