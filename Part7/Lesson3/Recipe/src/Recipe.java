import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Recipe {
    private Scanner scanner;

    public Recipe(Scanner scanner) {
        this.scanner = scanner;
    }
    public void listRecipe(String file) throws IOException {
        System.out.println("reading file");
        this.scanner = new Scanner(Paths.get(file));

        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            System.out.println(row);
        }
    }
    //do things other than UI here

}
