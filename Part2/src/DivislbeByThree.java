public class DivislbeByThree {
    public static void main(String[] args) {
        divsibleByThreeInRange(3, 6);
    }

    private static void divsibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
