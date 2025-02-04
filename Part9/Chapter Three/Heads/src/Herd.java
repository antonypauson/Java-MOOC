import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public String toString() {
        String output = "";
        for (Movable organism : herd) {
            output += organism.toString();
            output += "\n";
        }
        return output;
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {

    }
}
