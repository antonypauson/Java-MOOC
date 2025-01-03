import java.util.Scanner;
//exit if 0
//print total number of inputted numbers
public class NumberofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            nums += 1;
        }
        System.out.println("Number of numbers: " + nums);
    }
}
