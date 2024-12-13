package bigprojects;

import java.util.ArrayList;
import java.util.List;

//Bookstore class
public class Bookstore {
private String name;
private List<Book> books;

public Bookstore(String name) {
   this.name = name;
   this.books = new ArrayList<>();
}

public void addBook(Book book) {
   books.add(book);
}

public Book searchBook(String title) {
   for (Book book : books) {
       if (book.getTitle().equalsIgnoreCase(title)) {
           return book;
       }
   }
   return null;
}

public void displayBooks() {
   System.out.println("Books in " + name + ":");
   for (Book book : books) {
       System.out.println(book);
   }
}
}