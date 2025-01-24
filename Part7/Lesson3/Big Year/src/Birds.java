import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;

    public Birds() {
        this.birds = new ArrayList<>();
    }

    public void addBirdToBirds(String bName, String lName) {
        birds.add(new Bird(bName, lName));
    }

    public String toString() {
        String output = "";
        for (Bird bird : birds) {
            output += bird + "\n";
        }
        return output;
    }

    public void addObserved(String observedBird) {
        boolean flag = false;
        for (Bird bird : birds) {
            if (bird.getBirdName().equals(observedBird)) {
                bird.incrementObservation();
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not a bird!");
        }
    }
}
