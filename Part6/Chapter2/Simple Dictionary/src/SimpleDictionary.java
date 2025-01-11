import java.util.ArrayList;

public class SimpleDictionary {
    private ArrayList<Words> words;

    public SimpleDictionary() {
        words = new ArrayList<>();
    }

    public void addToDict(Words word) {
        this.words.add(word);
    }

    public void printAll() {
        for (Words word : words) {
            System.out.println(word);
        }
    }

    public String translate(String search) {
        for (Words word : words) {
            if (word.getWord().equals(search)) {
                return word.getTranslate();
            }
        }
        return "";
    }

}
