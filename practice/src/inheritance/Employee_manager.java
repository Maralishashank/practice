package inheritance;
class Person1{
	String name;
	Person1(String name){
		this.name=name;
	}
	public void displayInfo() {
		System.out.println("name:"+name);
	}
}
class employee1 extends Person1{
	int salary;
	employee1(String name,int salary){
		super(name);
		this.salary=salary;
	}
	public void displaySalary() {
		System.out.println("salary:"+salary);
	}	
}
class Manager extends employee1{
	String department;
	Manager(String name,int salary,String department){
		super(name,salary);
		this.department=department;
	}
	public void displayDepartment() {
		System.out.println("department:"+department);
	}
}
public class Employee_manager {
	public static void main(String[] args) {
		Manager m=new Manager("shashi",60000,"hr");
		m.displayInfo();
		m.displaySalary();
		m.displayDepartment();
	}
}
