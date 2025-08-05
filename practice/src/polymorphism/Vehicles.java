package polymorphism;
class vehicle{
	public void start() {
		System.out.println("the vehicl is started");	
	}
}
class Car extends vehicle{
	public void start() {
		System.out.println("the car is started");	
	}
}
class Bike extends vehicle{
	public void start() {
		System.out.println("the bike is started");	
	}
}
class Truck extends vehicle{
	public void start() {
		System.out.println("the truck is started");	
	}
}

public class Vehicles {
	public static void main(String[] args) {
		vehicle v;
		v=new vehicle();
		v.start();
		v=new Car();
		v.start();
		v=new Bike();
		v.start();
		v=new Truck();
		v.start();
	}
}
