package polymorphism;
class employee{
	long salary;
	String name;
	int id;
	employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	public void calculateSalary(long a) {
		salary=a;
		System.out.println("the salary is:"+a);
	}
}
class Manager extends employee{
	Manager(String name,int id){
		super(name,id);
	}
	public void calculateSalary(long a) {
		long per_day=a;
		long working_days=45;
		salary=per_day*working_days;
		System.out.println("the Manager salary is:"+salary);
	}
}
class developer extends employee{
	developer(String name,int id){
		super(name,id);
	}
	public void calculateSalary(long a) {
		long monthly=30;
		salary=a*monthly;
		System.out.println("the developer salary is:"+salary);
	}
}
class intern extends employee{
	intern(String name,int id){
		super(name,id);
	}
	public void calculateSalary(long a) {
		long project_based=a;
		salary=project_based;
		System.out.println("the intern salary is:"+salary);
	}
}
public class Salary {
	public static void main(String[] args) {
		employee e;
		e=new Manager("shashank",1);
		System.out.println("name:"+e.name);
		System.out.println("id:"+e.id);
		e.calculateSalary(1400);
		e=new developer("shashi",2);
		System.out.println("name:"+e.name);
		System.out.println("id:"+e.id);
		e.calculateSalary(1600);
		e=new intern("sai",3);
		System.out.println("name:"+e.name);
		System.out.println("id:"+e.id);
		e.calculateSalary(15000);
	}
}
