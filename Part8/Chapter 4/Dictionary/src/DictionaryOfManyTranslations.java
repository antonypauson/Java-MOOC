import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());
        this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (this.translations.keySet().contains(word)) {
            return this.translations.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        if (this.translations.keySet().contains(word)) {
            this.translations.remove(word);
        }
    }

    public static void main(String[] args) {
        DictionaryOfManyTranslations dict = new DictionaryOfManyTranslations();
        dict.add("lie", "maata");
        dict.add("lie", "valehdella");

        System.out.println(dict.translate("lie"));
    }
}
