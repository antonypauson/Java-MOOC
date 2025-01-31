import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List interface
        List<String> strings = new ArrayList<>();

        //Map interface
        Map<String, String> maps = new HashMap<>();
        maps.put("ganbatte", "good luck");
        maps.put("hai", "yes");

        for (String key : maps.keySet()) {
            System.out.println(key + ": " + maps.get(key));
        }

        //Set interface
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("second");
        names.add("first");
        names.add("second");
        names.add("first");
        names.add("second");
        names.add("first");
        names.add("second");

        System.out.println("size of the set: " + names.size());
        for (String name : names) {
            System.out.println(name);
        }

        //Collection interface
        System.out.println("Collection Interface");
        Map<String, String> translations = new HashMap<>();
        translations.put("ganbatte", "good luck");
        translations.put("hai", "yes");

        Set<String> keys = translations.keySet();
        Collection<String> keyCollection = keys;

        System.out.println("Keys:");
        for (String key: keyCollection) {
            System.out.println(key);
        }
        System.out.println("Values:");
        Collection<String> values = translations.values();

        for (String value : values) {
            System.out.println(value);
        }
    }
}
