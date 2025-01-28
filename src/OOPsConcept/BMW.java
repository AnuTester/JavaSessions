package OOPsConcept;

public class BMW extends Car{
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	private void price() {
		System.out.println("BMW price");
	}
	
	//method hiding
	public static void speed() {
		System.out.println("BMW -- speed");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}


}
