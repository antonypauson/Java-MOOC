import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Birds birds = new Birds();
        UI ui = new UI(scanner, birds);
        ui.start();
    }
}
