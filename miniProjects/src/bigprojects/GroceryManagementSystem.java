package bigprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryManagementSystem {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Exit");
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

                    Product product = new Product(name, price, quantity);
                    productList.add(product);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.println("Product List:");
                    for (Product p : productList) {
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
                    for (Product p : productList) {
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
                    System.out.print("Enter the name to remove: ");
                    String removeName = scanner.next();

                    boolean removed = false;
                    for (Product p : productList) {
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

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
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
