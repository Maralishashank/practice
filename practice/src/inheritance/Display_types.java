package inheritance;
class Vechicle{
	String type="electronic";
	Vechicle(){
		
	}
}
class Car extends Vechicle{
	String type="gas";
	public void displayType() {
		System.out.println("type:"+super.type);
	}
	public void dispalycarType() {
		System.out.println("type:"+type);
	}
}
public class Display_types {
	public static void main(String[] args) {
		Car c=new Car();
		c.displayType();
		c.dispalycarType();
	}
}
