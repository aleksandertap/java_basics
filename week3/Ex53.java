package week3;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word");
        String word = sc.nextLine();
        System.out.println("Length of the first part");
        int length = sc.nextInt();
        System.out.print("Result: " + word.substring(0,length));
    }
}
