import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExcercises;

    public TaskTracker() {
        this.completedExcercises = new HashMap<>();
    }

    public void add (String user, int exercise) {
        this.completedExcercises.putIfAbsent(user, new ArrayList<>());

        this.completedExcercises.get(user).add(exercise);
    }

    public void print() {
        for (String name : completedExcercises.keySet()) {
            System.out.println(name + " : " + completedExcercises.get(name));
        }
    }

    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        tracker.add("Ada", 3);
        tracker.add("Ada", 4);
        tracker.add("Ada", 3);
        tracker.add("Ada", 3);

        tracker.add("Pekka", 4);
        tracker.add("Pekka", 4);

        tracker.add("Matti", 1);
        tracker.add("Matti", 2);

        tracker.print();
    }
}
