import java.util.ArrayList;

public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;

    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }

        this.visitors++;
        this.riding.add(person);
        return true;
    }


    public String toString() {
        String printOutput = this.name + ", minimum height requirement: " + this.minimumHeight +
                ", visitors: " + this.visitors + "\n";

        if (riding.isEmpty()) {
            return printOutput + "none in the ride";
        }

        String peopleOnRide = "";

        for (Person person : riding) {
            peopleOnRide += person.getName() + "\n";
        }
        return printOutput + peopleOnRide;
    }

    public void removeEveryoneOnRide() {
        this.riding.clear();
    }

    public double averageHeightOfPeopleOnRide() {
        if (riding.isEmpty()) {
            return -1;
        }

        int sumOfHeights = 0;
        for (Person person : riding) {
            sumOfHeights += person.getHeight();
        }

        return (double) sumOfHeights / riding.size();
    }

    public Person getTallest() {

        if (this.riding.isEmpty()) {
            return null;
        }

        Person tallestPerson = riding.get(0); //initially the first rider

        for (Person person : riding) {

            if (person.getHeight() > tallestPerson.getHeight()) {
                tallestPerson = person;
            }
        }

        return tallestPerson;
    }
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(180);

        Person jj = new Person("JJ");
        jj.setHeight(132);
        jj.setWeight(34);

        Person awak = new Person("Awak");
        awak.setHeight(194);

        AmusementParkRide ride1 = new AmusementParkRide("RIDE 1", 140);
        System.out.println(ride1);

        ride1.isAllowedOn(matti);
        ride1.isAllowedOn(jj);
        ride1.isAllowedOn(awak);

        System.out.println(ride1);
        System.out.println(ride1.averageHeightOfPeopleOnRide());

        System.out.println(ride1.getTallest().getName());
    }
}
