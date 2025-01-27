import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Book bookObject = new Book("Book Object", "the content goes here", 2002);
//        Book anotherObject = bookObject;

//        if (bookObject.equals(anotherObject)) {
//            System.out.println("The books are the same");
//        } else {
//            System.out.println("The books aren't the same");
//        }

//        anotherObject = new Book("Book Object", "the content goes here", 2002);

//        if (bookObject.equals(anotherObject)) {
//            System.out.println("The books are the same");
//        } else {
//            System.out.println("The books aren't the same");
//        }

        HashMap<Book, String> borrowers = new HashMap<>();

        borrowers.put(bookObject, "Pekka");
        borrowers.put(new Book("Book No. 2", "....", 1999), "Arto");

        System.out.println(borrowers.get(bookObject));
        System.out.println(borrowers.get(new Book("Book Object", "the content goes here", 2002)));
        System.out.println(borrowers.get(new Book("Book No. 2", "....", 1999)));
    }
}
