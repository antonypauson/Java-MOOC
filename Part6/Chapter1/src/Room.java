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

    //finding the shortest person in the room
    public PersonII shortest() {
        if (people.isEmpty()) {
            return null;
        }

        PersonII shortestPerson = people.get(0);
        for (PersonII person : people) {
            if (shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public PersonII take() {
        PersonII shortestPerson = this.shortest();

        if (shortestPerson == null) {
            return null;
        }

        people.remove(shortestPerson);
        return shortestPerson;
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

//        System.out.println("Shortest: " + room.take());
        System.out.println();

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
