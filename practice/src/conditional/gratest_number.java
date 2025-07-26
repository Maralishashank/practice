package conditional;
import java.util.Scanner;
public class gratest_number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Input the 1st number:");
		long a=s.nextInt();
		System.out.println("Input the 2nd number:");
		long b=s.nextInt();
		System.out.println("Input the 3rd number:");
		long c=s.nextInt();
		long val=(a>b)?((a>c)?a:c):(b>c)?b:c;
		System.out.println("the greatest:"+val);
		s.close();	
	}
}
