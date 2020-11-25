package manage;

public class Vehicle {
	
	String model,color,make;
	int price;
	
	public Vehicle(String model, String color, String make, int price) {
		super();
		this.model = model;
		this.color = color;
		this.make = make;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", color=" + color + ", make=" + make + ", price=" + price + "]";
	}
	
	

}
