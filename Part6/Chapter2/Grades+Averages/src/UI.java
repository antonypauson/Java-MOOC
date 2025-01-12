import java.util.Scanner;

public class UI {

    private Scanner scanner;
    private GradeRegister register;

    public UI(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        readPoints();
        printGradeDistro();
    }

    public void readPoints() {

        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradesBasedOnPoints(points);
        }
    }

    public void printGradeDistro() {

        for (int i = 5 ; i >= 0; i--) {
            int stars = this.register.numberOfGrades(i);
            System.out.print(i + ": ");
            printStars(stars);
            System.out.println("");
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
