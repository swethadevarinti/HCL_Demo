class Vehicle{
	public void start() {
		System.out.println("Starting a vehicle");
	}
	public void stop() {
		System.out.println("Stoping a vehicle");
	}
}

class Car extends Vehicle{
	public void start() {
		System.out.println("Starting a car");
	}
	public void stop() {
		System.out.println("Stoping a Car");
	}
}
class Bus extends Vehicle{
	public void start() {
		System.out.println("Starting a Bus");
	}
	public void stop() {
		System.out.println("Stoping a Bus");
	}
}


public class LiskovEx {
	
	static void testDrive(Vehicle vehicle) {
		vehicle.start();
		vehicle.stop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testDrive(new Car());
		testDrive(new Bus());

		
	}
}
