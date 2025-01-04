import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        //read name and ages from user until empty line
        //name,age format
        //print the age of the oldest person
        Scanner scanner = new Scanner(System.in);
        int oldest = -1,age=-1;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            age = Integer.valueOf(data[1]);
            if (oldest < age) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + age);
    }
}
