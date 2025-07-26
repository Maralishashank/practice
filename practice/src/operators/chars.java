package operators;
import java.util.Scanner;
public class chars {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st char:");
		char c1=s.next().charAt(0);
		System.out.println("enter 2nd char:");
		char c2=s.next().charAt(0);
		System.out.println("c1==c2:"+(c1==c2));
		System.out.println("c1!=c2:"+(c1!=c2));
		s.close();
	}
}
