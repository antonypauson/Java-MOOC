import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        //negative -> unsuitable number
        //zero -> exits the loop
        //positive -> square
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (num > 0) {
                System.out.println(num * num);
            } else {
                break;
            }
        }
    }
}
