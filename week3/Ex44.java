package week3;

public class Ex44 {
    public static void main(String[] args) {
        int answer =  least(10, 9);
        System.out.println("Least: " + answer);
    }
    public static int least(int num1,int num2){
        int least;
        if(num1<num2){
            least=num1;
        } else {
            least=num2;
        }
        return least;
    }
}
