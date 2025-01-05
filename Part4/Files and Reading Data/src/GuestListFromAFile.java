import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String eachLine = fileReader.nextLine();
                names.add(eachLine);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        while (true) {
            System.out.println("Enter names, an empty line quites:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            boolean nameNotFound = false;
            for (String eachName: names) {
                if (eachName.equals(name)) {
                    System.out.println("The name is on the list");
                    break;
                } else {
                    nameNotFound = true;
                }
            }

            if (nameNotFound) {
                System.out.println("The name is not on the list");
            }
        }

    }
}
