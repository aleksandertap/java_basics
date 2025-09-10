package week3;

public class Ex46 {
    public static void main(String[] args) {
        double answer = average(4, 3, 6, -4);
        System.out.println("average: " + answer);
    }
    public static double average(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        return  sum / 4.0;
    }
}
