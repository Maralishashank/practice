package Encapsulation;
class Dog{
	private String name;
	private String breed;
	Dog(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void bark() {
		System.out.println("Woof! my name is "+name);
	}
}
public class Dog_breed {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("chimtu");
		d.setBreed("golden retriver");
		d.bark();
	}
}
