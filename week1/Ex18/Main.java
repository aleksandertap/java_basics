package week1.Ex18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int points = sc.nextInt();

        if(points<=60 & points > 49 ){
            System.out.println("Grade: 5");
        } else if (points >= 45) {
            System.out.println("Grade: 4");
        } else if (points >= 40) {
            System.out.println("Grade: 3");
        } else if (points >= 35) {
            System.out.println("Grade: 2");
        } else if (points >= 30) {
            System.out.println("Grade: 1");
        } else {
            System.out.println("Failed!");
        }

    }
}
