package OOPsConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();

		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking(); // individual
		b.engine();
		

		BMW.speed();
		Car.speed();

		Car c = new Car( "Lightning", 100, "Green", "Ring1");
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("properties " + c.name + " " + c.color + " " + c.model + " " + c.price );


//		 child class object can be referred by parent class ref variable
//		 top casting
		
		Car c1 = new BMW() ;  
		c1.start();
		c1.stop();
		c1.refuel();
		// c1.autoParking();//ref type check

		// child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();

		// down casting:
//		BMW b1 = (BMW)new Car();//ClassCastException
//		b1.start();

		// BMW b2 = (BMW)new Vehicle();//ClassCastException

		Audi a = new Audi();
		
		a.stop();
		a.start();
		a.refuel();
		a.theftSafety();
		a.engine();
	}

}
