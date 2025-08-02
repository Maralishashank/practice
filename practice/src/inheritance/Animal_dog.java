package inheritance;
class Animal{
	public void eat() {
		System.out.println("the animal eats");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("woof! the dog barks");
	}
}
class Labrador extends Dog{
	public void displayColour() {
		System.out.println("the dog colour is brown");
	}
}
public class Animal_dog {
	public static void main(String[] args) {
		Labrador l=new Labrador();
		l.eat();
		l.bark();
		l.displayColour();
	}
}
