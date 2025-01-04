public class AdvancedAstrology {
    public static void main(String[] args) {
//        printTriangle(4);
        christmasTree(10);
    }

    private static void christmasTree(int height) {
        int odd = 1;
        int layer =  height - 1;
        while (height > 0) {
            printSpaces(layer);
            printStars(odd);
            odd += 2;
            height--;
            layer--;
        }
        int j = 0;
        for (int i = 5; i <= odd - 2; i+=2){
            j += 1;
        }
        printRectangle(3,2,j);


    }

    private static void printRectangle(int width, int height, int j) {
        while (height > 0) {
            printSpaces(j);
            printStars(width);
            height--;
        }
    }


    public static void printSpaces(int number) {
        while (number > 0){
            System.out.print(" ");
            number--;
        }
    }

    public static void printStars(int size) {
        while (size > 0) {
            System.out.print("*");
            size--;
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        int newSize = size;
        for (int i = 1; i <= size; i++) {
            printSpaces(newSize - 1);
            printStars(i);
            newSize--;
        }
    }
}
