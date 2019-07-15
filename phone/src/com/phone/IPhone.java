package com.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
	public String ring() {
		return (this.getClass().getSimpleName()+ " " + getVersionNumber() + " says " + super.getRingTone());
	}
    @Override
    public String unlock() {
    	return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
    	System.out.println(this.getClass().getSimpleName() + " " + getVersionNumber() + " from " + getCarrier());
    }
}