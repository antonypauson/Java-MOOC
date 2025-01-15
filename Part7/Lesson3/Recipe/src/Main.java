import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Recipe recipe = new Recipe();
        UI ui = new UI(scanner,recipe);
        ui.start();
    }
}
