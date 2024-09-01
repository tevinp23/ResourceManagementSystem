import java.util.*;
/**
 * Main class for the book management system.
 * The user can add, remove, update, view, and search books.
 * The program uses HashMap to store the books.
 * The ISBN is used as the key.
 * @author Tevin Parathattal
 */
public class Main {
        /**
         * Main entry point for the program.
         * This is the main menu for the Book Resource Management System.
         * The user can add, remove, update, view, and search books.
         * The program uses HashMap to store the books.
         * The ISBN is used as the key.
         * @param args command line arguments
         */

    public static void main(String[] args) {
        BookManagementSystem brms = new BookManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Book Resource Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book Availability");
            System.out.println("4. View All Books");
            System.out.println("5. Search Book by ISBN");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    brms.addBook(title, author, isbn);
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    brms.removeBook(isbnToRemove);
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to update availability: ");
                    String isbnToUpdate = scanner.nextLine();
                    System.out.print("Is the book available? (true/false): ");
                    boolean available = scanner.nextBoolean();
                    brms.updateBookAvailability(isbnToUpdate, available);
                    break;
                case 4:
                    brms.viewAllBooks();
                    break;
                case 5:
                    System.out.print("Enter ISBN of the book to search: ");
                    String isbnToSearch = scanner.nextLine();
                    brms.searchBookByIsbn(isbnToSearch);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
/**
 * Class representing a book with title, author, ISBN, and availability.
 */
class Book {
    /** Title of the book */
    private String title;
    /** Author of the book */
    private String author;
    /** ISBN of the book */
    private String isbn;
    /** Availability of the book */
    private boolean available;

    /**
     * Constructs a new Book object with the given title, author, ISBN, and availability.
     * @param title title of the book
     * @param author author of the book
     * @param isbn ISBN of the book
     * @param available availability of the book
     */
    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    /**
     * Returns the ISBN of the book.
     * @return ISBN of the book
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Returns the title of the book.
     * @return title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     * @return author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the availability of the book.
     * @return true if the book is available, false if not
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the availability of the book.
     * @param available true if the book is available, false if not
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Returns a string representation of the book in the format:
     * title by author (ISBN: isbn) - available
     * @return string representation of the book
     */
    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ") - " + (available ? "Available" : "Not Available");
    }
}
/**
 * Class representing the Book Management System.
 * The user can add, remove, update, view, and search books.
 * The program uses HashMap to store the books.
 * The ISBN is used as the key.
 */
class BookManagementSystem {
    private HashMap<String, Book> books = new HashMap<>();

    public void addBook(String title, String author, String isbn) {
        if (books.containsKey(isbn)) {
            System.out.println("A book with this ISBN already exists.");
        } else {
            Book newBook = new Book(title, author, isbn, true);
            books.put(isbn, newBook);
            System.out.println("Book added: " + newBook);
        }
    }


    /**
     * Removes a book from the system.
     * @param isbn ISBN of the book to remove
     */
    public void removeBook(String isbn) {
        if (books.containsKey(isbn)) {
            books.remove(isbn);
            System.out.println("Book with ISBN " + isbn + " has been removed.");
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    /**
     * Updates the availability of a book in the system.
     * @param isbn ISBN of the book to update
     * @param available true if the book is available, false if not
     */
    public void updateBookAvailability(String isbn, boolean available) {
        Book book = books.get(isbn);
        if (book != null) {
            book.setAvailable(available);
            System.out.println("Book availability updated: " + book);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    /**
     * Prints all the books in the system, with their details.
     * If the system contains no books, a message indicating that is printed.
     */
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the system.");
        } else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    /**
     * Searches for a book by its ISBN and prints out the book details if found.
     * If the book is not found, a message indicating that is printed.
     * @param isbn ISBN of the book to search for
     */
    public void searchBookByIsbn(String isbn) {
        Book book = books.get(isbn);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }
}