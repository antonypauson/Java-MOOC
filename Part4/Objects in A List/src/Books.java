import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    private String title;
    private int numOfPages, pubYear;

    public Books (String title, int numOfPages, int pubYear) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.pubYear = pubYear;
    }

    public String toString() {
        return this.title + ", " + this.numOfPages + " pages, " + this.pubYear;
    }

    public String getNameOnly() {
        return this.title;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication Year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Books singleBook = new Books(bookTitle, numberOfPages, publicationYear);

            books.add(singleBook);
        }

        System.out.println("What information will be printed?");
        String infoToBePrinted = scanner.nextLine();

        if (infoToBePrinted.equals("everything")) {
            for (Books book : books) {
                System.out.println(book);
            }
        } else {
            for (Books book : books) {
                System.out.println(book.getNameOnly());
            }
        }

    }
}
