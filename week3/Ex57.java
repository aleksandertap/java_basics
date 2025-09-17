package week3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Type a word: ");
            String word = sc.nextLine();
            words.add(word);
            if(word.isEmpty()){
                break;
            }


        }
        System.out.println("you typed these words:");
        for(String word : words){
            System.out.println(word);
        }
    }
}
