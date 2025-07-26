package control_statements;
import java.util.Scanner;
public class count {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=0,pos_count=0,neg_count=0,zero_count=0;
		String c;
		do {
			System.out.println("enter the digit:");
			n=s.nextInt();
			if(n>0) {
				pos_count++;
			}
			else if(n<0) {
				neg_count++;
			}
			else if(n==0){
				zero_count++;
			}
			System.out.println("continue(y/n):");
			c=s.next();	
		}
		while(c.equals("y"));
		System.out.println("postive count:"+pos_count);
		System.out.println("negative count:"+neg_count);
		System.out.println("zero count:"+zero_count);
		s.close();
	}

}
