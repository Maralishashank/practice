package inheritance;
class student{
	int studid=101;
	String name="shashi";
}
class logs extends student{
	int logins=7;
	public void display() {
		System.out.println("student id:"+studid);
		System.out.println("student name:"+name);
		System.out.println("student logins:"+logins);
	}
}
public class Library {
	public static void main(String[] args) {
		logs l=new logs();
		l.display();
	}
}
