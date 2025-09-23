package week5.Ex87;

import static java.lang.Math.abs;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    //87.1
    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }

    //87.2
    public int priceDifference(Apartment otherApartment){
        return abs(this.squareMeters * this.pricePerSquareMeter - otherApartment.squareMeters *  otherApartment.pricePerSquareMeter);
    }

    //87.3
    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.squareMeters *  this.pricePerSquareMeter > otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
    }
}
