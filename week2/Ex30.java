package week2;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("up to what number? ");
        int start = 1;
        int number = sc.nextInt();
        while(start <= number) {
            System.out.println(start);
            start++;
        }
    }
}
