package conditional;
import java.util.Scanner;
public class evenorodd {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("enter a value:");
		long a=c.nextInt();
		if(a%2==0) {
			System.out.println("the  value is even");
		}
		else {
			System.out.println("the  value is odd");
		}
		c.close();
	}

}
