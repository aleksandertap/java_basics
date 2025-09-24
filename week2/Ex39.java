package week2;

public class Ex39 {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printStars(int amount){
        for(int i=0;i<amount;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int sideSize){
        for(int i=0;i<sideSize;i++){
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++) { // Loop for rows (height)
            printStars(width);
        }
    }

    public static void printTriangle(int size){
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
