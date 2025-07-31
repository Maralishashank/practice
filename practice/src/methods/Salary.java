package methods;
class employee{
	int empid=101;
	String name="shashi";
	int working_Days=25;
}
class Esalary extends employee{
	int per_day=1400;
	public void display() {
		System.out.println("employe id:"+empid);
		System.out.println("employe name:"+name);
		System.out.println("employe salary:"+(working_Days*per_day));
	}
}
public class Salary {
	public static void main(String[] args) {
		Esalary e=new Esalary();
		e.display();

	}

}
