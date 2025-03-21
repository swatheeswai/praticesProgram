import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    private String bookTitle;  // Corrected variable names
    private String bookAuthor;

    // Constructor
    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    // Setters
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    // Getters
    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }
}

// Library class
class Library {
    private ArrayList<Book> books;  // List to store books

    // Constructor
    public Library() {
        books = new ArrayList<Book>();  // Initialize the ArrayList
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book by title
    public boolean removeBook(String title) {
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                return true; // Book found and removed
            }
        }
        return false; // Book not found
    }

    // Method to get the list of books
    public ArrayList<Book> getBooks() {
        return books;
    }
}

// Main class
public class LibraryProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Initialize scanner for user input

        // Create an array of books
        Book[] bk = new Book[5];  
        bk[0] = new Book("Java", "James Gosling");
        bk[1] = new Book("Ben Hur", "Lewis Wallace");
        bk[2] = new Book("The Catcher in the Rye", "J.D. Salinger");
        bk[3] = new Book("1984", "George Orwell");
        bk[4] = new Book("To Kill a Mockingbird", "Harper Lee");
        
        // Create a Library instance
        Library lib = new Library();
        for (Book book : bk) {
            lib.addBook(book);  // Use the instance to add books
        }

        // Display all books in the library
        System.out.println("Books in the library:");
        for (Book book : lib.getBooks()) {
            System.out.println("Book Title: " + book.getBookTitle() + ", Book Author: " + book.getBookAuthor());
        }

        System.out.println("***************************************************************************");
        System.out.println("Enter the title of the book to remove from your cart:");
        String delete = scan.nextLine();  

        if (lib.removeBook(delete)) {
            System.out.println("Removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
           System.out.println("***************************************************************************");
        // Display remaining books
        System.out.println("Remaining books in the library:");
        for (Book book : lib.getBooks()) {
            System.out.println("Book Title: " + book.getBookTitle() + ", Book Author: " + book.getBookAuthor());
        }

        scan.close();  // Close the scanner
    }
}

