public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        Money addedMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return addedMoney;
    }

    public Money minus(Money decreaser) {
        Money reducedMoney = new Money(this.euros- decreaser.euros, this.cents - decreaser.cents);
        return reducedMoney;
    }

    public boolean lessThan(Money compared) {
        return this.euros < compared.euros;
    }

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);
        System.out.println(a);
        System.out.println(b);

        Money c = a.plus(b);
        System.out.println(c);

        a = a.plus(c);
        System.out.println(a);

        System.out.println(a.lessThan(b));


    }
}
