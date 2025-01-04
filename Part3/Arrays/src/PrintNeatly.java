public class PrintNeatly {
    public static void main(String[] args) {
        //print elements in an array with commas
        //don't put comma for the last element
        int[] array = {5, 1, 3, 4, 2,};
        printNeatly(array);
    }

    public static void printNeatly(int[] myArray) {
        for (int num: myArray) {
            if (num == myArray[myArray.length - 1]){
                System.out.print(num);
            } else {
                System.out.print(num + ",");
            }
        }
    }
}
