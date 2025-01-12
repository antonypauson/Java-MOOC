import java.util.Scanner;
//Write a word: carrot
//Write a word: turnip
//Write a word: potato---
//Write a word: celery
//Write a word: potato---
//You wrote the same word twice!

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet set = new WordSet();
        UserInterface ui = new UserInterface(set,  scanner);
        ui.start();


    }
}
