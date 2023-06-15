package bigprojects;

//Main class
public class OnlineBookstore {
 public static void main(String[] args) {
     // Create an instance of Bookstore
     Bookstore bookstore = new Bookstore("MyBookstore");

     // Create some books
     Book book1 = new Book("Java Programming", "John Smith", 29.99);
     Book book2 = new Book("Python Basics", "Jane Doe", 19.99);
     Book book3 = new Book("Web Development", "David Johnson", 24.99);

     // Add books to the bookstore
     bookstore.addBook(book1);
     bookstore.addBook(book2);
     bookstore.addBook(book3);

     // Display all books in the bookstore
     bookstore.displayBooks();

     // Search for a book
     Book foundBook = bookstore.searchBook("Java Programming");
     if (foundBook != null) {
         System.out.println("Book found:");
         System.out.println(foundBook);
     } else {
         System.out.println("Book not found.");
     }
 }




//Book class


 
}
