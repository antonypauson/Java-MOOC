import java.util.ArrayList;
import java.util.Scanner;

public class Archive {
    private String identifier, name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return identifier + ": " + name;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedItem = (Archive) compared;
        return comparedItem.identifier.equals(this.identifier)
                && comparedItem.name.equals(this.name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive singleArchive = new Archive(identifier, name);

            if (!(archives.contains(singleArchive))) {
                archives.add(singleArchive);
            }
        }

        System.out.println("==ITEMS==");
        for (Archive archive : archives) {
            System.out.println(archive);
        }
    }
}
