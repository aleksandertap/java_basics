package week4.Ex75;

public class DecreasingCounter {
    private int value;
    private int startValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.startValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    // 75.1 and 75.2
    public void decrease(){
        if (this.value > 0) {
            this.value--;
        }
    }

    //75.3
    public void reset(){
        this.value = 0;
    }

    //75.4
    public void setInitial(){
        this.value = startValue;
    }
}
