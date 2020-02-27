package com.tshirt;

public class Test {

	public static void main(String[] args) {
		//parent
		System.out.println("A tshirt has been created...");
		Tshirt tshirt1 = new Tshirt("Uniqlo", 30.5, 20, "Medium", "Blue");
		System.out.println("Brand: " + tshirt1.getBrand());
		System.out.println("Width: " + tshirt1.getWidth());
		System.out.println("Length: " + tshirt1.getLength());
		System.out.println("Size: " + tshirt1.getSize());
		System.out.println("Color: " + tshirt1.getColor());
		tshirt1.toGiveComfort(100);
		System.out.println();
		
		System.out.println("A tshirt has been created...");
		Tshirt tshirt2 = new Tshirt("H&M", 33.75, 22, "Large", "White");
		System.out.println("Brand: " + tshirt2.getBrand());
		System.out.println("Width: " + tshirt2.getWidth());
		System.out.println("Length: " + tshirt2.getLength());
		System.out.println("Size: " + tshirt2.getSize());
		System.out.println("Color: " + tshirt2.getColor());
		tshirt2.toGiveComfort(50);
		System.out.println();
		
		//child
		System.out.println("Polo shirt has been created...");
		PoloShirt ps1 = new PoloShirt("Penshoppe", 28.75, 18, "Small", "Beige", 4, 4.5);
		System.out.println("Brand: " + ps1.getBrand());
		System.out.println("Width: " + ps1.getWidth());
		System.out.println("Length: " + ps1.getLength());
		System.out.println("Size: " + ps1.getSize());
		System.out.println("Color: " + ps1.getColor());
		System.out.println("Number of buttons: " + ps1.getButtons());
		System.out.println("Length of collar: " + ps1.getCollarLength());
		ps1.toCoverNeck("half");
		System.out.println();
		
		System.out.println("Polo shirt has been created...");
		PoloShirt ps2 = new PoloShirt("H&M", 33.75, 22, "Large", "Black", 4, 5.3);
		System.out.println("Brand: " + ps2.getBrand());
		System.out.println("Width: " + ps2.getWidth());
		System.out.println("Length: " + ps2.getLength());
		System.out.println("Size: " + ps2.getSize());
		System.out.println("Color: " + ps2.getColor());
		System.out.println("Number of buttons: " + ps2.getButtons());
		System.out.println("Length of collar: " + ps2.getCollarLength());
		ps2.toCoverNeck("whole");
		System.out.println();
		

	}

}
