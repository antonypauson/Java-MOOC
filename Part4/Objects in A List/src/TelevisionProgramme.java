import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgramme {
    private String name;
    private int duration;

    public TelevisionProgramme(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public String toString() {
        return this.name + ", " + this.duration;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgramme> programs = new ArrayList<>();

        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Duration:");
            int duration = Integer.parseInt(scanner.nextLine());

            TelevisionProgramme singleProgram = new TelevisionProgramme(name, duration);
            programs.add(singleProgram);
        }

        System.out.println("Program's maximum duration? ");
        int searchDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgramme program : programs) {
            if (program.getDuration() <= searchDuration){
                System.out.println(program);
            }
        }
    }
}
