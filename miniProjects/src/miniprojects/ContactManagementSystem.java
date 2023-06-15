package miniprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManagementSystem {
    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.next();
                    
                    System.out.print("Enter contact phone number: ");
                    String phoneNumber = scanner.next();
                    
                    System.out.print("Enter contact email: ");
                    String email = scanner.next();
                    
                    Contact contact = new Contact(name, phoneNumber, email);
                    contactList.add(contact);
                    System.out.println("Contact added successfully!");
                    break;
                    
                case 2:
                    System.out.println("Contact List:");
                    for (Contact c : contactList) {
                        System.out.println("Name: " + c.getName());
                        System.out.println("Phone Number: " + c.getPhoneNumber());
                        System.out.println("Email: " + c.getEmail());
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.next();
                    
                    boolean found = false;
                    for (Contact c : contactList) {
                        if (c.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Contact Found:");
                            System.out.println("Name: " + c.getName());
                            System.out.println("Phone Number: " + c.getPhoneNumber());
                            System.out.println("Email: " + c.getEmail());
                            System.out.println();
                            found = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        System.out.println("Contact not found!");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter the name to delete: ");
                    String deleteName = scanner.next();
                    
                    boolean deleted = false;
                    for (Contact c : contactList) {
                        if (c.getName().equalsIgnoreCase(deleteName)) {
                            contactList.remove(c);
                            System.out.println("Contact deleted successfully!");
                            deleted = true;
                            break;
                        }
                    }
                    
                    if (!deleted) {
                        System.out.println("Contact not found!");
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

class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
}
