package week2;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Up to what? ");
        int number = sc.nextInt();
        int sum = 0;
        int start = 1;
        while(start <= number) {
            sum += start;
            start++;
        }
        System.out.println("Sum is: " + sum);
    }
}
