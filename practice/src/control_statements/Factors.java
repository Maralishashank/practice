package control_statements;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		System.out.println("The prime factors of "+n+" are:");
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				int count=0;
				for(int j=1;j<=i;j++){
					if(i%j==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println(i);
				}
			}
		}
		s.close();
	}

}
