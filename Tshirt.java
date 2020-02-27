package com.tshirt;

public class Tshirt  {
	private String brand;
	private double width;
	private int length;
	private String size;
	private String color;
	
	public Tshirt(String brand, double width, int length, String size, String color) {
		this.brand = brand;
		this.width = width;
		this.length = length;
		this.size = size;
		this.color = color;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public double getWidth() {
		return this.width;
	}
	public int getLength() {
		return this.length;
	}
	public String getSize() {
		return this.size;
	}
	public String getColor() {
		return this.color;
	}
	
	public void toGiveComfort(int comfort) {
		System.out.println("This tshirt gives " + comfort + " percent comfort.");
	}
}
