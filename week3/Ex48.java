package week3;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("First character: " + firstCharacter(name));
    }
    public static char firstCharacter(String text){
        return text.charAt(0);
    }
}
