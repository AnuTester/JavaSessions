package OOPsConcept;

public class Car extends Vehicle {
	String name;
	int price;
	String color;
	String model;
	
	static final int wheels = 4;
	
	public static void speed() {
		System.out.println("Car -- speed");
	}
	
	private void price() {
		System.out.println("car price");
	}

	public void start() {
		System.out.println("Car -- start");
		price();
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	@Override
	public void engine() {
		System.out.println("car -- engine");
	
}
	public Car() {
		System.out.println("car -- constructor 1");

	}
	
	public Car(String name, int price, String color, String model) {
		System.out.println("car -- constructor 2");

		this.name = name;
		this.price = price;
		this.color = color;
		this.model = model;
	}

	public Car(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Car(String name, String model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}
}

