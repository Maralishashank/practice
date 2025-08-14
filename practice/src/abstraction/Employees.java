package abstraction;
abstract class Employee{
	int empid;
	String ename;
	float salary;
	Employee(int empid,String ename){
		this.empid=empid;
		this.ename=ename;
	}
	public abstract void calculateSalary();
	public void display() {
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+ename);
		System.out.println("employee salary:"+salary);
	}
}
class Full_time extends Employee{
	int working_days;
	Full_time(int empid,String ename,int working_days){
		super(empid,ename);
		this.working_days=working_days;
	}
	public  void calculateSalary(){
		salary=working_days*1400;
		display();
	}
}
class Part_time extends Employee{
	int per_hr;
	int working_hrs;
	Part_time(int empid,String ename,int working_hrs,int per_hr){
		super(empid,ename);
		this.working_hrs=working_hrs;
		this.per_hr=per_hr;
	}
	public  void calculateSalary(){
		salary=per_hr*working_hrs;
		display();
	}
}
class Freelance extends Employee{
	int no_of_projects;
	int per_project;
	Freelance(int empid,String ename,int no_of_projects,int per_project){
		super(empid,ename);
		this.per_project=per_project;
		this.no_of_projects= no_of_projects;
	}
	public  void calculateSalary(){
		salary= per_project *no_of_projects;;
		display();
	}
}
public class Employees {
	public static void main(String[] args) {
		Employee e=new Full_time(101,"sai",25);
		e.calculateSalary();
		Employee e1=new Part_time(102,"vamshi",80,400);
		e1.calculateSalary();
		Employee e2=new Part_time(103,"shashi",3,15000);
		e2.calculateSalary();
	}
}
