package week9.ex17;

import week9.ex17.logic.ApplicationLogic;
import week9.ex17.ui.TextUserInterface;
import week9.ex17.ui.UserInterface;


public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
