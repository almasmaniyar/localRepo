package miniprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.next();
                    
                    System.out.print("Enter book author: ");
                    String author = scanner.next();
                    
                    System.out.print("Enter book publication year: ");
                    int publicationYear = scanner.nextInt();
                    
                    Book book = new Book(title, author, publicationYear);
                    bookList.add(book);
                    System.out.println("Book added successfully!");
                    break;
                    
                case 2:
                    System.out.println("Book List:");
                    for (Book b : bookList) {
                        System.out.println("Title: " + b.getTitle());
                        System.out.println("Author: " + b.getAuthor());
                        System.out.println("Publication Year: " + b.getPublicationYear());
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}

class Book {
    private String title;
    private String author;
    private int publicationYear;
    
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
}
