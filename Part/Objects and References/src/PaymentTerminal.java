public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double cost = 2.50;
        if (payment >= cost) {
            this.money += cost;
            affordableMeals++;
            return payment - cost;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        double cost = 4.30;
        if (payment >= cost) {
            this.money += cost;
            heartyMeals++;
            return payment - cost;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double cost = 2.50;
        if (card.balance() >= cost) {

            affordableMeals++;
            card.takeMoney(cost);
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double cost = 4.30;
        if (card.balance() >= cost) {

            heartyMeals++;
            card.takeMoney(cost);
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();

//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change " + change);

//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//
//        System.out.println(unicafeExactum);

//        PaymentCard annesCard = new PaymentCard(7);
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println(unicafeExactum);


        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
