package bigprojects;

import java.util.ArrayList;
import java.util.List;

public class GroceryManagementSystem2 {
    public static void main(String[] args) {
        List<Product1> productList = new ArrayList<>();

        // Hardcoded products
        productList.add(new Product1("Apple", 0.99, 50));
        productList.add(new Product1("Banana", 0.49, 30));
        productList.add(new Product1("Milk", 2.99, 20));
        productList.add(new Product1("Bread", 1.99, 40));

        // User input products
        Product1 userInputProduct = addProductFromUserInput();
        productList.add(userInputProduct);

        // Display all products
        System.out.println("Product List:");
        for (Product1 p : productList) {
            System.out.println("Name: " + p.getName());
            System.out.println("Price: $" + p.getPrice());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println();
        }
    }

    public static Product1 addProductFromUserInput() {
        // Code to get user input for product details
        // You can use Scanner or any other method to get the user input
        // Here's an example of using hardcoded values for demonstration purposes
        String name = "Orange";
        double price = 0.79;
        int quantity = 35;

        // Create and return the product object
        return new Product1(name, price, quantity);
    }
}

class Product1 {
    private String name;
    private double price;
    private int quantity;

    public Product1(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
