package Encapsulation;
class Bulb{
	private boolean isOn;
	Bulb(){
		
	}
	public void turnOn() {
		isOn=true;
	}
	public void turnOff() {
		isOn=false;
	}
	public void isOn() {
		System.out.println("the bulb ison:"+isOn);
	}
}
public class Bulb_on_and_off {
	public static void main(String[] args) {
		Bulb b=new Bulb();
		b.isOn();
		b.turnOn();
		b.isOn();
		b.turnOff();
		b.isOn();
	}
}
