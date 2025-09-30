package week7.ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i < 100; i++) {
            Suitcase suitcase = new Suitcase(200);
            Thing brick = new Thing("Brick", i);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }

    }
}
