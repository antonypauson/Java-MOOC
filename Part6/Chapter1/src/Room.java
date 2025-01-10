import java.util.ArrayList;
//we are using PersonII class instead of Person class to avoid interference
public class Room {
    private ArrayList<PersonII> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(PersonII person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return this.people.isEmpty();
    }

    public ArrayList<PersonII> getPerson() {
        return this.people;
    }

    public static void main(String[] args) {
        Room room = new Room();
        System.out.println("Empty room? " + room.isEmpty());

        room.add(new PersonII("lea", 183));
        room.add(new PersonII("Kenya", 182));
        room.add(new PersonII("Auli", 186));
        room.add(new PersonII("Nina", 172));
        room.add(new PersonII("Terhi", 185));
        for (PersonII person : room.getPerson()) {
            System.out.println(person);
        }
    }
}
