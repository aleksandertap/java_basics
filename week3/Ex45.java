package week3;

public class Ex45 {
    public static void main(String[] args) {
        int answer =  greatest(9, 9, 9);
        System.out.println("Greatest: " + answer);
    }
    public static int greatest(int a, int b, int c){
        int greatest = a;
        if (b > greatest){
            greatest = b;
        }
        if (c > greatest){
            greatest = c;
        }

        return greatest;
    }
}
