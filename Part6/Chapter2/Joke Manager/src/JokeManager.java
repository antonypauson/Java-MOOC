import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply!");
        }
        Random rand = new Random();
        int randIndex = rand.nextInt(jokes.size());
        return this.jokes.get(randIndex);
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");

        System.out.println("Drawing jokes:");
        for (int i = 0; i < 5; i++) {
            System.out.println(manager.drawJoke());
        }

        System.out.println("Printing jokes:");
        manager.printJokes();
    }
}
