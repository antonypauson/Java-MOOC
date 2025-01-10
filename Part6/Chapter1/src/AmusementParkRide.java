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
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(180);

        Person jj = new Person("JJ");
        jj.setHeight(132);
        jj.setWeight(34);

        AmusementParkRide ride1 = new AmusementParkRide("RIDE 1", 140);
        System.out.println(ride1);

        ride1.isAllowedOn(matti);
        ride1.isAllowedOn(jj);

        System.out.println(ride1);
    }
}
