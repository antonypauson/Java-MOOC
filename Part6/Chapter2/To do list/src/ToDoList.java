import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }
    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        int index = 1;
        for (String task : tasks) {
            System.out.println(index + ":" + task);
            index++;
        }
    }

    public void remove(int number) {
        int index = number - 1;
        tasks.remove(index);
    }

}
