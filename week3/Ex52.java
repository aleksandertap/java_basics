package week3;

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.print("In reverse order: " );
        for (int i = name.length(); i > 0; i--) {
            System.out.print(name.charAt(i-1));
        }

    }
}
