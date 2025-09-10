package week3;

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(i + 1 + ". character: " + name.charAt(i));
        }
    }
}
