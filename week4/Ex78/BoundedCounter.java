package week4.Ex78;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value=0;
        this.upperLimit=upperLimit;
    }

    public void next(){
        this.value++;
        if(this.value>upperLimit){
            this.value=0;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if(value>0 && !(value>upperLimit)){
            this.value = value;
        }
    }


    public String toString(){
        if(this.value<10){
            return "0"+this.value;
        }
        return ""+this.value;
    }
}
