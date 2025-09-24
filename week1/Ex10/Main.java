package week1.Ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the radius: ");
        double radius = input.nextDouble();
        double circumference = 2*Math.PI*radius;
        System.out.println("The circumference is: " + circumference);
    }
}
