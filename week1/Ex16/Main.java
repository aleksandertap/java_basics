package week1.Ex16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number % 2 == 0 ){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
