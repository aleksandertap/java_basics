package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        while(true){
            int number = sc.nextInt();
            if(number == -1){
                System.out.println("Thank you and see you later!");
                break;
            }
            if(number % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
            sum += number;
            count++;
        }
        if(count > 0){
            double average = (double) sum/count;
            System.out.println("The sum is: " + sum);
            System.out.println("How many numbers: " + count);
            System.out.println("Average: " + average);
            System.out.println("Even numbers: "+ evenCount);
            System.out.println("Odd numbers: " + oddCount);
        }

    }
}
