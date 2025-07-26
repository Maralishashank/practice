package operators;
import java.util.Scanner;
public class reloperators {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=s.nextInt();
		System.out.println("enter b value:");
		int b=s.nextInt();
		System.out.println("a==b:"+(a==b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a!=b:"+(a!=b));
		s.close();
	}
}
