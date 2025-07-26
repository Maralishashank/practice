package control_statements;
import java.util.Scanner;
public class count_digits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		long num=s.nextLong(),count=0;
		if(num==0) {
			count=1;
		}
		else {
			while(num>0) {
				num=num/10;
				count++;
			}
		}
		System.out.println("Number of digits:"+count);
		s.close();
	}

}
