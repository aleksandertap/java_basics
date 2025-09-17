package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Type a word: ");
            String word = sc.nextLine();
            if(words.contains(word)){
                break;
            }
            words.add(word);

        }
        System.out.println("you gave this word already");
    }
}
