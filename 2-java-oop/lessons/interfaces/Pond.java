package interfaces;

import java.time.DayOfWeek;

// keyword implements is followed by any interface that this class will use
public class Pond implements Exhibit{
    private String name;
    private double temperature;
    private String fish;
    private boolean hasFountain;

    public Pond(String name, double temperature, String fish, boolean hasFountain) {
        this.name = name;
        this.temperature = temperature;
        this.fish = fish;
        this.hasFountain = hasFountain;
    }

    @Override
    public String getDescription() {
        return "The" + getName() + "houses the" + getFish();
    }

    @Override
    public boolean isOpen(DayOfWeek dayOfWeek, int hour) {
        // pond is open every day of the week but closes from midnight to 6am
        return hour > 6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public boolean isHasFountain() {
        return hasFountain;
    }

    public void setHasFountain(boolean hasFountain) {
        this.hasFountain = hasFountain;
    }

    @Override
    public String toString() {
        return "Pond{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", fish='" + fish + '\'' +
                ", hasFountain=" + hasFountain +
                '}';
    }
}
