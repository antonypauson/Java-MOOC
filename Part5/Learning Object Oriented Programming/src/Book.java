import java.util.Scanner;

public class Book {
    //instance variables
    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.title = name;
        this.pageCount = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return title;
    }

    public int getPages() {
        return pageCount;
    }

    public String toString() {
        return author + ", " + title + ", " + pageCount + " pages";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author:");
        String authorName = scanner.nextLine();
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter pages:");
        int pageNum = Integer.parseInt(scanner.nextLine());

        Book book = new Book(authorName, title, pageNum);
        System.out.println(book);

    }
}
