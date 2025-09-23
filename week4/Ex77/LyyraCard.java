package week4.Ex77;

public class LyyraCard {
    private double balance;
    private double maxBalance;

    //77.1
    public LyyraCard(double balance) {
        this.balance = balance;
        this.maxBalance = 150;
    }

    public String toString() {
        return "This card has " + this.balance + " euros";
    }

    //77.2 and 77.3
    public void payEconomical() {
        double price = 2.50;
        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void payGourmet() {
        double price = 4.00;
        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    //77.4 and 77.5
    public void loadMoney(double amount) {
        if(amount > 0){
            this.balance += amount;
            if (this.balance >= maxBalance) {
                this.balance = maxBalance;
            }
        }
    }

}
