package polymorphism;
class animal{
	public void sound() {
		System.out.println("the animal makes a sound");
	}
}
class Dog extends animal{
	public void sound() {
		System.out.println("the dog makes a sound woof!");
	}
}
class Cat extends animal{
	public void sound() {
		System.out.println("the cat makes a sound meow!");
	}
}
class Cow extends animal{
	public void sound() {
		System.out.println("the cow makes a sound moo!");
	}
}
public class Animals {
	public static void main(String[] args) {
		animal a;
		a=new Dog();
		a.sound();
		a=new Cat();
		a.sound();
		a=new Cow();
		a.sound();
	}
}
