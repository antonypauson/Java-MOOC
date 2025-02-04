import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        String string = " antony ";
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printer.printManyTimes(string, 2);
        printer.printManyTimes(words, 2);

        printer.printCharacters(string);

    }
}