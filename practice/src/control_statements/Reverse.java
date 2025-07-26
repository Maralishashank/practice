package control_statements;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt(),rev=0,digit=0,num=n;
		while(n!=0) {
			digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		if(rev==num) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}	
		s.close();
	}

}
