import java.util.Scanner;

public class WhereToWhere {
    public static void main(String[] args) {
        //say where you want to start from
        //say where you want to end at
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int to = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from?");
        int from = Integer.parseInt(scanner.nextLine());

        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }

    }
}
