public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));
    }

    public static int sumOfNumbersInArray(int[] myArray) {
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        return sum;
    }
}
