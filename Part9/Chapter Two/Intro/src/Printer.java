import java.util.ArrayList;

public class Printer {
    public void print(Readable readable) {
        System.out.println(readable.read());
    }

    public static void main(String[] args) {
        TextMessage message = new TextMessage("ope", "This is my content");

        ArrayList<String> pages = new ArrayList<>();
        pages.add("WOWO");
        pages.add("YOYUOYO");
        pages.add("HIHIH");

        Ebook book = new Ebook("My ebook", pages);

        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);
    }
}
