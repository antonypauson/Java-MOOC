import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    private String name;
    private int pubYear;

    public Books(String name, int pubYear) {
        this.name = name;
        this.pubYear = pubYear;
    }

    public String toString() {
        return this.name + "->" + this.pubYear;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Books)) {
            return false;
        }

        Books comparedBook = (Books) compared;

        return comparedBook.pubYear == this.pubYear &&
                comparedBook.name.equals(this.name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop:)");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int year = Integer.parseInt(scanner.nextLine());

            Books book = new Books(bookName, year);
            if (!(books.contains(book))) {
                books.add(book);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }
        }

        for (Books book: books) {
            System.out.println(book);
        }
    }
}
