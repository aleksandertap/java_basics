package week9.ex18.logic;

import week9.ex18.domain.Box;
import week9.ex18.domain.Thing;

import java.util.List;
import java.util.ArrayList;

public class Packer {
    private int boxesVolume;
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<>();
        Box currentBox = new Box(this.boxesVolume);
        boxes.add(currentBox);

        for (Thing thing : things) {

            if (thing.getVolume() > this.boxesVolume) {
                continue;
            }

            boolean added = currentBox.addThing(thing);

            if (!added) {
                Box newBox = new Box(this.boxesVolume);
                newBox.addThing(thing);
                currentBox = newBox;
                boxes.add(newBox);
            }
        }
        return boxes;
    }
}
