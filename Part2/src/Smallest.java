public class Smallest {
    public static void main(String[] args) {
        //smallest of two numbers
        //from method parameters
        int answer = smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }

    public static int smallest(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }
}
