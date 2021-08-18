package com.jonathanlee.phone;

public class Galaxy extends Phone implements Ringable, Jonathan {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	return "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone();
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        // your code here
    	System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier()); 
    }
    @Override
    public boolean life() {
    	return false;
    }
}
