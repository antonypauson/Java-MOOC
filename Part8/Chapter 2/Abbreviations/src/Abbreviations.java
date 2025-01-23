import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbrevations;

    public Abbreviations() {
        this.abbrevations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        String key = sanitizedString(abbreviation);

        if (abbrevations.containsKey(key)) {
            System.out.println("Already there! So not possible");
        } else {
            abbrevations.put(key, explanation);
            System.out.println("Added " + abbreviation + " to the map");
        }
    }

    public static String sanitizedString(String string) {
        String lowerCase = string.toLowerCase();
        return lowerCase.trim();
    }

    public boolean hasAbbreviation(String abbre) {
        abbre = sanitizedString(abbre);

        return abbrevations.containsKey(abbre);
    }

    public String findExplanationFor(String abbre) {
        if (abbrevations.containsKey(abbre)) {
            return abbrevations.get(abbre);
        }
        return null;
    }

    public static void main(String[] args) {
        Abbreviations hmap = new Abbreviations();
        hmap.addAbbreviation("e.g.", "for example");
        hmap.addAbbreviation("etc.", "and so on");
        hmap.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            String explanation = "";
            if (hmap.hasAbbreviation(part)) {
                explanation = hmap.findExplanationFor(part);
            }

            System.out.println(explanation);
        }
    }
}
