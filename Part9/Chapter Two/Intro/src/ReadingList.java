import java.util.ArrayList;

public class ReadingList implements Readable{

    private ArrayList<Readable> readables;

    public ReadingList() {
        this.readables = new ArrayList<>();
    }

    public void add(Readable readable) {
        this.readables.add((readable));
    }

    public int toRead() {
        return this.readables.size();
    }

    public String read() {
        String read = "";

        for (Readable readable: this.readables) {
            read = read + readable.read() + "\n";
        }

        this.readables.clear();
        return read;
    }

    public static void main(String[] args) {
        ReadingList joinList = new ReadingList();
        joinList.add(new TextMessage("arto", "What's Popping?"));
        joinList.add(new TextMessage("arto", "Another One bites the dust!"));

        System.out.println(joinList.read());
    }
}
