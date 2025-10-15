package week10.ex31.farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume = 0.0;

    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume(){
        return this.volume;
    }

    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }

    public void addToTank(double amount){
        if (amount > 0) {
            if (amount + volume >= capacity) {
                volume = capacity;
            } else {
                volume += amount;
            }
        }
    }

    public double getFromTank(double amount){
        if (amount < 0) {
            return 0.0;
        }
        if (amount >= volume) {
            amount = volume;
            volume = 0;
            return amount;
        }
        volume -= amount;
        return amount;
    }

    public String toString(){
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}
