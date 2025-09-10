package week3;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name");
        String name = sc.nextLine();
        System.out.println("Number of characters:" + nameLength(name));
    }
    public static int nameLength(String text) {
        return text.length();
    }
}
