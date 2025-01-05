import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        //names,birth-year data
        //print the longest name
        //print the average of birth years
        Scanner scanner = new Scanner(System.in);
        int age = -1, sum = 0, dataLength = 0;
        String name,longestName = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            age = Integer.parseInt(data[1]);
            name = data[0];
            sum += age;
            dataLength += 1;
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name:" + longestName);
        System.out.println("Average of birth years: " + (double) sum / dataLength);
    }
}
