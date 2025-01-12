import java.util.ArrayList;

public class SimpleCollection {
    private ArrayList<String> collection;

    public SimpleCollection(String something) {
        this.collection = new ArrayList<>();
    }

    public void add(String s) {
        collection.add(s);
    }
    public String toString() {
        if (collection.isEmpty()) {
            return "The collection alphabet is empty";
        }
        String printOut = "The collection alphabet has " +
                collection.size() + " elements:";

        String output = "\n";
        for (String each : collection) {
            output += each + "\n";
        }
        return printOut + output;
    }

    public String longest() {
        String longestElement = collection.get(0);

        for (String element: collection) {
            if (longestElement.length() < element.length()) {
                longestElement = element;
            }
        }
        return longestElement;
    }
    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alpha");
        System.out.println(s);
        s.add("a");

        s.add("bcom");

        s.add("cat");
        System.out.println(s);
        System.out.println("Longest: " + s.longest());

    }
}
