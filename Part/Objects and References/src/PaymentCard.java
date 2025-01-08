public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("Money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money " + petesCard.balance());
    }
}
