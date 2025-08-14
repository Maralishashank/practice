package abstraction;
abstract class Vehicle{
	String engine_type;
	Vehicle(String engine_type){
		this.engine_type=engine_type;
	}
	public abstract void startEngine();
	public abstract void stopEngine();
}
class Car extends Vehicle{
	Car(String engine_type){
		super(engine_type);
	}
	public void startEngine() {
		System.out.println("engine type is:"+engine_type);
		System.out.println("the car engine is started");
	}
	public void stopEngine() {
		System.out.println("the car engine is stoped");
		
	}
}
class Truck extends Vehicle{
	Truck(String engine_type){
		super(engine_type);
	}
	public void startEngine() {
		System.out.println("engine type is:"+engine_type);
		System.out.println("the Truck engine is started");
	}
	public void stopEngine() {
		System.out.println("the Truck engine is stoped");
	}
}
class Bike extends Vehicle{
	Bike(String engine_type){
		super(engine_type);
	}
	public void startEngine() {
		System.out.println("engine type is:"+engine_type);
		System.out.println("the bike engine is started");
	}
	public void stopEngine() {
		System.out.println("the bike engine is stoped");
	}
}
public class Vehicles {
	public static void main(String[] args) {
		Vehicle v=new Car("ev engine");
		v.startEngine();
		v.stopEngine();
		Vehicle v1=new Truck("diesel engine");
		v1.startEngine();
		v1.stopEngine();
		Vehicle v2=new Bike("petrol engine");
		v2.startEngine();
		v2.stopEngine();
	}
}
