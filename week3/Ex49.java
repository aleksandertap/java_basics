package week3;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name");
        String name = sc.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
    }
    public static char lastCharacter(String text){
        char lastChar = text.charAt(text.length() - 1);
        return lastChar;
    }
}
