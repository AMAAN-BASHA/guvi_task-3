import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to replace a book by ID
    public void replaceBook(int bookID, String newTitle, String newAuthor) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Method to search for a book by ID
    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    // Method to display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
