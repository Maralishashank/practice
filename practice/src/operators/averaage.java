package operators;
import java.util.Scanner;
public class averaage {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st number:");
		float a=s.nextFloat();
		System.out.println("enter 2nd number:");
		float b=s.nextFloat();
		System.out.println("enter 3rd number:");
		float c=s.nextFloat();
		System.out.println("enter 4th number:");
		float d=s.nextFloat();
		System.out.println("enter 5th number:");
		float e=s.nextFloat();
		float avg=(a+b+c+d+e)/5;
		System.out.println("the average is:"+avg);
		s.close();
	}
}
