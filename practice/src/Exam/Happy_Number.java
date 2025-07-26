package Exam;
import java.util.Scanner;
public class Happy_Number {
	public void square(int n) {
		int sum=0;
		while(n>0) {
			int a=n%10;
			sum+=Math.pow(a, 2);
			n/=10;	
		}			
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num:");
		int n=s.nextInt();
		
		
		
		
			
			
		}
	}

