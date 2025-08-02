package constructors;
class Person1{
	String name;
	long mobile;	
	private int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	Person1(String name,long mobile,int salary){
		this.name=name;
		this.mobile=mobile;
		this.salary = salary;
	}
}
class employee extends Person1{
	employee(){
		super("shashi",630551600,60000);
	}
	public void displaySalary() {
		System.out.println("the salary is:"+getSalary());
	}	
}
public class Super {
	public static void main(String[] args) {
		employee s=new employee();
		s.displaySalary();
	}

}
