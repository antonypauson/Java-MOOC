import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Steve Jobs", "biography", 1982);
        Book book2 = new Book("Bill Gates", "biography", 1999);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        System.out.println(get(books, "Steve Jobs").getPublished());
    }

    public static Book get(ArrayList<Book> books, String name) {
        for (Book book : books) {
            if (book.getName().equals("Steve Jobs")) {
                return book;
            }
        }
        return null;
    }
}
