package week9.ex18.domain;


import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private List<Thing> items;
    private int maxCap;
    public Box(int maxCapacity) {
        this.items = new ArrayList<>();
        this.maxCap = maxCapacity;
    }

    public boolean addThing(Thing thing){
        int newTotalVolume = this.getVolume() + thing.getVolume();

        if (newTotalVolume <= this.maxCap) {
            this.items.add(thing);
            return true;
        }

        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : this.items) {
            volume += thing.getVolume();
        }
        return volume;
    }
}
