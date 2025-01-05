import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInAFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchKeyword = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                names.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed");
        }

        boolean isFound = false;
        for (String name : names) {
            if (name.equals(searchKeyword)) {
                System.out.println("Found!");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Not found!");
        }
    }
}
