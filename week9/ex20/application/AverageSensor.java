package week9.ex20.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    List<Sensor> sensors = new ArrayList<Sensor>();
    List<Integer> readings = new ArrayList<Integer>();

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }


    @Override
    public boolean isOn() {
       for (Sensor sensor : sensors) {
           if (!sensor.isOn()) {
               return false;
           }
       }
       return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if(isOn() == false){
            throw new IllegalStateException("Average sensor must be on.");
        }

        if(sensors.isEmpty()){
            throw new IllegalStateException("Average sensor must have at least one sensor.");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }
        int measurement = sum / sensors.size();
        readings.add(measurement);

        return sum / sensors.size();
    }

    public List<Integer> readings(){
        return readings;
    }
}
