package inheritance;
class Person{
	String name;
	String address;
	Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("name:"+name);
		System.out.println("address:"+address);
	}
}
class Student1 extends Person{
	int roll_num;
	Student1(){
		super("shashank","hyderbad");
		roll_num=2134;
	}
	public void displaystudentInfo(){
		System.out.println("roll_num:"+roll_num);	
	}
}
public class Student_info {
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.displayInfo();
		s.displaystudentInfo();
	}
}
