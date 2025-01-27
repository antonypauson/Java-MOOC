import java.util.ArrayList;
import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

        phoneNumbers.put("Pekka", new ArrayList<>());
        phoneNumbers.get("Pekka").add("199");
        phoneNumbers.get("Pekka").add("200");

        System.out.println("Pekka's numbers: " + phoneNumbers.get("Pekka"));
    }
}
