import java.util.Scanner;
//program that uses the OOP principle to model the Book
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Replace Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookID, title, author));
                    break;
                case 2:
                    System.out.print("Enter Book ID to replace: ");
                    int replaceID = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    library.replaceBook(replaceID, newTitle, newAuthor);
                    break;
                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchID = scanner.nextInt();
                    Book book = library.searchBook(searchID);
                    if (book != null) {
                        System.out.println(book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
