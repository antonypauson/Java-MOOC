import com.sun.tools.javac.Main;

import java.util.Arrays;

public class MainProgram {

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        int b = array[index2];

        array[index1] = b;
        array[index2] = a;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, smallestIndex,i);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 8};

        MainProgram.sort(numbers);
    }
}
