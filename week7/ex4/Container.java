package week7.ex4;

import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int newTotalWeight = this.totalWeight() + suitcase.totalWeight();
        if(newTotalWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        String suitcaseWord = (this.suitcases.size() == 1) ? "suitcase" : "suitcases";

        return this.suitcases.size() + " " + suitcaseWord + " (" + this.totalWeight() + " kg)";
    }

    public void printThings(){
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
}
