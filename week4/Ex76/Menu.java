package week4.Ex76;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu(){
        this.meals = new ArrayList<>();
    }

    //76.1
    public void addMeal(String meal){
        this.meals.add(meal);
    }

    //76.2
    public void printMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }

    //76.3
    public void clearMenu(){
        this.meals.clear();
    }
}
