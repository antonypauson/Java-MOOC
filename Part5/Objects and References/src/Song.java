//we have to compare two songs
//they should output true even if they have different ref addresses

public class Song {
    private String name;
    private String artist;
    private int length;

    public Song(String length, String artist, int name) {
        this.length = name;
        this.artist = artist;
        this.name = length;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        if (comparedSong.name.equals(this.name) &&
                comparedSong.artist.equals(this.artist) &&
                comparedSong.length == (this.length)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Song jackSparrow = new Song("The Lonely Island", "JackSparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "JackSparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal");
        }

    }
}
