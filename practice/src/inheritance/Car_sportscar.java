package inheritance;
class Vechicle1{
	public void start(boolean a) {
		System.out.println("the vechicle is started:"+a);
	}
}
class Car1 extends Vechicle1{
	public void drive(boolean a) {
		System.out.println("the car is driving:"+a);
	}	
}
class SportsCar extends Car1{
	public void acclerate() {
		System.out.println("the sports car is accelerated");
	}
}
public class Car_sportscar {
	public static void main(String[] args) {
		SportsCar c=new SportsCar();
		c.start(true);
		c.drive(true);
		c.acclerate();
	}
}
