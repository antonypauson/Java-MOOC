import java.util.HashMap;

public class Program2 {
    public static void main(String[] args) {
        HashMap<String, Book> hashMap = new HashMap<>();
        hashMap.put("sense", new Book("Sense and Sensibility", "...", 1811));
        hashMap.put("prejudice", new Book("Pride and Prejudice", "....", 1813));

        printValues(hashMap);
        System.out.println("---");
        printValueIfNameContains(hashMap, "prejud");
    }

    public static void printValues(HashMap <String, Book> hashMap) {
        for (Book book : hashMap.values()) {
            String bookName = book.getName();
            String bookContent = book.getContent();
            int bookyear = book.getPublished();

            System.out.println("Name: " + bookName + " (" + bookyear + ")");
            System.out.println("Contents: " + bookContent);
        }
    }

    public static void printValueIfNameContains(HashMap <String, Book> hashMap, String text) {
        text = text.toLowerCase().trim();

        for (Book book : hashMap.values()) {
            if (!book.getName().toLowerCase().trim().contains(text)) {
                continue;
            }
            String bookName = book.getName();
            String bookContent = book.getContent();
            int bookyear = book.getPublished();

            System.out.println("Name: " + bookName + " (" + bookyear + ")");
            System.out.println("Contents: " + bookContent);
        }
    }
}
