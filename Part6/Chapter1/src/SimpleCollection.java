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
    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alpha");
        System.out.println(s);

        s.add("a");
        System.out.println(s);
        s.add("b");
        System.out.println(s);

        s.add("c");
        System.out.println(s);
    }
}
