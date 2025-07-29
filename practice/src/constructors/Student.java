package constructors;
public class Student {
	private String name;
	private int age;
	private double gpa;
	Student(String a,int b,double c){
		name=a;
		age=b;
		gpa=c;
	}
	Student(String d,int e){
		name=d;
		age=e;
		gpa=0.0;
	}
	public void displayGpa() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("gpa:"+gpa);
	}
	public static void main(String[] args) {
		Student s=new Student("shashi",21,9.8);
		s.displayGpa();
		Student s1=new Student("shashi",21);
		s1.displayGpa();
	}

}
