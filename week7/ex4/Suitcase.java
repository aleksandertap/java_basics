package week7.ex4;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        int totalWeight = this.totalWeight() + thing.getWeight();
        if (totalWeight <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight(){
        int weight =  0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        if(this.things.isEmpty()) {
            return null;
        }
        Thing heaviest = this.things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }

    public String toString() {
        switch (this.things.size()) {
            case 0:
                return "empty (" + this.totalWeight() + " kg)";
            case 1:
                return this.things.size() + " thing (" + this.totalWeight() + " kg)";
            default:
                return this.things.size() + " things (" + this.totalWeight() + " kg)";
        }
    }

}
