import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReadyMadeSortingAlgos {
    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 6, 2, 11, 12, 80, 3};
        String[] myArray2 = {"Wow", "You", "Jocker"};
        ReadyMadeSortingAlgos.sort(myArray);
        ReadyMadeSortingAlgos.sort(myArray2);

        ArrayList<Integer> myInt = new ArrayList<>();
        ArrayList<String> myString = new ArrayList<>();
        myInt.add(10);
        myInt.add(9);
        myInt.add(1);

        myString.add("wow");
        myString.add("hey");
        myString.add("sheey");

        ReadyMadeSortingAlgos.sortIntegers(myInt);
        ReadyMadeSortingAlgos.sortStrings(myString);
    }
}
