package week5.Ex84;

public class Counter {
    private int number;
    private boolean check;

    public Counter(int startingNumber, boolean check) {
        this.number = startingNumber;
        this.check = check;
    }

    public Counter(int startingNumber) {
        this.number = startingNumber;
        this.check = false;
    }

    public Counter(boolean check) {
        this.number = 0;
        this.check = check;
    }

    public Counter() {
        this.number = 0;
        this.check = false;
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.number++;
    }

    public void decrease() {
        if (this.check) {
            if (this.number > 0) {
                this.number--;
            }
        } else {
            this.number--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.number += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.check) {
                this.number -= decreaseAmount;
                if (this.number < 0) {
                    this.number = 0;
                }
            } else {
                this.number -= decreaseAmount;
            }
        }
    }
}
