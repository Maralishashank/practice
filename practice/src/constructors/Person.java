package constructors;
public class Person {
	private static String name;
	private static int age;
	Person(String pname,int page){
		 name=pname;
		 age=page;
	}
	public void Introduce() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);		
	}
	public static void main(String[] args) {
		Person p=new Person("shashi",21);
		p.Introduce();	
	}
}
