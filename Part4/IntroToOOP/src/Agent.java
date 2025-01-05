public class Agent {
    private String firstName, lastName;

    public Agent(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }



    public String toString() {
        return "My name is " + this.lastName+ ", " + this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");

//        bond.print();
        bond.toString(); //prints nothing
        System.out.println(bond);
    }
}
