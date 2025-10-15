package week10.ex31.farmsimulator;

public class MilkingRobot extends BulkTank{
    private BulkTank tank;

    public MilkingRobot(){
        this.tank = null;
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }

    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }

    public void milk(Milkable milkable){
        if (tank == null) {
            throw new IllegalStateException("The milking robot has not been installed");
        } else {
            double toBeAdded = milkable.milk();
            tank.addToTank(toBeAdded);
        }
    }
}
