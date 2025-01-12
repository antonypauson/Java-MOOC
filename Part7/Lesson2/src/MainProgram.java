public class MainProgram {


    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[smallestIndex] > table[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    public static void main(String[] args) {
        int[] numbers = { 9, 8, 12};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
    }
}
