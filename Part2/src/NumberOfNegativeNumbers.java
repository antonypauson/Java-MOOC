import java.util.Scanner;

//exit if 0
//total number of negative numbers
public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negatives = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num < 0) {
                negatives += 1;
            }
        }
        System.out.println("Number of negative numbers: " + negatives);
    }
}
