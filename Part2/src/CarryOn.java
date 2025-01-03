import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        //shall we carry on?
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Shall we carry on?");
            String ans = scanner.nextLine();

            if (ans.equals("no")) {
                break;
            }
        }
    }
}
