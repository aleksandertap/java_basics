package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(true){
            System.out.print("Enter word: ");
            String word = sc.nextLine();
            if(word.isEmpty()){
                break;
            }
            words.add(word);
        }
        Collections.sort(words);
        System.out.println("You typed the following words");
        for(String word : words){
            System.out.println(word);
        }
    }
}
