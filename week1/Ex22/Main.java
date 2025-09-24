package week1.Ex22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "carrot";
        while(true) {
            System.out.print("Type a password: ");
            String guess =  sc.nextLine();
            if(guess.equals(password)) {
                System.out.println("Right!");
                break;
            } else  {
                System.out.println("Wrong!");
            }
        }

        System.out.println("something secret here: ree");

    }
}
