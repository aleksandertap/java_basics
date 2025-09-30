package week7.ex7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner scanner;
    private Dictionary dictionary;

    public TextUserInterface(Scanner scanner, Dictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statement:");
        System.out.println("add - adds a word pair to dictionary");
        System.out.println("translate - asks a word and prints translation");
        System.out.println("quit - exit this");
        while(true){
            System.out.print("Statement: ");
            String statement = this.scanner.nextLine();
            switch (statement) {
                case "quit":
                    System.out.println("Cheers!");
                    return;
                case "add": {
                    System.out.print("in estonian:");
                    String word = this.scanner.nextLine();
                    System.out.print("Translation:");
                    String translation = this.scanner.nextLine();
                    this.dictionary.add(word, translation);
                    break;
                }
                case "translate": {
                    System.out.print("Give a word:");
                    String word = this.scanner.nextLine();
                    System.out.println("Translation: " + this.dictionary.translate(word));
                    break;
                }
                default:
                    System.out.println("Unknown statement!");
                    break;
            }
        }
    }
}
