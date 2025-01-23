import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        nicknames.put("antony", "tony");

        System.out.println(nicknames.get("matthew"));
        System.out.println(nicknames.get("antony"));

        System.out.println("  Antony Sun  ".toUpperCase().trim());

    }
}
