import java.util.Scanner;

public class SumOfASequenceSequel {
    //finding sum of a sequence
    //but we give lower and upper limit
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int last = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
