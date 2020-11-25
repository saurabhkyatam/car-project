package manage;

public class Honda extends Vehicle{

	public Honda(String model, String color, String make, int price) {
		super(model, color, make, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Honda [model=" + model + ", color=" + color + ", make=" + make + ", price=" + price + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
