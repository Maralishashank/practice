package constructors;
class Person1{
	String name;
	long mobile;	
	Person1(String name,long mobile){
		this.name=name;
		this.mobile=mobile;
	}
}
class employee extends Person1{
	private int salary;
	employee(){
		super("shashi",630551600);
		salary=60000;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void displaySalary() {
		System.out.println("the salary is:"+salary);
	}	
}
public class Super {
	public static void main(String[] args) {
		employee s=new employee();
		s.displaySalary();
	}

}
