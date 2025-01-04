import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        //name,age format csv data
        //find the name of the oldest person

        Scanner scanner = new Scanner(System.in);
        int age,oldest = -1;
        String name = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] data = input.split(",");
            age = Integer.valueOf(data[1]);
            if (oldest < age) {
                oldest = age;
                name = data[0];
            }
        }
        System.out.println("Name of the oldest: " + name + "\n" + "Age: " + oldest);

    }
}
