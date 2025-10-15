package week10.ex28.movable;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{

    List<Movable> movables = new ArrayList<Movable>();

    public String toString(){
        String s = "";
        for(Movable movable : movables){
            s += movable + "\n";
        }
        return s;
    }

    public void addToGroup(Movable movable){
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable movable : movables){
            movable.move(dx, dy);
        }
    }
}
