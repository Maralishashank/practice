package conditional;
import java.util.Scanner;
public class divisible {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("enter the value: ");
		int a=c.nextInt();
		if((a%4)==0 && (a%100)==0) {
			System.out.println("the given "+a+" value is divisible by 4 and 100");
		}
		else
		{
			System.out.println("the given "+a+" value is not divisible by 4 and 100");
		}
		c.close();

	}

}
