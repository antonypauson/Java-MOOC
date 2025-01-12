public class PersonII {
    private String name;
    private int height;

    public PersonII(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        return name + "(" + height + "cm)";
    }

    public int getHeight() {
        return height;
    }
}
