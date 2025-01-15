import java.util.Scanner;

public class Main {
    public static int findCube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            int num = Integer.parseInt(input);
            System.out.println(findCube(num));
        }
    }


}
