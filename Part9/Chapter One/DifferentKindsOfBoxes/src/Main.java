public class Main {
    public static void main(String[] args) {
        //Box with Max Weight
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        //One Item Box
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

        //Misplacing Box
        MisplacingBox box1 = new MisplacingBox();
        box1.add(new Item("Saludo", 5));
        box1.add(new Item("Pirkka", 5));

        System.out.println(box1.isInBox(new Item("Saludo")));
        System.out.println(box1.isInBox(new Item("Pirkka")));

    }
}
