package polymorphism;
public class Student {
	String name;
	int roll_no;
	int marks;
	Student(String name,int roll_no){
		this.name=name;
		this.roll_no=roll_no;
	}
	Student(String name,int roll_no,int marks){
		this.name=name;
		this.roll_no=roll_no;
		this.marks=marks;		
	}
	public static void main(String[] args) {
		Student s=new Student("shashi",23);
		System.out.println("name:"+s.name);
		System.out.println("roll_no:"+s.roll_no);
		Student s1=new Student("shashi",23,90);
		System.out.println("name:"+s1.name);
		System.out.println("roll_no:"+s1.roll_no);
		System.out.println("marks:"+s1.marks);
	}
}
