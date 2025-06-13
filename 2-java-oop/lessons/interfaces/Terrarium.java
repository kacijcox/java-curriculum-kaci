package interfaces;

import java.sql.SQLOutput;
import java.time.DayOfWeek;

public class Terrarium implements Exhibit {

    private String name;
    private double airTemperature;
    private double waterTemperature;
    private String animal;

    public Terrarium(String name, double airTemperature, double waterTemperature, String animal) {
        this.name = name;
        this.airTemperature = airTemperature;
        this.waterTemperature = waterTemperature;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(double airTemperature) {
        this.airTemperature = airTemperature;
    }

    public double getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(double waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Terrarium{" +
                "name='" + name + '\'' +
                ", airTemperature=" + airTemperature +
                ", waterTemperature=" + waterTemperature +
                ", animal='" + animal + '\'' +
                '}';

    }
    @Override
    public String getDescription() {
        return ("The " + getName() +" houses the " + getAnimal());
    }

    @Override
    public boolean isOpen(DayOfWeek dayOfWeek, int hour) {

        //aquarium is oopen from 9am-5pm on friday say and sun
        if(dayOfWeek == DayOfWeek.SATURDAY) {
            if(hour  > 8 && hour < 17) {
                return true;
            }
        }
        return false;
    }

}
