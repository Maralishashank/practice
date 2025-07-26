package control_statements;
import java.util.Scanner;
public class strongnum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num:");
		int n=s.nextInt(),num=n,sum=0,digit=0;
		while(n>0) {
			digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;	
		}
		if(sum==num) {
			System.out.println("it is a strong number");
		}
		else {
			System.out.println("it is not a strong number");
		}
		s.close();
	}

}
