package week2;

import java.util.Random;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = drawNumber();
        int count = 0;

        while(true){
            count++;
            System.out.print("Guess a number: ");
            int guess = sc.nextInt();
            if (guess > number) {
                System.out.println("the number is lesser, guesses made: " + count);
            } else if (guess < number) {
                System.out.println("the number is greater, guesses made: " + count);
            } else {
                System.out.println("Congratulations, you guess is correct!");
                break;
            }
        }
    }

    public static int drawNumber(){
        return new Random().nextInt(101);
    }
}
