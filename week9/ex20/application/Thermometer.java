package week9.ex20.application;

import java.util.Random;

public class Thermometer implements Sensor {
    private int degrees;
    private boolean powerOn;
    private Random random;
    public Thermometer() {
        this.degrees = 0;
        this.powerOn = false;
        this.random = new Random();
    }
    @Override
    public boolean isOn() {
        return this.powerOn;
    }

    @Override
    public void on() {
        this.powerOn = true;
    }

    @Override
    public void off() {
        this.powerOn = false;
    }

    @Override
    public int measure() {
        if (!this.powerOn) {
            throw new IllegalStateException("Thermometer is off");
        }

        this.degrees = this.random.nextInt(61)-30;
        return this.degrees;
    }
}
