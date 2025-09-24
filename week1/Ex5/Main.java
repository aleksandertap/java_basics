package week1.Ex5;

public class Main {
    public static void main(String[] args) {
        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int days = 365;

        int secondsPerYear = seconds*minutes*hours*days;
        System.out.println("there are "+secondsPerYear+" seconds in a yar");
    }
}
