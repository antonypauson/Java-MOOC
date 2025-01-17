public class Song {
    private String name;
    private int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }

    public static void main(String[] args) {
        Song garden = new Song("In the Garden", 1910);

        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds");
    }
}
