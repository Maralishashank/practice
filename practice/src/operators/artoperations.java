package operators;
import java.util.Scanner;
public class artoperations {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st number:");
		long a=s.nextLong();
		System.out.println("enter 2nd number:");
		long b=s.nextLong();
		System.out.println("the addition of two numbers is:"+(a+b));
		System.out.println("the subtract of two numbers is:"+(a-b));
		System.out.println("the division of two numbers is:"+(a/b));
		System.out.println("the remainder of two numbers is:"+(a%b));
		s.close();
	}
}
