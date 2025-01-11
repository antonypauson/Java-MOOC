public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();

        list.add("get milk");
        list.add("get rich");

        list.print();
        list.remove(2);
        list.print();
    }
}
