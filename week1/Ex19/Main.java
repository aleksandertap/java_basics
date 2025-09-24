package week1.Ex19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how old are you?");
        int age = sc.nextInt();

        if(age < 0 || age > 120){
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
