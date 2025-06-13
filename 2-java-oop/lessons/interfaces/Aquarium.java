
package interfaces;

import java.time.DayOfWeek;

public class Aquarium implements Exhibit {
    private String name;
    private double temperature;
    private String fish;
    private String plant;

    public Aquarium(String name, double temperature, String fish, String plant) {
        this.name = name;
        this.temperature = temperature;
        this.fish = fish;
        this.plant = plant;
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

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    @Override
    public String toString() {
        return "Aquarium{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", fish='" + fish + '\'' +
                ", plant='" + plant + '\'' +
                '}';
    }

    @Override
    public String getDescription() {
        return ("The " + getName() +" houses the " + getFish() + " and " + getPlant());
    }

    @Override
    public boolean isOpen(DayOfWeek dayOfWeek, int hour) {

        //aquarium is oopen from 9am-5pm on friday say and sun
        if((dayOfWeek == DayOfWeek.FRIDAY) || (dayOfWeek == DayOfWeek.SATURDAY) || (dayOfWeek == DayOfWeek.SUNDAY)) {
            if(hour  > 8 && hour < 17) {
                return true;
            }
        }
        return false;
    }
}