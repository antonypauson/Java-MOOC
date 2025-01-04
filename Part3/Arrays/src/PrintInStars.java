public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int num: array) {
            printStars(num);
            System.out.println("");
        }
    }

    public static void printStars(int num) {
        while (num > 0) {
            System.out.print("*");
            num--;
        }
    }
}
