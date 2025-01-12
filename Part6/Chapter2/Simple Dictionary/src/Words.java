public class Words {
    private String word;
    private String translate;

    public Words(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }

    public String getTranslate() {
        return this.translate;
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        return word + ": " + translate;
    }
}
