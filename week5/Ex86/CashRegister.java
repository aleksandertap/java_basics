package week5.Ex86;

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister(){
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven){
        double price = 2.50;
        if(cashGiven >= price){
            this.cashInRegister += price;
            this.economicalSold ++;
            return  cashGiven - price;
        }
        return  cashGiven;
    }

    public double payGourmet(double cashGiven){
        double price = 4.00;
        if(cashGiven >= price){
            this.cashInRegister += price;
            this.gourmetSold ++;
            return  cashGiven - price;
        }
        return  cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double price = 2.50;
        if(card.balance() >= price){
            card.pay(price);
            this.economicalSold ++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double price = 4.00;
        if(card.balance() >= price){
            card.pay(price);
            this.gourmetSold ++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0){
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }


    public String toString(){
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
