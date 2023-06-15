package bigprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryManagementSystem1 {
    public static void main(String[] args) {
        List<Product2> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product Details");
            System.out.println("5. Remove Product");
            System.out.println("6. Calculate Total Value");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();

                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();

                    Product2 product = new Product2(name, price, quantity);
                    productList.add(product);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.println("Product List:");
                    for (Product2 p : productList) {
                        System.out.println("Name: " + p.getName());
                        System.out.println("Price: $" + p.getPrice());
                        System.out.println("Quantity: " + p.getQuantity());
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.next();

                    boolean found = false;
                    for (Product2 p : productList) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Product Found:");
                            System.out.println("Name: " + p.getName());
                            System.out.println("Price: $" + p.getPrice());
                            System.out.println("Quantity: " + p.getQuantity());
                            System.out.println();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter the name to update: ");
                    String updateName = scanner.next();

                    boolean updated = false;
                    for (Product2 p : productList) {
                        if (p.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new price: ");
                            double newPrice = scanner.nextDouble();

                            System.out.print("Enter new quantity: ");
                            int newQuantity = scanner.nextInt();

                            p.setPrice(newPrice);
                            p.setQuantity(newQuantity);
                            System.out.println("Product details updated successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Product not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter the name to remove: ");
                    String removeName = scanner.next();

                    boolean removed = false;
                    for (Product2 p : productList) {
                        if (p.getName().equalsIgnoreCase(removeName)) {
                            productList.remove(p);
                            System.out.println("Product removed successfully!");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Product not found!");
                    }
                    break;

                case 6:
                    double totalValue = 0;
                    for (Product2 p : productList) {
                        totalValue += p.getPrice() * p.getQuantity();
                    }
                    System.out.println("Total value of products: $" + totalValue);
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}

class Product2 {
    private String name;
    private double price;
    private int quantity;

    public Product2(String name, double price, int quantity) {
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
