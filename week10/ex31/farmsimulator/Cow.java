package week10.ex31.farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable {

    private String name;
    private Random random = new Random();
    private double capacity = 15 + random.nextInt(26); 
    private double amount;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};


    public Cow(){
        this.name = NAMES[random.nextInt(NAMES.length)];
    }

    public Cow(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return amount;
    }

    public String toString(){
        return name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }

    @Override
    public void liveHour() {
        double randomValue = 0.7 + (2.0 - 0.7) * random.nextDouble();
        if (amount + randomValue >= capacity) {
            amount = capacity;
        } else {
            amount += randomValue;
        }
    }

    @Override
    public double milk() {
        double toBeReturned = amount;
        amount = 0;
        return toBeReturned;
    }
}
