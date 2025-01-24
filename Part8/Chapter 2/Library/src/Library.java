import java.util.HashMap;
import java.util.Locale;

public class Library {
    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        //hashmap with book name as key
        //book as value
        String name = sanitizedString(book.getName());

        if (this.directory.containsKey(name)) {
            System.out.println(book.getName() + " already in the library");
        } else {
            directory.put(name, book);
            System.out.println("Added " + book.getName() + " in library");
        }
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return null;
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (this.directory.containsKey(bookTitle)) {
            this.directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Balarama", "childen's magazine", 1999);
        Book book2 = new Book("Kalikkudukka", "childen's magazine", 1999);
        Book book3 = new Book("Manorama", "adults's magazine", 1999);
        Book book4 = new Book("Balarama", "childen's magazine", 1999);


        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


        System.out.println(library.getBook("bAlarama").getName());
    }

}
