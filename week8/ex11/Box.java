package week8.ex11;

import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> contents;
    private int numberOfItems;

    public Box(double maxWeght) {
        this.maxWeight = maxWeght;
        this.contents = new ArrayList<ToBeStored>();
        this.numberOfItems = 0;
    }

    public double weight() {
        double totalWeight = 0;
        for (ToBeStored item : this.contents) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    public void add(ToBeStored item) {
        double newTotalWeight = this.weight() + item.weight();

        if (newTotalWeight <= this.maxWeight) {
            this.contents.add(item);
            this.numberOfItems++;
        }
    }


    public String toString() {
        return "Box: " + this.numberOfItems + " things, total weight " + this.weight() + " kg";
    }
}
