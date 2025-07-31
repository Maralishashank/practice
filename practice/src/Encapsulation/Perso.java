package Encapsulation;
class Person{
	private String name;
	private int age;
	Person(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;	
	}
	public void setAge(int age) {
		if(age>=0) {
			this.age=age;
		}
		else if(age<0) {
			this.age=0;
		}
	}	
}

public class Perso {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("shashi");
		p.setAge(20);
		System.out.println("the age is:"+p.getAge());
		p.setAge(-20);
		System.out.println("the age is :"+p.getAge());
	}
}
