package com.tshirt;

public class PoloShirt extends Tshirt {
	int buttons;
	double collarLength;
	
	public PoloShirt(String brand, double width, int length, String size, String color, int buttons, double collarLength) {
		super(brand, width, length, size, color);
		this.buttons = buttons;
		this.collarLength = collarLength;
	}
	
	//setters
	public void setButtons(int buttons) {
		this.buttons = buttons;
	}
	public void setCollarLength(double collarLength) {
		this.collarLength = collarLength;
	}
	
	//getters
	public int getButtons() {
		return this.buttons;
	}
	public double getCollarLength() {
		return this.collarLength;
	}
	
	public void toCoverNeck(String cover) {
		System.out.println("The collar covers " + cover + " of the neck.");
	}
		
	

}
