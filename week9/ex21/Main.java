package week9.ex21;

public class Main {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("src/week9/ex21/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
