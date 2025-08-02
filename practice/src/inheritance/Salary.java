package inheritance;
class employee{
	int empid;
	String empname;
	int working_days;
	employee(int empid,String empname,int working_days ){
		this.empid=empid;
		this.empname=empname;
		this.working_days=working_days;
	}
}
class working extends employee{
	int per_day=1400;
	int salary;
	working(){
		super(101,"shashi",26);
		salary=per_day*working_days;
	}
	public void display() {
		System.out.println("empid:"+empid);
		System.out.println("emname:"+empname);
		System.out.println("salary:"+salary);
	}
}
public class Salary {
	public static void main(String[] args) {
		working w=new working();
		w.display();
	}
}
