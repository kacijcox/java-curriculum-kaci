package interfaces;

import java.time.DayOfWeek;
import java.util.Scanner;

public class InterfacesLesson {
    public static void main(String[] args) {
        Pond myPond = new Pond("Front Pond", 27.0, "Catfish",true);
        Aquarium myAquarium = new Aquarium("100 Gallon Tank",23.0, "Oscar", "Floating Water Moss");
        Terrarium myTerrarium = new Terrarium("Little Turtle Tank", 27.0, 22.0, "Ornate Box Turtle");

        System.out.println("Welcome to the Aquarium Manager!");
        System.out.println("Here are the current exhibits: ");
        System.out.println(myPond.getDescription());
        if(myPond.isOpen(DayOfWeek.THURSDAY, 3)) {
            System.out.println(myPond.getName() + " is currently open");
        }
        else{
            System.out.println(myPond.getName() + " is currently closed");
        }
        System.out.println(myAquarium.getDescription());
        if(myAquarium.isOpen(DayOfWeek.THURSDAY, 13)) {
            System.out.println(myAquarium.getName() + " is currently open");
        }
        else{
            System.out.println(myAquarium.getName() + " is currently closed");
        }
        System.out.println("The " + myTerrarium.getName() + " houses the " + myTerrarium.getAnimal());
        System.out.println(myTerrarium.getDescription());
        if(myTerrarium.isOpen(DayOfWeek.SATURDAY, 17)){
            System.out.println(myTerrarium.getName() + " is currently open.");
        }
        else {
            System.out.println(myTerrarium.getName() + " is currently closed.");
        }
    }


}


// add implementation of exhibit to terrarium
// getDescription should return
// isOpen() terraium is open everyday except monday 9am - 5pm

// getDescription() should return "The " + getName() + " houses the " + getAnimal()
// isOpen() - Terrarium is open Every day except Monday, 9AM - 5PM