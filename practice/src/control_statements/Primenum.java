package control_statements;
import java.util.Scanner;
public class Primenum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int n=s.nextInt(),count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
        if(count==2) {
			System.out.println("it is a prime number");
		}
        else {
        	System.out.println("it is not a prime number");
        }
        s.close();
	}
}
