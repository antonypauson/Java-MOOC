import java.util.ArrayList;

public class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public boolean equals(Object compare) {

        if (this == compare) {
            return true;
        }

        if (!(compare instanceof Bird)) {
            return false;
        }

        Bird comparedBird = (Bird) compare;

        return this.name.equals(comparedBird.name);
    }

    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        Bird red = new Bird("Red");

        if (birds.contains(red)) {
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is NOT on the list");
        }

        birds.add(red);
        if (birds.contains(red)) {
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is NOT on the list");
        }

        System.out.println("However!");

        red = new Bird("Red"); //another object which is not in the list
        if (birds.contains(red)) {
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is NOT on the list");
        }

    }
}
