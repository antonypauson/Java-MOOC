import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformation {
    private String firstname, lastname;
    private int identifyNum;

    public PersonalInformation(String fname, String lname, int id) {
        this.firstname = fname;
        this.lastname = lname;
        this.identifyNum = id;
    }

    public String toString() {
        return this.firstname + " " + this.lastname;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<PersonalInformation> infoList = new ArrayList<>();

        while (true) {
            System.out.println("First name:");
            String fname = scanner.nextLine();

            if (fname.isEmpty()) {
                break;
            }

            System.out.println("Last name:");
            String lname = scanner.nextLine();
            System.out.println("Identification number:");
            int idNum = Integer.parseInt(scanner.nextLine());

            PersonalInformation person = new PersonalInformation(fname, lname, idNum);

            infoList.add(person);
        }

        for (PersonalInformation person : infoList) {
            System.out.println(person);
        }
    }
}
