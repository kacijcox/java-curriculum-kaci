package interfaces;

import java.time.DayOfWeek;

// create an interface, it must be declared an interface and not a class
public interface Exhibit {
	String getDescription();
	boolean isOpen(DayOfWeek dayOfWeek, int hour);//hour is out of 24
}


