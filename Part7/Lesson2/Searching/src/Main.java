import java.util.ArrayList;

public class Main {
    private ArrayList<Book> books;

    public Main() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public String toString() {
        String out = "";
        for (Book book : books) {
            out += book.getId() + ":" + book.getName() + "\n";
        }
        return out;
    }

    public static int linearSearch(ArrayList<Book> books, int searchId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchId) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public static int binarySearch(ArrayList<Book> books, int searchId) {
        int begin = 0;
        int end = books.size() - 1;

        while (begin < end) {
            int middle = (begin + end) / 2;
            if (books.get(middle).getId() == searchId) {
                return middle;
            }

            if (books.get(middle).getId() < searchId) {
                begin = middle++;
            }

            if (books.get(middle).getId() > searchId) {
                end = middle--;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Main books = new Main();
        books.add(new Book (101,"First book"));
        books.add(new Book (102,"Second book"));
        books.add(new Book (103,"Third book"));
        books.add(new Book (104,"Fourth book"));

        System.out.println(books);

        System.out.println(Main.linearSearch(books.getBooks(), 103));
        System.out.println(Main.binarySearch(books.getBooks(), 103));
    }
}
