package week1.Ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNum = input.nextInt();
        System.out.print("type another number: ");
        int secondNum = input.nextInt();

        double division = 1.0*firstNum/secondNum;

        System.out.println("Division: " + division);
    }
}
