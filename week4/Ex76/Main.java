package week4.Ex76;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Menu menu = new Menu();
       menu.addMeal("dogs");
       menu.addMeal("cats");
       menu.addMeal("chickens");


       menu.clearMenu();
       menu.addMeal("something");
       menu.printMeals();

    }
}
