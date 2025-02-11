import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private GradeRegister register;

    public UI(Scanner scanner, GradeRegister register) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        printAverageOfPoints();
        printAverageOfPassingPoints();
        printPassPercentage();
        printGradeDistribution();
    }

    private String printStars(int grade) {
        String out = "";
        for (int i = grade; i > 0; i--) {
            out += "*";
        }
        return out;
    }

    private void printGradeDistribution() {
        for (int i = 5, j = 0; j < register.getGrades().length; j++,i--) {
            System.out.println(i + ":" + printStars(register.getGrades()[j]));
        }
    }

    private void printPassPercentage() {
        double passPercentage = register.findPassPercentage();
        System.out.println("Pass percentage: " + passPercentage);
    }

    private void printAverageOfPassingPoints() {

        if (register.passingPoints().isEmpty()) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + register.findAverage(register.passingPoints()));
        }
    }

    private void printAverageOfPoints() {
        System.out.println("Point average (all): " + register.findAverage(register.allPoints()));
    }

    public void readPoints() {
        System.out.println("Going to start reading points!");
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int point = Integer.parseInt(scanner.nextLine());

            if (point == -1) {
                break;
            }

            register.addPoints(point);
        }


    }
}
