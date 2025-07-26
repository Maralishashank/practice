package conditional;
import java.util.Scanner;
public class positve {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		long a=s.nextInt();
		if(a>0) {
			System.out.println("the given value is positive");
		}
		else if(a<0) {
			System.out.println("the given value is negative");
		}
		else if(a==0) {
			System.out.println("the given value is zero");
		}
		s.close();
	}
}
