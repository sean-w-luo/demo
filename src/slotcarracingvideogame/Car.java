package slotcarracingvideogame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
	   private int rpm;
	    private int gear;
	    private double speed;
	    private int laps;

	    public Car() {
	        this.rpm = 0;
	        this.gear = 1;
	        this.speed = 0.0;
	        this.laps = 0;
	    }

	    public void accelerate() {
	        // Logic to accelerate
	        rpm += 1000;
	        calculateSpeed();
	    }

	    public void brake() {
	        // Logic to brake
	        rpm -= 1000;
	        if (rpm < 0) rpm = 0;
	        calculateSpeed();
	    }

	    public void changeLane(String direction) {
	        // Logic to change lane
	        System.out.println("Changing lane to " + direction);
	    }

	    public void setGear(int gear) {
	        this.gear = gear;
	        calculateSpeed();
	    }

	    public double getSpeed() {
	        return speed;
	    }

	    public int getLaps() {
	        return laps;
	    }

	    public void incrementLaps() {
	        laps++;
	    }

	    private void calculateSpeed() {
	        this.speed = rpm * gear;
	    }
}
